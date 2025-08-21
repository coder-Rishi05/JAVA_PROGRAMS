// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

 class Rectangle {
    int height;
    int width;

    void area(int height, int width){
        System.out.println("The area of the rectangle is : ");
    }
    void perimeter(int height, int width){
        System.out.println("The perimeter of the rectangle is : ");

    }

    public static void main(String st[]){
        Rectangle obj = new Rectangle();
        obj.area(54, 34);
        obj.perimeter(45,12);

    }
    
}
