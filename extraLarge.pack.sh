#!/bin/bash
cd $(dirname "$0")

PROJECT_NAME="extraLarge" MAIN_CLASS="extraLarge.sustainPlusPlus" EXTRA_DEPS_SRC=$(find "src/music_player" -name "*.java") devscripts/build_jar.sh
