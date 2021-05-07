package com.company;
//
//// Your First Program
//
//class HelloWorld {
//    public static void main(String[] args) {
////        String a = "";
////        System.out.println("Hello, World!");
////        System.out.println("Hello Hi");
//
////        int speedLimit;
////        speedLimit = 800;
////
////        speedLimit = 900;
//
////        int speedLimit = 80;
////        float speedLimit;
////        System.out.println(speedLimit);
//
////        int age = 24;
////        int AGE = 25;
////
////        System.out.println(age);  // prints 24
////        System.out.println(AGE);  // prints 25
//
//
////        int age;  // valid name and good practice
////        int _age;  // valid but bad practice
////        int $age;
//
////        int a = 1;
////        float b = 2.5F;
////        char c = 'F';
////
////        boolean flag1 = false;
////        boolean flag2 = true;
////
////
////        // binary
////        int binaryNumber = 0b10010;
////// octal
////        int octalNumber = 027;
////
////// decimal
////        int decNumber = 34;
////
////// hexadecimal
////        int hexNumber = 0x2F; // 0x represents hexadecimal
////// binary
////        int binNumber = 0b10010; // 0b represents binary
////
////        double myDouble = 3.4;
////        float myFloat = 3.4F;
////
////        // 3.445*10^2
////        double myDoubleScientific = 3.445e2;
////
////        System.out.println(myDouble);  // prints 3.4
////        System.out.println(myFloat);    // prints 3.4
////        System.out.println(myDoubleScientific);   // prints 344.5
//
////
////        char letter = '\b';
////        System.out.println("Hi "+letter+"!");
////        String str1 = "Java Programming";
////        String str2 = "Programiz";
////        System.out.println(str1);
////        System.out.println(str2);
//
//    }
//}
//
//class Main {
//    public static void main(String[] args) {

//        boolean flag = false;
//        System.out.println(flag);    // prints true
//
//        byte range;
//        range = 127;
//        byte range2 = -128;
////        range2 = -128;
//        System.out.println(range);
//        System.out.println(range2);

//        short temperature;
//        temperature = -32768;
//        System.out.println(temperature);
//
//        int range = -4250000;
//        System.out.println(range);

//        long range = -42332200000L;
//        System.out.println(range);

//        double number = -42.3;
//        System.out.println(number);

//        float number = -42.3f;
//        System.out.println(number);

//        char letter = '\u00C6';
//        System.out.println(letter);

//        char letter1 = '\u0039';
//        System.out.println(letter1);  // prints 9
//
//        char letter2 = 65;
//        System.out.println(letter2);
//
//        String myString = "Java Programming";
//        System.out.println(myString);
///
//        // declare variables
//        int a = 12, b = 5;
//
//        // addition operator
//        System.out.println("a + b = " + (a + b));
//
//        // subtraction operator
//        System.out.println("a - b = " + (a - b));
//
//        // multiplication operator
//        System.out.println("a * b = " + (a * b));
//
//        // division operator
//        System.out.println("a / b = " + (a / b));
//
//        // modulo operator
//        System.out.println("a % b = " + (a % b));
//        System.out.println((9 / 2)
//        );
//        System.out.println((9.0 / 2));
//        System.out.println((9 / 2.0));
//        System.out.println((9.0 / 2.0));
//        int age;
//        age = 5;


//        int a = 4;
//        int var;
//
//        // assign value using =
//        var = a;
//        System.out.println("var using =: " + var);
//
//        // assign value using =+
//        var += a;
//        System.out.println("var using +=: " + var);
//
//        // assign value using =*
//        var *= a;
//        System.out.println("var using *=: " + var);
//    }
//}
//
//    }
//}
//class Main {
//    public static void main(String[] args) {
//
//        // create variables
//        int a = 4;
//        int var;
//
//        // assign value using =
//        var = a;
//        System.out.println("var using =: " + var);
//
//        // assign value using =+
//        var += a;
//        System.out.println("var using +=: " + var);
//
//        // assign value using =*
//        var *= a;
//        System.out.println("var using *=: " + var);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//
//        // create variables
//        int a = 7, b = 11;
//
//        // value of a and b
//        System.out.println("a is " + a + " and b is " + b);
//
//        // == operator
//        System.out.println(a == b);  // false
//
//        // != operator
//        System.out.println(a != b);  // true
//
//        // > operator
//        System.out.println(a > b);  // false
//
//        // < operator
//        System.out.println(a < b);  // true
//
//        // >= operator
//        System.out.println(a >= b);  // false
//
//        // <= operator
//        System.out.println(a <= b);  // true
//    }
//}

