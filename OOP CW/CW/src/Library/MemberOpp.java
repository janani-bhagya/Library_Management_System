package Library;

import java.util.Date;
import java.util.Scanner;

import static Library.Main.databaseBook;

public class MemberOpp {
    String memberId;

    BookData bookData = new BookData();
    Members retun = new Members();

    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of book : ");
        String bookName = scanner.nextLine();
        databaseBook.borrowBook(bookName);;
        retun.menu();
    }

    public void returnBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of book : ");
        String bookName = scanner.nextLine();
        databaseBook.returnBook(bookName);;
        retun.menu();
    }
    public void searchBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book you want to search: ");
        String bookName = scanner.nextLine();
        databaseBook.memsearchBook(bookName);
        retun.menu();
    }

    public void renewMembership() {
        System.out.println("Meet the admin and renew membership");
        System.out.println("charge is RS:2500.00");
        retun.menu();

    }

    public void buyMembership() {
        System.out.println("Meet the admin and buy premium membership");
        System.out.println("charge is RS:5000.00");
        retun.menu();
    }

    public void calculateFine(){
        System.out.println("Meet the admin");
        System.out.println("Thank you");
    }

    public void payFine() {
        System.out.println("Meet the admin");
        System.out.println("Thank you");
    }

    public void exit() {
        System.out.println("Exiting... Thank you!");
    }
}
