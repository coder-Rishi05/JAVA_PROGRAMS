

class A {

    public static void main(String st[]) {
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        String a, b;
        try {

            System.out.println("Enter first number ");
            a = br.readLine();
            System.out.println("Enter second number ");
            b = br.readLine();

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            System.out.println("Sum of two numbers : " + (x + y));
        } catch (java.io.IOException e) {
            System.out.println(e);
        }

    }
}