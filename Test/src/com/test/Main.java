package com.test;

/*
public class Main {
    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 2;
        System.out.println("There are " + weekends.length + "  weekends in a week");
    }
}
*/


// The Collections framework is defined in the java.util package
/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayList: " + animals);


        // ArrayList implementation of List
        List<String> list1 = new ArrayList<>();

// LinkedList implementation of List
        List<String> list2 = new LinkedList<>();
    }
}*/


/*
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}*/


import java.util.List;
/*
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        // Creating list using the LinkedList class
        List<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}*/


/*
import java.util.ArrayList;

class Main {
    public static void main(String[] args){

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();
        List<String> list = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        list.add("Swift");
        System.out.println("ArrayList: " + languages);
        System.out.println("ArrayList: " + list);
    }
}*/

/*

import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add() method without the index parameter
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);

        // add() method with the index parameter
        languages.add(1, "JavaScript");
        System.out.println("Updated ArrayList: " + languages);
    }
}*/


/*
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // add elements in the arraylist
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println("ArrayList: " + animals);

        // get the element from the arraylist
        String str = animals.get(1);
        System.out.print("Element at index 1: " + str);
    }
}*/


/*
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the array list
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);
    }
}*/

/*
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // add elements in the array list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayList: " + animals);

        // aemove element from index 2
        String str = animals.remove(2);
        System.out.println("Updated ArrayList: " + animals);
        System.out.println("Removed Element: " + str);
    }
}*/


/*
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // creating an array list
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("ArrayList: " + animals);

        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");

        for (String language : animals) {
            System.out.print(language);
            System.out.print(", ");
        }
    }
}*/


/*
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the array list
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);

        // create a new array of String type
        String[] arr = new String[languages.size()];

        // convert ArrayList into an array
        languages.toArray(arr);
        System.out.print("Array: ");

        // access elements of the array
        for (String item : arr) {
            System.out.print(item + ", ");
        }
    }
}*/


/*
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        // create an array of String type
        String[] arr = { "Java", "Python", "C++" };
        System.out.print("Array: ");

        // print array
        for (String str : arr) {
            System.out.print(str);
            System.out.print(" ");
        }

        // create an ArrayList from an array
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Cow", "Dog"));
        System.out.println("\nArrayList: " + animals);
    }
}*/

/*

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        System.out.println("ArrayList: " + languages);

        // convert ArrayList into a String
        String str = languages.toString();
        System.out.println("String: " + str);
    }
}*/


/*
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}*/


/*
import java.util.Iterator;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}*/

/*

import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Initial Vector: " + animals);

        // Using remove()
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}*/


/*
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
    }
}*/


/*
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        System.out.println("Initial Stack: " + animals);
    }
}*/


/*
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Search an element
        int position = animals.search("Dog");
        System.out.println("Position of Dog: " + position);
    }
}*/


/*
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}*/


/*
import java.util.Queue;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}*/

/*

import java.util.Queue;
import java.util.PriorityQueue;

class Main {

    public static void main(String[] args) {
        // Creating Queue using the PriorityQueue class
        Queue<Integer> numbers = new PriorityQueue<>();

        // offer elements to the Queue
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}*/

// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}