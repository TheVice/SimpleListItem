SimpleListItem
==============
Simple implementation of List container.

Console manual making and running
=============
* Open console (terminal on Linux or cmd.exe on Windows) and move into project directory
* Type and execute next commands:
```
mkdir build
javac -sourcepath ./src/main/java ./src/main/java/Main.java -d build
java -cp ./build Main
```
You can also making jar and run it
```
mkdir build
javac -sourcepath ./src/main/java ./src/main/java/Main.java -d build
jar cfev ./build/SimpleListItem.jar Main -C ./build .
java -jar ./build/SimpleListItem.jar
```

Console automatic making by [Gradle](http://gradle.org/)
=============
* Open console (terminal on Linux or cmd.exe on Windows) and move into project directory
* Make sure that path to bin directory of ```gradle``` must be in environment variable PATH
* Type and execute: ```gradle build```
* For run app type and execute: ```java -cp build/classes/main Main```
* Alternative you can run jar: ```java -jar build/libs/SimpleListItem-0.1.jar```

Known issue
=============
At SquareListItem known bug - overflow in recursion
(change one of iteration from 15.0f to 1.0f to see).
So please carefully in use (in Main.java show how).
