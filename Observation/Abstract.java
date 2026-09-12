package Observation;
import java.util.Scanner;
abstract class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    abstract void display();

}
class Mybook extends Book{
    int price;
    Mybook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();

        Mybook book = new Mybook(title,author,price);
        book.display();
        



    }
}
