@echo off
cd /d "%~dp0"
setlocal enabledelayedexpansion

set "PROJECT_NAME=extraLarge"
set "MAIN_CLASS=extraLarge.sustainPlusPlus"
@REM for /r "src\music_player" %%f in (*.java) do (
@REM     set "EXTRA_DEPS_SRC=!EXTRA_DEPS_SRC! %%f"
@REM )

call "devscripts\build_jar.cmd"
endlocal