//class Main {
//    public static void main(String[] args) {
//
//        // && operator
//        System.out.println((5 > 3) && (8 > 5));  // true
//        System.out.println((5 > 3) && (8 < 5));  // false
//
//        // || operator
//        System.out.println((5 < 3) || (8 > 5));  // true
//        System.out.println((5 > 3) || (8 < 5));  // true
//        System.out.println((5 < 3) || (8 < 5));  // false
//
//        // ! operator
//        System.out.println(!(5 == 3));  // true
//        System.out.println(!(5 > 3));  // false
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        // declare variables
//        int a = 12, b = 12;
//        int result1, result2;
//
//        // original value
//        System.out.println("Value of a: " + a);
//
//        // increment operator
//        result1 = ++a;
//        System.out.println("After increment: " + result1);
//
//        System.out.println("Value of b: " + b);
//
//        // decrement operator
//        result2 = --b;
//        System.out.println("After decrement: " + result2);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        String str = "Programiz";
//        boolean result;
//
//        // checks if str is an instance of
//        // the String class
//        result = str instanceof String;
//        System.out.println("Is str an object of String? " + result);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        String str = "Programiz";
//        boolean result;
//
//        // checks if str is an instance of
//        // the String class
//        result = str instanceof String;
//        System.out.println("Is str an object of String? " + result);
//    }
//}


//class AssignmentOperator {
//    public static void main(String[] args) {
//
//        System.out.println("Java programming is interesting.");
//    }
//}

//class Output {
//    public static void main(String[] args) {
//
//        System.out.println("1. println ");
//        System.out.println("2. println ");
//
//        System.out.print("1. print ");
//        System.out.print("2. print");
//    }
//}
//
//class Variables {
//    public static void main(String[] args) {
//
//        Double number = -10.6;
//
//        System.out.println(5);
//        System.out.println(number);
//    }
//}


/*
class PrintVariables {
    public static void main(String[] args) {

        Double number = -10.6;

        System.out.println("I am " + "awesome.");
        System.out.println("Number = " + number);
    }
}*/

/*import java.util.Scanner;

class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Enter an Long ");
        Long number1 = input.nextLong();
        System.out.print("Enter an Float");
        float number2 = input.nextFloat();
        System.out.print("Enter an Double ");
        double number3 = input.nextDouble();
        System.out.print("Enter an String ");
        String number4 = input.next();


        System.out.println("You entered " + number);
        System.out.println("You entered " + number1);
        System.out.println("You entered " + number2);
        System.out.println("You entered " + number3);
        System.out.println("You entered " + number4);

        // closing the scanner object
        input.close();
    }
}*/
/*

import java.util.Scanner;

class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}*/

//class Main {
//    public static void main(String[] args) {
//
//        String band = "Beatles";
//
//        if (band == "Beatles") { // start of block
//            System.out.print("Hey ");
//            System.out.print("Jude!");
//        } // end of block
//    }
//}

/*
class Main {
    public static void main(String[] args) {

        if (10 > 5) { // start of block

        } // end of block
    }
}*/

/*
class AssignmentOperator {
    public static void main(String[] args) {  // start of block

    } // end of block
}*/

// "Hello, World!" program example

/*
class Main {
    public static void main(String[] args) {
        {
            // prints "Hello, World!"
            System.out.println("Hello, World!");
        }
    }
}*/


/* This is an example of  multi-line comment.
 * The program prints "Hello, World!" to the standard output.
 */

//class HelloWorld {
//    public static void main(String[] args) {
//        {
//            System.out.println("Hello, World!");
//        }
//    }
//}

/*
class IfStatement {
    public static void main(String[] args) {

        int number = -10;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        System.out.println("Statement outside if block");
    }
}*/

/*

class Main {
    public static void main(String[] args) {
        // create a string variable
        String language = "Java";

        // if statement
        if (language == "Java") {
            System.out.println("Best Programming Language");
        }
    }
}*/
/*


class Main {
    public static void main(String[] args) {
        int number = -10;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // execute this block
        // if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");
    }
}*/

/*

class Main {
    public static void main(String[] args) {

        int number = 0;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }

        // if both condition is false
        else {
            System.out.println("The number is 0.");
        }
    }
}*/


