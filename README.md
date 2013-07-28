SimpleListItem
==============
Just simple implementation of List container.

Console making and running
=============
mkdir out
javac -sourcepath ./src ./src/Main.java -d out
cd out/
java Main

Known issue
=============
At SquareListItem known bug - overflow in recursion
(change one of iteration from 15.0f to 1.0f to see).
So please carefully in use (in Main.class show how).
