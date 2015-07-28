@echo off
if not exist out mkdir out
javac -sourcepath ./src ./src/Main.java -d out
set CURRENT_DIR=%CD%
cd out/
java Main
cd %CURRENT_DIR%