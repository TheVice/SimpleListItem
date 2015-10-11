@echo off
if not exist build mkdir build
javac -sourcepath ./src/main/java ./src/main/java/Main.java -d build
java -cp ./build Main