@echo off
setlocal enabledelayedexpansion

set "SRC_DIR=src"
set "OUT_DIR=build"
set "PROJ_SRC=%SRC_DIR%\%PROJECT_NAME%"
set "PROJ_OUT=%OUT_DIR%\%PROJECT_NAME%"
set "JAR_FILE=%PROJECT_NAME%.jar"

if exist "%PROJ_OUT%" rmdir /s /q "%PROJ_OUT%"
2>NUL mkdir "%PROJ_OUT%\%RSRC_DEST_DIR%"

for /r "%PROJ_SRC%" %%f in (*.java) do (
    set "JAVA_FILES=!JAVA_FILES! %%f"
)
if defined EXTRA_DEPS_SRC (
    set "JAVA_FILES=!JAVA_FILES! %EXTRA_DEPS_SRC%"
)
javac -d "%PROJ_OUT%" !JAVA_FILES!
if defined RSRC (
    copy /y "%RSRC%" "%PROJ_OUT%\%RSRC_DEST_DIR%"
)
jar -cfe "%JAR_FILE%" "%MAIN_CLASS%" -C "%PROJ_OUT%" .
rmdir /s /q "%OUT_DIR%"
endlocal
