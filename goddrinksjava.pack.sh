#!/bin/sh
cd $(dirname "$0")
mkdir -p src/goddrinksjava/classes
javac -d src/goddrinksjava/classes src/goddrinksjava/*.java
jar -cfe goddrinksjava.jar goddrinksjava.GodDrinksJava -C src/goddrinksjava/classes/ .
rm -rf src/goddrinksjava/classes
java -jar goddrinksjava.jar