/*
class Main {
    public static void main(String[] args) {

        // declaring double type variables
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

        // checks if n1 is greater than or equal to n2
        if (n1 >= n2) {

            // if...else statement inside the if block
            // checks if n1 is greater than or equal to n3
            if (n1 >= n3) {
                largest = n1;
            }

            else {
                largest = n3;
            }
        } else {

            // if..else statement inside else block
            // checks if n2 is greater than or equal to n3
            if (n2 >= n3) {
                largest = n2;
            }

            else {
                largest = n3;
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}*/

// Java Program to check the size
// using the switch...case statement

/*
class Main {
    public static void main(String[] args) {

        int number = -44;
        String size;

        // switch statement to check size
        switch (number) {

            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            // match the value of week
            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;

        }
        System.out.println("Size: " + size);
    }
}*/

/*

class Main {
    public static void main(String[] args) {

        int expression = 3;

        // switch statement to check size
        switch (expression) {
            case 1:
                System.out.println("Case 1");

                // matching case
            case 2:
                System.out.println("Case 2");
                break;

            case 3:
                System.out.println("Case 3");
                break;

            default:
                System.out.println("Default case");
        }
    }
}*/

/*

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.print("Choose an operator: +, -, *, or /: ");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter second number: ");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}*/


// Program to print a text 5 times

/*
class Main {
    public static void main(String[] args) {

        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }
}*/


// Program to print numbers from 1 to 5

/*
class Main {
    public static void main(String[] args) {

        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println(i);
        }
    }
}*/


// Program to find the sum of natural numbers from 1 to 1000.

/*
class Main {
    public static void main(String[] args) {

        int sum = 0;
        int n = 1000;

        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);
    }
}*/


// Program to find the sum of natural numbers from 1 to 1000.

/*
class Main {
    public static void main(String[] args) {

        int sum = 0;
        int n = 1000;

        // for loop
        for (int i = n; i >= 1; --i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);
    }
}*/


// print array elements

/*
class Main {
    public static void main(String[] args) {

        // create an array
        int[] numbers = {3, 7, 5, -5};

        // iterating through the array
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}*/


// Infinite for Loop

/*
class Infinite {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
    }
}*/

// print array elements

/*
class Main {
    public static void main(String[] args) {

        // create an array
        int[] numbers = {3, 9, 5, -5};

        // for each loop
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
*/


// Calculate the sum of all elements of an array

/*class Main {

    public static void main(String[] args) {

        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        // iterating through each element of the array
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}*/

/*class Main {
    public static void main(String[] args) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using a for loop
        for (int i = 0; i < vowels.length; ++ i) {
            System.out.println(vowels[i]);
        }
    }
}*/

/*class Main {
    public static void main(String[] args) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using the for-each loop
        for (char item: vowels) {
            System.out.println(item);
        }
    }
}*/



// Program to display numbers from 1 to 5

/*class Main {
    public static void main(String[] args) {

        // declare variables
        int i = 1, n = 5;

        // while loop from 1 to 5
        while(i <= n) {
            System.out.println(i);
            i++;
        }
    }
}*/


// Java program to find the sum of positive numbers
/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
*/




// Java Program to display numbers from 1 to 5

import java.util.Scanner;

// Program to find the sum of natural numbers from 1 to 100.

/*
class Main {
    public static void main(String[] args) {

        int i = 1, n = 5;

        // do...while loop from 1 to 5
        do {
            System.out.println(i);
            ++i;
        } while(i <= n);
    }
}
*/



// Java program to find the sum of positive numbers
import java.util.Scanner;
/*

class Main {
    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // do...while loop continues
        // until entered number is positive
        do {
            // add only positive numbers
            sum += number;
            System.out.println("Enter a number");
            number = input.nextInt();
        } while(number >= 0);

        System.out.println("Sum = " + sum);
        input.close();
    }
}
*/


/*

class Test {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}*/



import java.util.Scanner;

/*
class UserInputSum {
    public static void main(String[] args) {

        Double number, sum = 0.0;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");

            // takes double input from user
            number = input.nextDouble();

            // if number is negative the loop terminates
            if (number < 0.0) {
                break;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}*/



/*
class LabeledBreak {
    public static void main(String[] args) {

        // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);

                // the break statement breaks the first for loop
                if ( i == 1)
                    break second;
            }
            System.out.println(i);
        }
    }
}*/


/*

class LabeledBreak {
    public static void main(String[] args) {

        // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {

                System.out.println("i = " + i + "; j = " +j);

                // the break statement terminates the loop labeled as second
                if ( i == 2)
                    break second;
            }
        }
    }
}*/

