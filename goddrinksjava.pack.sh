#!/bin/bash
cd $(dirname "$0")

PROJECT_NAME="goddrinksjava" MAIN_CLASS="goddrinksjava.GodDrinksJava" EXTRA_DEPS_SRC=$(find "src/music_player" -name "*.java") devscripts/build_jar.sh
