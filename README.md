SimpleListItem
==============
Simple implementation of List container.

Console making and running
=============
* Open console (terminal on Linux or cmd.exe on Windows) and move into project directory.
* Type and execute next commands:
```
mkdir out
javac -sourcepath ./src ./src/Main.java -d out
cd out/
java Main
```
* It is also possible to do the same via scripts ```make_and_run.cmd``` (on Windows) and ```make_and_run.sh``` (on Linux).
* For detail view of output - redirect output from console to file by simply add ```> 1.txt``` after script command:
   * ```make_and_run.cmd > 1.txt```
   * ```bash make_and_run.sh > 1.txt```

Known issue
=============
At SquareListItem known bug - overflow in recursion
(change one of iteration from 15.0f to 1.0f to see).
So please carefully in use (in Main.class show how).