/*class Main {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if value of i is between 4 and 9
            // continue is executed
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}*/


import java.util.Scanner;
/*
class Main {
    public static void main(String[] args) {

        Double number, sum = 0.0;
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter number " + i + " : ");
            // takes input from the user
            number = input.nextDouble();

            // if number is negative
            // continue statement is executed
            if (number <= 0.0) {
                continue;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}*/
/*

class Main {
    public static void main(String[] args) {

        int i = 1, j = 1;

        // outer loop
        while (i <= 3) {

            System.out.println("Outer Loop: " + i);

            // inner loop
            while(j <= 3) {

                if(j == 2) {
//                    j++;
                    continue;
                }

                System.out.println("Inner Loop: " + j);
                j++;
            }
            i++;
        }
    }
}*/


/*class Main {
    public static void main(String[] args) {

        // outer loop is labeled as first
        first:
        for (int i = 1; i < 6; ++i) {

            // inner loop
            for (int j = 1; j < 5; ++j) {
                if (i == 3 || j == 2)

                    // skips the current iteration of outer loop
                    continue first;
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
}*/

/*class Main {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5, 2, 5};

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }
}*/



/*

class Main {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5, 2, 5};

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }
}
*/


/*class Main {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5};

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}*/

/*
class Main {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5};

        // loop through the array
        // using for loop
        System.out.println("Using for-each Loop:");
        for(int a : age) {
            System.out.println(a);
        }
    }
}
*/



/*class Main {
    public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}*/


/*
class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
}
*/


/*
class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
    }
}*/

/*

class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
    }
}*/


/*
class ThreeArray {
    public static void main(String[] args) {

        // create a 3d array
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}*/



/*
class Main {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }
}*/


/*
class Main {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        // change value of first array
        numbers[0] = -1;

        // printing the second array
        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }
}*/

/*

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }

        // converting array to string
        System.out.println(Arrays.toString(destination));
    }
}*/



// To use Arrays.toString() method
/*
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] n1 = {2, 3, 12, 4, 12, -2};

        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];

        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));
    }
}*/


// To use toString() and copyOfRange() method
/*
import java.util.Arrays;

class ArraysCopy {
    public static void main(String[] args) {

        int[] source = {2, 3, 12, 4, 12, -2};

        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        // copying from index 2 to 5 (5 is not included)
        int[] destination2;
        destination2 = Arrays.copyOfRange(source, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));
    }
}*/


/*
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[][] source = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5}
        };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < destination.length; ++i) {

            // allocating space for each row of destination array
            destination[i] = new int[source[i].length];

            for (int j = 0; j < destination[i].length; ++j) {
                destination[i][j] = source[i][j];
            }
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination));

    }
}*/

/*

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[][] source = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5}
        };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < source.length; ++i) {

            // allocating space for each row of destination array
            destination[i] = new int[source[i].length];
            System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination));
    }
}*/

/*class Bicycle {

    // state or field
    private int gear = 5;

    // behavior or method
    public void braking() {
        String str = new String("Seefeesaw");
        System.out.println(str);
        System.out.println("Working of Braking");
    }
}*/
/*


class Lamp {

    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    // method to turnoff the light
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

class Main {
    public static void main(String[] args) {

        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the light by
        // calling method turnOn()
        led.turnOn();

        // turn off the light by
        // calling method turnOff()
        halogen.turnOff();
        System.out.println(led.isOn);
        System.out.println(halogen.isOn);
    }
}
*/

/*

class Lamp {

    // stores the value for light
    // true if light is on
    // false if light is off
    static  boolean isOn;

    // method to turn on the light
    static void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    public static void main(String[] args) {

        // create an object of Lamp
        Lamp led = new Lamp();

        // access method using object
        led.turnOn();
    }
}*/

/*

class Main {

    // create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        // create an object of Main
        Main obj = new Main();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}*/


/*
class Main {

    // create a method
    public static int square(int num) {

        // return statement
        return num * num;
    }

    public static void main(String[] args) {
        int result;

        // call the method
        // store returned value to result
        result = square(10);

        System.out.println("Squared value of 10 is: " + result);
    }
}*/


/*
class Main {

    // method with no parameter
    public void display1() {
        System.out.println("Method without parameter");
    }

    // method with single parameter
    public void display2(int a) {
        System.out.println("Method with a single parameter: " + a);
    }

    public static void main(String[] args) {

        // create an object of Main
        Main obj = new Main();

        // calling method with no parameter
        obj.display1();

        // calling method with the single parameter
        obj.display2(24);
    }
}*/


