#!/bin/bash
cd $(dirname "$0")

PROJECT_NAME="extraLarge" MAIN_CLASS="extraLarge.sustainPlusPlus" devscripts/build_jar.sh
