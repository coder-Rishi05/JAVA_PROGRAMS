// Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

class Vehicle {
    void drive() {
        System.out.println("Driving a Car");
    }
}

class Car {

    void drive() {
        System.out.println("Repairing a car");
    }

    public static void main(String st[]){
        Car obj = new Car();
        obj.drive();
    }

}