/*

package com.test;
*/
/*
public class Test {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
*//*



*/
/*
class Main {
    int instVar;

    Main(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("object reference = " + obj);
    }
}*//*



*/
/*
class Main {
    int instVar;

    Main(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("object reference = " + obj);

        Main obj1 = new Main(7);
        System.out.println("object reference = " + obj1);
    }
}
*//*



*/
/*
class Main {

    int age;
    Main(int age){
        age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}*//*



*/
/*
class Main {

    int age;
    Main(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}*//*



*/
/*
class Main {
    int age;

    Main(int i) {
        age = i;
    }
}

class Main {
    int age;

    Main(int i) {
        this.age = i;
    }
}*//*


*/
/*

class Main {
    String name;

    // setter method
    void setName( String name ) {
        this.name = name;
    }

    // getter method
    String getName(){
        return this.name;
    }

    public static void main( String[] args ) {
        Main obj = new Main();

        // calling the setter and the getter method
        obj.setName("Toshiba");
        System.out.println("obj.name: "+obj.getName());
    }
}*//*


*/
/*

class Complex {

    private int a, b;

    // constructor with 2 parameters
    private Complex( int i, int j ){
        this.a = i;
        this.b = j;
    }

    // constructor with single parameter
    private Complex(int i){
        // invokes the constructor with 2 parameters
        this(i, i);
    }

    // constructor with no parameter
    private Complex(){
        // invokes the constructor with single parameter
        this(0);
    }

   *//*

*/
/* @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }*//*
*/
/*


    public static void main( String[] args ) {

        // creating object of Complex class
        // calls the constructor with 2 parameters
        Complex c1 = new Complex(2, 3);

        // calls the constructor with a single parameter
        Complex c2 = new Complex(3);

        // calls the constructor with no parameters
        Complex c3 = new Complex();

        // print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}*//*


*/
/*

class ThisExample {
    // declare variables
    int x;
    int y;

    ThisExample(int x, int y) {
        // assign values of variables inside constructor
        this.x = x;
        this.y = y;

        // value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        // call the add() method passing this as argument
        add(this);

        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(ThisExample o){
        o.x += 2;
        o.y += 2;
    }
}

class Main {
    public static void main( String[] args ) {
        ThisExample obj = new ThisExample(1, -2);
    }
}*//*



*/
/*

class Main {
    public static void main(String[] args) {

        // create a final variable
        final int AGE = 32;

        // try to change the final variable
        AGE = 45;
        System.out.println("Age: " + AGE);
    }
}*//*



*/
/*
class FinalDemo {
    // create a final method
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Main extends FinalDemo {
    // try to override final method
    public final void display() {
        System.out.println("The final method is overridden.");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}*//*



*/
/*
// create a final class
final class FinalClass {
    public void display() {
        System.out.println("This is a final method.");
    }
}

// try to extend the final class
class Main extends FinalClass {
    public  void display() {
        System.out.println("The final method is overridden.");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}*//*


*/
/*

class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}*//*



// Java Program to check if an object of the subclass
// is also an instance of the superclass

// superclass
*/
/*
class Animal {
}

// subclass
class Dog extends Animal {
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog d1 = new Dog();

        // checks if d1 is an instance of the subclass
        System.out.println(d1 instanceof Dog);        // prints true

        // checks if d1 is an instance of the superclass
        System.out.println(d1 instanceof Animal);     // prints true
    }
}*//*



// Java program to check if an object of a class is also
//  an instance of the interface implemented by the class

*/
/*
interface Animal {
}

class Dog implements Animal {
}

class Main {
    public static void main(String[] args) {

        // create an object of the Dog class
        Dog d1 = new Dog();

        // checks if the object of Dog
        // is also an instance of Animal
        System.out.println(d1 instanceof Animal);  // returns true
        System.out.println(d1 instanceof Object);
    }
}*//*



*/
/*
class Animal {
    // methods and fields
}

// use of extends keyword
// to perform inheritance
class Dog extends Animal {

    // methods and fields of Animal
    // methods and fields of Dog
}*//*



*/
/*
class Animal {

    // field and method of the parent class
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}

// inherit from Animal
class Dog extends Animal {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();

        // access field of superclass
        labrador.name = "Rohu";
        labrador.display();

        // call method of superclass
        // using object of subclass
        labrador.eat();

    }
}`122*//*


*/
/*

class Animal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}*//*

*/
/*


class Animal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // overriding the eat() method
    @Override
    public void eat() {

        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        super.eat();
//
        System.out.println("I can bark");
        eat();
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}*//*



*/
/*

class Animal {
    protected String name;

    protected void display() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {

    public void getInfo() {
        System.out.println("My name is " + name);
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();

        // access protected field and method
        // using the object of subclass
        labrador.name = "Rocky";
        labrador.display();

        labrador.getInfo();
    }
}*//*



*/
/*
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
//    @Override
//    public void displayInfo() {
//        System.out.println("I am a dog.");
//    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}*//*



*/
/*
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}*//*



*/
/*
class Animal {
    protected void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}*//*


*/
/*


class Animal {

    // overridden method
    public void display(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    // overriding method
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}*//*


*/
/*

class Animal {

    // overridden method
    public void display(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    // overriding method
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){

        // this calls overriding method
        display();

        // this calls overridden method
        super.display();
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}*//*



*/
/*
class Animal {
    protected String type="animal";
}

class Dog extends Animal {
    public String type="mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printType();
    }
}*//*


*/
/*

class Animal {

    // default or no-arg constructor of class Animal
    Animal() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    // default or no-arg constructor of class Dog
    Dog() {

        // calling default constructor of the superclass
//        super();

        System.out.println("I am a dog");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
}*//*


*/
/*

class Animal {

    // default or no-arg constructor
    Animal() {
        System.out.println("I am an animal");
    }

    // parameterized constructor
    Animal(String type) {
        System.out.println("Type: "+type);
    }
}

class Dog extends Animal {

    // default constructor
    Dog(){

        // calling parameterized constructor of the superclass
        super("Animal");

        System.out.println("I am a dog");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
}*//*



*/
/*
abstract class Language {

    // abstract method
    abstract void method1();

    // regular method
    void method2() {
        System.out.println("This is regular method");
    }
}*//*



*/
/*
abstract class Language {

    // method of abstract class
    public void display() {
        System.out.println("This is Java Programming");
    }
}

class Main extends Language {

    public static void main(String[] args) {

        // create an object of Main
        Main obj = new Main();

        // access method of abstract class
        // using object of Main class
        obj.display();
    }
}*//*



*/
/*

abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {

    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog d1 = new Dog();

        d1.makeSound();
        d1.eat();
    }
}*//*


*/
/*

abstract class Animal {
    static  int a = 5;
    abstract void makeSound();

}

class Dog extends Animal {

    // implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark.");
    }
}

class Cat extends Animal {

    // implementation of abstract method
    public void makeSound() {
        System.out.println("Meows ");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();

        Cat c1 = new Cat();
        c1.makeSound();
        System.out.println(Animal.a);
    }
}*//*


*/
/*interface Language {
    public void getType();

    public void getVersion();
}*//*


*/
/*
interface Polygon {
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {

    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }
}
*//*


*/
/*

// create an interface
interface Language {
    void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {

    // implementation of abstract method
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}*//*



*/
/*
interface A {
    // members of A
}

interface B extends A{
    // members of B
}

class C implements A, B {
    // abstract members of A
    // abstract members of B
}*//*



*/
/*
interface Line {
    // members of Line interface
}

// extending interface
interface Polygon extends Line {
    // members of Polygon interface
    // members of Line interface
}*//*




*/
/*
interface A {
//   ...
}
interface B {
//   ...
}

interface C extends A, B {
//   ...
}*//*


*/
/*

interface Polygon {
    void getArea();

    // default method
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}

// implements the interface
class Rectangle implements Polygon {
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    // overrides the getSides()
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}

// implements the interface
class Square implements Polygon {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Rectangle
        Rectangle r1 = new Rectangle();
        r1.getArea();
        r1.getSides();

        // create an object of Square
        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}*//*



*/
/*
// To use the sqrt function
import java.lang.Math;

interface  Polygon {
    void getArea();

    // calculate the perimeter of a Polygon
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side: sides) {
            perimeter += side;
        }

        System.out.println("Perimeter: " + perimeter);
    }
}

class Triangle implements Polygon {
    private int a, b, c;
    private double s, area;

    // initializing sides of a triangle
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // calculate the area of a triangle
    public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 3, 4);

// calls the method of the Triangle class
        t1.getArea();

// calls the method of Polygon
        t1.getPerimeter(2, 3, 4);
    }
}*//*


*/
/*

class Pattern {

    // method without parameter
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    // method with single parameter
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

class Main {
    public static void main(String[] args) {
        *//*

*/
/*Pattern d1 = new Pattern();

        // call method without any argument
        d1.display();
        System.out.println("\n");

        // call method with a single argument
        d1.display('#');*//*
*/
/*


        int a = 5;
        int b = 6;

// + with numbers
        int sum = a + b;
        System.out.println(sum);

        String first = "Java ";
        String second = "Programming";

// + with strings
        String name = first + second;
        System.out.println(name);
    }
}*//*




*/
/*
class ProgrammingLanguage {
    public void display() {
        System.out.println("I am Programming Language.");
    }
}

class Java extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}

class Main {
    public static void main(String[] args) {

        // declare an object variable
       *//*

*/
/* ProgrammingLanguage pl;

        // create object of ProgrammingLanguage
        pl = new ProgrammingLanguage();
        pl.display();*//*
*/
/*


        // create object of Java class
        ProgrammingLanguage pl = new Java();
        pl.display();
    }
}*//*


*/
/*

class Area {

    // fields to calculate area
    int length;
    int breadth;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Area rectangle = new Area(5, 6);
        rectangle.getArea();
    }
}*//*


*/
/*

class Person {

    // private field
    private int age;

    // getter method
    public int getAge() {
        return age;
    }

    // setter method
    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Person
        Person p1 = new Person();

        // change age using setter
        p1.setAge(24);

        // access age using getter
        System.out.println("My age is " + p1.getAge());
    }
}*//*




*/
/*
class OuterClass {
    // ...
    class NestedClass {
        // ...
    }
}*//*



*/
/*
class CPU {
    double price;
    // nested class
    class Processor{

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

class Main {
    public static void main(String[] args) {

        // create object of Outer class CPU
        CPU cpu = new CPU();

        // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}*//*




*/
/*
class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

    // inner class
    class Engine {
        String engineType;
        void setEngine() {

            // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

class Main {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}*//*



*/
/*
class MotherBoard {

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }

}
class Main {
    public static void main(String[] args) {

        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}*//*


*/
/*

class MotherBoard {

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }

}
 class Main {
    public static void main(String[] args) {

        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}*//*


*/
/*

class MotherBoard {
    String model;
    public MotherBoard(String model) {
        this.model = model;
    }

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            // accessing the variable model of the outer classs
            if(MotherBoard.this.model.equals("MSI")) {
                return 4;
            }
            else {
                return usb2 + usb3;
            }
        }
    }
}
 class Main {
    public static void main(String[] args) {

        // create an object of the static nested class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}*//*


*/
/*

class Animal {

    // inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }

    // static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // object creation of the outer class
        Animal animal = new Animal();

        // object creation of the non-static class
        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        // object creation of the static nested class
        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();

    }
}*//*



*/
/*
class Animal {
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
            Animal.eat();
        }
    }

    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }

     public static void eat() {
        System.out.println("I eat food.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();

    }
}*//*



*/
/*
static class Animal {
    public static void displayInfo() {
        System.out.println("I am an animal");
    }
}
*//*



*/
/*
class Main {
    public static void main(String[] args) {
        Animal.displayInfo();
    }
}*//*


*/
/*

class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass() {

        // creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon() {
            *//*

*/
/*public void display() {
                System.out.println("Inside an anonymous class.");
            }
            super.display();*//*
*/
/*

        };
        p1.display();

    }
}

class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}*//*



*/
/*
interface Polygon {
    public void display();
}

class AnonymousDemo {
    public void createClass() {

        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}*//*



*/
/*
class SingletonExample {

    // private field that refers to the object
    private static SingletonExample singleObject;

    private SingletonExample() {
        // constructor of the SingletonExample class
    }

    public static SingletonExample getInstance() {
        // write code that allows us to create only one object
        // access the object as per our need
    }
}*//*


*/
/*

class Database {
    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new Database();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

class Main {
    public static void main(String[] args) {
        Database db1;

        // refers to the only object of Database
        db1= Database.getInstance();

        db1.getConnection();
    }
}*//*




*/
/*
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Main {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
    }
}*//*


*/
/*

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
    Size pizzaSize;
    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza() {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Test t1 = new Test(Size.MEDIUM);
        t1.orderPizza();
    }
}*//*


*/
/*

enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {

        // this will refer to the object SMALL
        switch(this) {
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            case EXTRALARGE:
                return "extra large";

            default:
                return null;
        }
    }

    public static void main(String[] args) {

        // call getSize()
        // using the object SMALL
        System.out.println("The size of the pizza is " + Size.MEDIUM.getSize());
    }
}*//*


*/
/*

enum Size {

    // enum constants calling the enum constructors
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    // private enum constructor
    private Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}

class Main {
    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.getSize());
    }
}*//*



*/
/*
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Main {
    public static void main(String[] args) {

        System.out.println("string value of SMALL is " + Size.SMALL.toString());
        System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());

    }
}*//*



*/
/*
enum Size {
    SMALL {

        // overriding toString() for SMALL
        public String toString() {
            return "The size is small.";
        }
    },

    MEDIUM {

        // overriding toString() for MEDIUM
        public String toString() {
            return "The size is medium.";
        }
    };
}

class Main {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.toString());
    }
}*//*


*/
/*

import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

// put this class in different Dog.java file
class Dog extends Animal {
    public void display() {
        System.out.println("I am a dog.");
    }
}

// put this in Main.java file
class Main {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}*//*


*/
/*

import java.lang.Class;
import java.lang.reflect.*;

class Dog {

    // methods of the class
    public void display() {
        System.out.println("I am a dog.");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }
}

class Main {
    public static void main(String[] args) {
        try {

            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // using object of Class to
            // get all the declared methods of Dog
            Method[] methods = obj.getDeclaredMethods();

            // create an object of the Method class
            for (Method m : methods) {

                // get names of methods
                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int modifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}*//*



*/
/*
import java.lang.Class;
import java.lang.reflect.*;

class Dog {
    public String type;
}

class Main {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // access and set the type field
            Field field1 = obj.getField("type");
            field1.set(d1, "labrador");

            // get the value of the field type
            String typeValue = (String) field1.get(d1);
            System.out.println("Value: " + typeValue);

            // get the access modifier of the field type
            int mod = field1.getModifiers();

            // convert the modifier to String form
            String modifier1 = Modifier.toString(mod);
            System.out.println("Modifier: " + modifier1);
            System.out.println(" ");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}*//*


*/
/*

import java.lang.Class;
import java.lang.reflect.*;

class Dog {
    private String color;
}

class Main {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // access the private field color
            Field field1 = obj.getDeclaredField("color");

            // allow modification of the private field
            field1.setAccessible(true);

            // set the value of color
            field1.set(d1, "brown");

            // get the value of field color
            String colorValue = (String) field1.get(d1);
            System.out.println("Value: " + colorValue);

            // get the access modifier of color
            int mod2 = field1.getModifiers();

            // convert the access modifier to string
            String modifier2 = Modifier.toString(mod2);
            System.out.println("Modifier: " + modifier2);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}*//*


*/
/*

import java.lang.Class;
import java.lang.reflect.*;

class Dog {

    // public constructor without parameter
    public Dog() {

    }

    // private constructor with a single parameter
    private Dog(int age) {

    }

}

class Main {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get all constructors of Dog
            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor c : constructors) {

                // get the name of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get the access modifier of constructors
                // convert it into string form
                int modifier = c.getModifiers();
                String mod = Modifier.toString(modifier);
                System.out.println("Modifier: " + mod);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
                System.out.println("");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}*//*



*/
/*
class Main {
    public static void main(String[] args) {

        try {

            // code that generate exception
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }
}*//*


*/
/*class Main {
    public static void main(String[] args) {
        try {
            // code that generates exception
            throw new ArithmeticException("Trying to divide by 0");
//            int divideByZero = 5 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        finally {
            System.out.println("This is the finally block");
        }
    }
}*//*



*/
/*
class Main {
    public static void divideByZero() {

        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}
*//*




import java.io.*;

*/
/*
class Main {
    // declareing the type of exception
    public static void findFile() throws ArithmeticException {

        // code that may generate IOException
//        File newFile = new File("test.txt");
//        FileInputStream stream = new FileInputStream(newFile);
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        try {
            findFile();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}*//*




*/
/*
class Main {
    public static void main(String[] args) {

        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }
}*//*



*/
/*

class Main {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
        }

        finally {
            System.out.println("Finally block is always executed");
        }
    }
}*//*



import java.io.*;
*/
/*

class ListOfNumbers {

    // create an integer array
    private int[] list = {5, 6, 8, 9, 2};

    // method to write data from array to a fila
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");

            // creating a new file test.txt
            out = new PrintWriter(new FileWriter("test.txt"));

            // writing values from list array to Output.txt
            for (int i = 0; i < 7; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        }

        catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }

        finally {
            // checking if PrintWriter has been opened
            if (out != null) {
                System.out.println("Closing PrintWriter");
                // close PrintWriter
                out.close();
            }

            else {
                System.out.println("PrintWriter not open");
            }
        }

    }
}

class Main {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();
    }
}*//*


*/
/*

class ListOfNumbers {
    public int[] arr = new int[10];

    public void writeList() {

        try {
            arr[10] = 11;
        }

        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }

        catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }

    }
}

class Main {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();
    }
}*//*



import java.io.*;
*/
/*
class Main {
    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile=new File("test.txt");
        FileInputStream stream=new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}*//*



import java.io.*;
*/
/*
class Main {
    public static void findFile() throws NullPointerException, IOException {
*//*

*/
/*
        // code that may produce NullPointerException
    … … …

        // code that may produce IOException
    … … …

        // code that may produce InvalidClassException
    … … …*//*
*/
/*

    }

    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        }
    }
}*//*



*/
/*
class Main {
    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}
*//*



import java.io.*;
*/
/*
class Main {
    public static void findFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            findFile();
            System.out.println("Rest of code in try block");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}*//*



*/
/*
class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 ;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}*//*



*/
/*class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}*//*


*/
/*class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}*//*


*/
/*class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}*//*


import java.io.*;

*/
/*
class Main {
    public static void main(String[] args) {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
            Throwable[] suppressedExceptions = e.getSuppressed();
            for (int i=0; i<suppressedExceptions.length; i++) {
                System.out.println("Suppressed exception=>" + suppressedExceptions[i]);
            }
        }
    }
}
*//*



import java.io.*;

*/
/*
class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line;

        try {
            System.out.println("Entering try block");
            br = new BufferedReader(new FileReader("test.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        } finally {
            System.out.println("Entering finally block");
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("IOException in finally block =>"+e.getMessage());
            }

        }
    }
}
*//*



*/
/*
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException{
        try (Scanner scanner = new Scanner(new File("test.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
    }
}
*//*



*/
/*
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.displayInfo();
    }
}*/