/*
public class Main {
    public static void main(String[] args) {

        // using the sqrt() method
        System.out.print("Square root of 4 is: " + Math.sqrt(4));
    }
}*/


/*
public class Main {

    // method defined
    private  int getSquare(int x){
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // method call
            Main mai = new Main();
            int result = mai.getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }
}*/

/*
class MethodOverloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}*/

/*

class MethodOverloading {

    // this method accepts int
    private static void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(1);
        display("Hello");
    }
}*/


/*
class HelperService {

    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("550"));
    }
}*/


/*
class Main {
    private String name;

    // constructor
    Main() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        Main obj = new Main();
        System.out.println("The name is " + obj.name);
    }
}*/


/*
class Main {

    int i;

    // constructor with no parameter
    private Main() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {

        // calling the constructor without any parameter
        Main obj = new Main();
        System.out.println("Value of i: " + obj.i);
    }
}*/

/*
class Company {
    String name;

    // public constructor
    public Company() {
        name = "Programiz";
    }
}

public class Main {

    public static void main(String[] args) {

        // object is created in another class
        Company obj = new Company();
        System.out.println("Company name = " + obj.name);
    }
}*/



/*
class Main {

    String languages;

    // constructor accepting single value
    Main(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Language");
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
        Main obj1 = new Main("Java");
        Main obj2 = new Main("Python");
        Main obj3 = new Main("C");
    }
}*/


/*
class Main {

    int a;
    boolean b;
    char c;

    public static void main(String[] args) {

        // A default constructor is called
        Main obj = new Main();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
        System.out.println("b = " + obj.c);
    }
}*/


/*
class Main {

    int a;
    boolean b;

    // a private constructor
    private Main() {
        a = 0;
        b = false;
    }

    public static void main(String[] args) {
        // call the constructor
        Main obj = new Main();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}*/

/*
class Main {

    String language;

    // constructor with no parameter
    Main() {
        this.language = "Java";
    }

    // constructor with a single parameter
    Main(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        Main obj1 = new Main();

        // call constructor with a single parameter
        Main obj2 = new Main("Python");

        obj1.getName();
        obj2.getName();
    }
}*/


/*
class Main {
    public static void main(String[] args) {

        // create strings
        String first = "Java";
        String second = "Python";
        String third = "JavaScript";

        // print strings
        System.out.println(first);   // print Java
        System.out.println(second);  // print Python
        System.out.println(third);   // print JavaScript
    }
}*/


/*
class Main {
    public static void main(String[] args) {

        // create a string
        String greet = "Hello! World";
        System.out.println("String: " + greet);

        // get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);
    }
}*/


/*
class Main {
    public static void main(String[] args) {

        // create first string
        String first = "Java ";
        System.out.println("First String: " + first);

        // create second
        String second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
    }
}*/

/*

class Main {
    public static void main(String[] args) {

        // create 3 strings
        String first = "java programming";
        String second = "java programming";
        String third = "python programming";

        // compare first and second strings
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        // compare first and third strings
        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are equal: " + result2);
    }
}*/


/*
class Main {
    public static void main(String[] args) {

        // create a string using new
        String name = new String("Java String");

        System.out.println(name);  // print Java String
    }
}*/


/*
import java.util.ArrayList;

class ArrayListUtilization {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>(3);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        System.out.println(myList);
    }
}*/


/*
import com.programiz.Helper;

class UseHelper  {
    public static void main(String[] args) {

        double value = 99.5;
        String formattedValue = Helper.getFormattedDollar(value);
        System.out.println("formattedValue = " + formattedValue);
    }
}*/


/*
class Main {

    public static void main(String[] args) {


        String name2 = "Programiz";
        String name1 = new String("Programiz");

        System.out.println("Check if two strings are equal");

        // check if two strings are equal
        // using == operator
        boolean result1 = (name1 == name2);
        System.out.println("Using == operator: " + result1);

        // using equals() method
        boolean result2 = name1.equals(name2);
        System.out.println("Using equals(): " + result2);
    }
}*/


/*
class Data {
    // private variable
    String name;
}

public class Main {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz";
    }
}*/



/*
class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class Main {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}*/

/*
class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
        // access protected method
        dog.display();
    }
}*/


// Animal.java file
// public
//
class Animal {
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}

// Main.java
public class Main {
    public static void main( String[] args ) {
        // accessing the public class
        Animal animal = new Animal();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }
}