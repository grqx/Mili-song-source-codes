import os
import sys


def rename_files(directory: str, toggle_to: bool | None = None, suffix: str = '.disabled') -> int:
    print('toggle_to:', toggle_to)
    cnt = 0
    for root, _, files in os.walk(directory):
        for file in files:
            old_path = os.path.join(root, file)
            new_filename = file
            if toggle_to is None:
                new_filename = file.removesuffix(suffix) if file.endswith(
                    suffix) else f'{file}{suffix}'
            elif toggle_to is True:
                new_filename = file.removesuffix(suffix)
            elif toggle_to is False:
                new_filename = f'{file}{suffix}' if not file.endswith(
                    suffix) else new_filename
            new_path = os.path.join(root, new_filename)
            if old_path != new_path:
                try:
                    os.rename(old_path, new_path)
                except Exception as e:
                    print(f"Failed to rename {old_path!r}: {e!r}")
                else:
                    cnt += 1
                    print(f'Renamed: {old_path!r} -> {new_path!r}')
    return cnt


def parse_toggle_to(s: str) -> bool | None:
    s_lower = s.lower()
    if s_lower in ['1', 'true', 'enable', 'on']:
        return True
    elif s_lower in ['0', 'false', 'disable', 'off']:
        return False
    return None


def main() -> None:
    media_dir = os.path.join(os.path.dirname(__file__), '../resources/')
    if not os.path.isdir(media_dir):
        print(f'Directory does not exist: {media_dir!r}')
        return
    cnt = rename_files(media_dir, toggle_to=parse_toggle_to(
        sys.argv[1]) if len(sys.argv) > 1 else None)
    print(f'Renamed {cnt} files')


if __name__ == '__main__':
    main()
