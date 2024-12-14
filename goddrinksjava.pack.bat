@echo off
cd %~dp0
md src\goddrinksjava\classes
javac -d src/goddrinksjava/classes src/goddrinksjava/*.java
jar -cfe goddrinksjava.jar goddrinksjava.GodDrinksJava -C src/goddrinksjava/classes/ .
rd /S /Q src\goddrinksjava\classes
java -jar goddrinksjava.jar