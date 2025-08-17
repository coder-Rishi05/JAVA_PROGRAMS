// Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

class Animal {

    void makeSound() {
        System.out.println("Animal make sound");
    }
}

class Cat extends Animal {

    void makeSound() {
        System.out.println("Animal Bark ");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.makeSound();
    }

}
