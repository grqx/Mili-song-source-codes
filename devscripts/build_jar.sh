#!/bin/bash

SRC_DIR="src"
OUT_DIR="build"
PROJ_SRC="$SRC_DIR/$PROJECT_NAME"
PROJ_OUT="$OUT_DIR/$PROJECT_NAME"
JAR_FILE="$PROJECT_NAME.jar"

rm -rf "$PROJ_OUT"
mkdir -p "$PROJ_OUT"
javac -d "$PROJ_OUT" $(find "$PROJ_SRC" -name "*.java") $EXTRA_DEPS_SRC
jar -cfe "$JAR_FILE" "$MAIN_CLASS" -C "$PROJ_OUT" .
rm -rf "$PROJ_OUT"
