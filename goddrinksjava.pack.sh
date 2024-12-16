#!/bin/bash
cd $(dirname "$0")

PROJECT_NAME="goddrinksjava" \
MAIN_CLASS="goddrinksjava.GodDrinksJava" \
EXTRA_DEPS_SRC=$(find "src/music_player" -name "*.java") \
RSRC="media/goddrinksjava.wav" \
RSRC_DEST_DIR="resources/" \
devscripts/build_jar.sh
