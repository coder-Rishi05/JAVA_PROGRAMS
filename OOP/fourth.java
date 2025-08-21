/*
4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.


Tutorial
7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

Tutorial
8. Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

Tutorial
9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

Tutorial
10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

Tutorial
11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

 */


class circle {

    double radius;

    void area(double r){
        System.out.println("The area of circle is : ");
    }

    void circumference(double r){
        System.out.println("The circumference of circle is : ");

    }

    public static void main(String st[]){
        circle obj = new circle();
        obj.area(34.3);
        obj.circumference(12.5);
    }

    
}