package com.test;





/**/
/*
import java.util.*;

class Test {
//    @SuppressWarnings("unchecked")
    static void wordsList() {
        ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
        wordList.add("programiz");

        System.out.println("Word list => " + wordList);
    }

    public static void main(String args[]) {
        wordsList();
    }
}*/


/*
class Main {
    */
/*

    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    public static void main(String args[]) {
        deprecatedMethod();
    }
}*/

/*

class Animal {

    // overridden method
    public void display(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    // overriding method
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}*/

/*

class Main {
    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method example");
    }

    @SuppressWarnings("deprecated")
    public static void main(String args[]) {
        Main depObj = new Main();
        depObj. deprecatedMethod();
    }
}*/


/*
import java.util.*;

class Main {

//    @SafeVarargs
    @SafeVarargs
    public final void displayList(List<String>... lists) {
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();

        List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu University");
        obj.displayList(universityList);

        List<String> programmingLanguages = Arrays.asList("Java", "C");
        obj.displayList(universityList, programmingLanguages);
    }
}
*/

/*@FunctionalInterface
 interface MyFuncInterface{
    public void firstMethod(); // this is an abstract method
}*/

/*
@FunctionalInterface
interface MyFuncInterface{
    public void firstMethod(); // this is an abstract method
    public void secondMethod(); // this throws compile error
}*/


/*

@FunctionalInterface
interface MyFuncInterface{
    public void firstMethod(); // this is an abstract method
    default void secondMethod() {  }
    default void thirdMethod() { }
}*/

import java.lang.annotation.*;

/*
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {
    String value() default "default value";
}

class Main {
    @MyCustomAnnotation(value = "programiz")
    public void method1() {
        System.out.println("Test method 1");
    }

    public static void main(String[] args) throws Exception {
        Main obj = new Main();
        obj.method1();
    }
}


class ParentClass{ }

class ChildClass extends ParentClass { }*/


/*
@Inherited
@interface MyCustomAnnotation { */
/**//*
}

@MyCustomAnnotation
class ParentClass{  }

class ChildClass extends ParentClass { }*/


/*
@Repeatable(Universities.class)
@interface University {
    String name();
}
@interface Universities {
    University[] value();
}
    @University(name = "TU")
    @University(name = "KU")
    String uniName = null;*/


/*
class Main {
    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 2;
        System.out.println("There are " + weekends.length + "  weekends in a week");
    }
}*/


class Test {
    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length==2 : "There are only 2 weekends in a week";
        System.out.println("There are " + weekends.length + "  weekends in a week");
    }
}
