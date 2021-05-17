# MakeChangeProject

### Overview
This program asks the user how much an item costs, asks how much they will pay, and returns the change owed in the appropriate denominations.

--Will ask user for more money if the amount entered is lower than the amount due.

--Offers option to give change in higher denominations than twenty.

### Technologies Used
-Java
-While loops
-Printf()
-if/else statements

### How to Run
-Run program in IDE or compile and run in terminal

### Lessons Learned
While writing this program, I learned some strategies to deal with issues that arose from rounding errors involving floating point numbers in Java. Looking back, I should have done all of the calculations using pennies before converting into dollars, in order to deal with rounding errors. However, the rounding errors were so small that they didn't appear until the end of the code where the pennies were calculated. Rather than rewrite my code, I bandaged the problem by applying an if statement to check whether or not there was a significant digit in the thousandths that would influence a rounding error.
