if [ ! -d ./build ]; then mkdir ./build; fi
javac -sourcepath ./src/main/java ./src/main/java/Main.java -d ./build
java -cp ./build Main