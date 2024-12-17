import json
import re
import sys


def calculate_diff_list(lst):
    """
    Given a list `lst` with length n, return a diff list of length n-1
    where diff_list[i] = lst[i + 1] - lst[i]
    """
    return [lst[i] - lst[i - 1] if i != 0 else lst[i] for i in range(len(lst))]


def parse_webvtt(file_content):
    timestamp_pattern = re.compile(
        r'(\d{2}):(\d{2}):(\d{2})\.(\d{3})\s-->\s(\d{2}):(\d{2}):(\d{2})\.(\d{3})')
    timestamps = []
    for line in file_content.splitlines():
        matches = timestamp_pattern.findall(line)
        if matches:
            for match in matches:
                hours, minutes, seconds, milliseconds, _, _, _, _ = map(
                    int, match)
                total_milliseconds = (
                    hours * 3600 + minutes * 60 + seconds) * 1000 + milliseconds
                timestamps.append(total_milliseconds)

    return timestamps


def main():
    webvtt_input = ''
    for line in sys.stdin:
        webvtt_input += line
    timestamps = parse_webvtt(webvtt_input)
    print(json.dumps(timestamps))
    print(json.dumps(calculate_diff_list(timestamps)))


if __name__ == '__main__':
    main()
