// 2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

class a {
    public static void main(String[] args) {

        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        String s;
        try {
            System.out.println("Enter a number");
            s = br.readLine();
            int x = Integer.parseInt(s);
            if (x % 2 == 0) {
                System.out.print("The number is even");
            } else
                System.out.print("The number is odd");

        } catch (java.io.IOException e) {
        } catch (NumberFormatException e) {
            System.out.print("enter the integer only");
        }

    }
}