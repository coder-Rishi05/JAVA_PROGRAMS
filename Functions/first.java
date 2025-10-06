
class A {

    public static void smallestAmongThree(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                System.out.println("a is the smallest number");
            } else {
                System.out.println("c is the smallest number");

            }
        } else if (b < c) {
            System.out.println("b is the smallest number");

        } else
            System.out.println("c is the smallest number");
    }

    public static void main(String st[]) {
        
        int a = 10, b = 5, c = -30;

        smallestAmongThree(a, b, c);

    }

}