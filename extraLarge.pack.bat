@echo off
cd %~dp0
md src\extraLarge\classes
javac -d src/extraLarge/classes src/extraLarge/*.java
jar -cfe extraLarge.jar extraLarge.sustainPlusPlus -C src/extraLarge/classes/ .
rd /S /Q src\extraLarge\classes
java -jar extraLarge.jar