// 5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.


class Book {

    String title;
    String author;
    String ISBN;


    void addBook(String title,String author,String ISBN ){
        System.out.println("The book is added  : ");
        System.out.print(title,author,ISBN)
    }

    void removeBook(String title,String author,String ISBN){
         System.out.println("The removed book  is : ");
         System.out.print(title,author,ISBN)
    }

    public static void main(String st[]){
        Book obj = new Book();
        obj.addBook("JAVA", "CG", "423984816");
        obj.removeBook("JAVA", "CG", "423984816");
    }

    
}
