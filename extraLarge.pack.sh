#!/bin/sh
cd $(dirname "$0")
mkdir -p src/extraLarge/classes
javac -d src/extraLarge/classes src/extraLarge/*.java
jar -cfe extraLarge.jar extraLarge.sustainPlusPlus -C src/extraLarge/classes/ .
rm -rf src/extraLarge/classes
java -jar extraLarge.jar
