// 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public static void main(String st[]) {
        Dog obj = new Dog("Husky", "Huskey");
        System.out.print("The name of the Dog is : " + obj.name + "and the breed is : " + obj.breed);
    }

}