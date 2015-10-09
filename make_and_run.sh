if [ ! -d ./build ]; then mkdir ./build; fi
javac -sourcepath ./src ./src/Main.java -d ./build
CURRENT_DIR=$PWD
cd ./build
java Main
cd $CURRENT_DIR