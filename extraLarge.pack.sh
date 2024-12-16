#!/bin/bash
cd $(dirname "$0")

PROJECT_NAME="extraLarge" \
MAIN_CLASS="extraLarge.sustainPlusPlus" \
EXTRA_DEPS_SRC=$(find "src/music_player" -name "*.java") \
RSRC="media/extraLarge.wav" \
RSRC_DEST_DIR="resources/" \
devscripts/build_jar.sh
