package Library;

import java.util.Scanner;

import static Library.Main.databaseBook;
import static Library.Main.databaseUser;

public class AdminOpp {
    public void newMember() {
        Scanner scanner = new Scanner(System.in);
        String name, address, email, phone, username="", password, memberID, payment;

        System.out.print("Enter name - ");
        name = scanner.nextLine();
        System.out.print("Enter address - ");
        address = scanner.nextLine();
        System.out.print("Enter email - ");
        email = scanner.nextLine();
        System.out.print("Enter phone - ");
        phone = scanner.nextLine();
        System.out.print("Payment (Paid/Not Paid) - ");
        payment = scanner.nextLine();

        memberID = username + phone;
        Members mem = new Members(name, address, email, phone, memberID, payment);
        databaseUser.newMember(mem);

        Admins retun = new Admins();
        retun.menu();
    }

    public void addBook() {
        String name, author, ISBN, publisher;
        int publishYear, availability;
        double price;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name: ");
        name = scanner.nextLine();

        System.out.println("Enter book author: ");
        author = scanner.nextLine();

        System.out.println("Enter ISBN: ");
        ISBN = scanner.nextLine();

        System.out.println("Enter book publisher: ");
        publisher = scanner.nextLine();

        System.out.println("Enter publish year: ");
        publishYear = scanner.nextInt();

        System.out.println("Enter price: ");
        price = scanner.nextDouble();

        System.out.println("Enter Availability: ");
        availability = scanner.nextInt();

        Book book = new Book(name, author, publisher, publishYear, ISBN, availability, price);
        databaseBook.addBook(book);

        Admins retun = new Admins();
        retun.menu();
    }

    public void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book you want to delete: ");
        String bookName = scanner.nextLine();
        System.out.print(bookName);
        databaseBook.deleteBook(bookName);
        Admins retun = new Admins();
        retun.menu();
    }

    public void searchMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the member you want to search: ");
        String memberName = scanner.nextLine();
        databaseUser.searchMember(memberName);
        Admins retun = new Admins();
        retun.menu();
    }

    public void searchBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book you want to search: ");
        String bookName = scanner.nextLine();
        databaseBook.searchBook(bookName);
        Admins retun = new Admins();
        retun.menu();
    }
}
