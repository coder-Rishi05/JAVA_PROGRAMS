// 13. Create a program, showing an example of method overriding

class A {

    void display(){
        System.out.println("This is A's function.");
    }

}


class B extends A {

    void display(){
        System.out.println("This is B's function which override A's function");
    }

    public static void main(String st[]){
        B obj = new B();
        obj.display();
    }
}