// 1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person {
   String name;
   int age;


    Person (String name1, int age1){
         name = name1;
         age =  age1;
    }

    void display(){
System.out.println("The name of the user is : " + name + " and the age of the user is : " +  age);

    }

public static void main(String st[]){
    Person obj = new Person("Sachin Tendulkar",56);
    obj.display();
    
}

}


