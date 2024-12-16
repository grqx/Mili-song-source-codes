import os

def rename_files(directory: str, suffix: str = '.disabled') -> int:
    cnt = 0
    for root, _, files in os.walk(directory):
        for file in files:
            old_path = os.path.join(root, file)
            new_path = os.path.join(root, file.removesuffix(suffix) if file.endswith(suffix) else f'{file}{suffix}')
            try:
                os.rename(old_path, new_path)
                print(f'Renamed: {old_path!r} -> {new_path!r}')
            except Exception as e:
                print(f"Failed to rename {old_path!r}: {e!r}")

def main() -> None:
    media_dir = os.path.join(os.path.dirname(__file__), '../media/')
    if not os.path.isdir(media_dir):
        print(f'Directory does not exist: {media_dir!r}')
        return
    rename_files(media_dir)

if __name__ == '__main__':
    main()
