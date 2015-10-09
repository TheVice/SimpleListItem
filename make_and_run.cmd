@echo off
if not exist build mkdir build
javac -sourcepath ./src ./src/Main.java -d build
set CURRENT_DIR=%CD%
cd build/
java Main
cd %CURRENT_DIR%