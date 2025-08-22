// 16. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.


abstract class Shape {
   abstract void calculateArea();
   abstract void calculatePerimeter();
}

abstract class Circle extends Shape {
    void calculateArea(){
        
        System.out.println("Area of Circle is :  π · r * r");
    }
    void calculatePerimeter(){
        System.out.println("perimeter of Circle is : 2 · π · r");
    }
    
}

 
abstract  class Triangle extends Shape {
    void calculateArea(){
        System.out.println("Area of Triangle is :  1/2 * l * b");
    }
    void calculatePerimeter(){
    System.out.println("Perimeter of Triangle is :  a+b+c");   
    }
    
}


class A  {

    public static void main(String st[]){
      Circle obj = new A();
      Triangle obj1 = new A();

      obj.calculateArea();
      obj.calculatePerimeter();
      obj1.calculateArea();
      obj1.calculatePerimeter();




    }
}


