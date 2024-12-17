import os
import unittest
import subprocess
import sys


def file_abspath(path: str) -> str:
    return os.path.join(os.path.dirname(__file__), path)


def java_expect_output(self: unittest.TestCase, jar_path: str, expected_path: str, encoding: str | None = None) -> None:
    try:
        self.maxDiff = 4000
        expected_path = file_abspath(expected_path)
        jar_path = file_abspath(jar_path)
        with open(expected_path, encoding=encoding) as f:
            expected_output = f.read()

        env = os.environ.copy()
        env['CI'] = str(True).lower()

        result = subprocess.run(['java', '-jar', jar_path], env=env,
                                capture_output=True, text=True, check=True)
        result = result.stdout.replace('\r\n', '\n')
        self.assertEqual(result, expected_output, 'actual output does not match expected')
    except FileNotFoundError:
        print(f'Error: Expected file {expected_path!r} not found.')
        sys.exit(1)
    except subprocess.CalledProcessError as e:
        print(f'Error: Java execution failed: {e}')
        sys.exit(1)


class TestOutput(unittest.TestCase):
    def test_extraLarge(self) -> None:
        java_expect_output(self, jar_path='../extraLarge.jar', expected_path='./extraLarge.txt',
                           encoding='utf-8')

    def test_goddrinksjava(self) -> None:
        java_expect_output(self, jar_path='../goddrinksjava.jar', expected_path='./goddrinksjava.txt',
                           encoding='utf-8')


if __name__ == "__main__":
    unittest.main()
