if [ ! -d ./out ]; then mkdir ./out; fi
javac -sourcepath ./src ./src/Main.java -d ./out
CURRENT_DIR=$PWD
cd ./out
java Main
cd $CURRENT_DIR