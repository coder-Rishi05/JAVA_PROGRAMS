// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape {
    void getArea(){
        System.out.println("area of Shape");
    }
}

class Rectangle {
    void getArea(){
        System.out.println("area of reactange is = w * h");
    }

    public static void main(String st[]){
        Rectangle obj = new Rectangle();
        obj.getArea();
    }

}
