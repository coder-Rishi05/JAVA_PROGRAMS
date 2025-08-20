// 14. Create a program, showing an example of dynamic method dispatch

class A {

void display(){
    System.out.println("Class A");
    
}

}

class B extends A {


void display(){
    System.out.println("Accessing class B function using A'reference object");
    
}

public static void main(String st[]){
    A obj = new B();
    obj.display();
}

}