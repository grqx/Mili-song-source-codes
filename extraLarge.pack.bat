@echo off
cd /d "%~dp0"
setlocal enabledelayedexpansion

set "PROJECT_NAME=extraLarge"
set "MAIN_CLASS=extraLarge.sustainPlusPlus"
for /r "src\music_player" %%f in (*.java) do (
    set "EXTRA_DEPS_SRC=!EXTRA_DEPS_SRC! %%f"
)
set "RSRC=media\extraLarge.wav"
set "RSRC_DEST_DIR=resources\"
call "devscripts\build_jar.cmd"
endlocal
