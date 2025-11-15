package Library;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
public class BookData {
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> author = new ArrayList<String>();
    ArrayList<String> publisher = new ArrayList<String>();
    ArrayList<Integer> publishYear = new ArrayList<Integer>();
    ArrayList<String> ISBN = new ArrayList<String>();
    ArrayList<Integer> Availability = new ArrayList<Integer>();
    ArrayList<Double> price = new ArrayList<Double>();

    public void Book(){
        name.add("The Great Gatsby");
        author.add("F. Scott Fitzgerald");
        publisher.add("Charles Scribner's Sons");
        publishYear.add(1925);
        ISBN.add("9780743273565");
        Availability.add(4);
        price.add(990.00);

        name.add("To Kill a Mockingbird");
        author.add("Harper Lee");
        publisher.add("J.B. Lippincott & Co.");
        publishYear.add(1960);
        ISBN.add("9780061120084");
        Availability.add(0);
        price.add(1250.50);

        name.add("1984");
        author.add("George Orwell");
        publisher.add("Secker & Warburg");
        publishYear.add(1949);
        ISBN.add("9780451524935");
        Availability.add(3);
        price.add(1500.00);
    }

    public void addBook(Book b) {
        name.add(b.getName());
        author.add(b.getAuthor());
        publisher.add(b.getPublisher());
        publishYear.add(b.getPublishYear());
        ISBN.add(b.getISBN());
        Availability.add(b.getAvailability());
        price.add(b.getPrice());

            System.out.println("Book added successfully!");
    }

    public void deleteBook(String bookName) {
        int rem = 0;
        for (int i = 0; i < this.name.size(); i++) {
            if (this.name.get(i).equals(bookName)) {
                name.remove(i);
                author.remove(i);
                publisher.remove(i);
                publishYear.remove(i);
                ISBN.remove(i);
                Availability.remove(i);
                price.remove(i);
                rem = 1;
                System.out.println(" Book deleted successfully!");
            }
        }
        if (rem != 1){
            System.out.println(" Book not found!");
        }
    }

    public void searchBook(String bookName) {
        int rem = 0;
        for (int i = 0; i < this.name.size(); i++) {
            if (this.name.get(i).equals(bookName)) {
                System.out.println("Name: " + name.get(i));
                System.out.println("Author: " + author.get(i));
                System.out.println("Publisher: " + publisher.get(i));
                System.out.println("Publish Year: " + publishYear.get(i));
                System.out.println("ISBN: " + ISBN.get(i));
                System.out.println("Availability: " + Availability.get(i));
                System.out.println("Price: " + price.get(i));
                rem = 1;
            }
        }
        if (rem != 1){
            System.out.println("Book not found!");
        }
    }

    public void borrowBook(String bookName) {
        for (int i = 0; i < this.name.size(); i++) {
            if (this.name.get(i).equals(bookName)) {
                int count = Availability.get(i);
                count--;
                Availability.set(i, count);
                System.out.println("Borrow book successfully");
            }
        }
    }



    public void returnBook(String bookName) {
        for (int i = 0; i < this.name.size(); i++) {
            if (this.name.get(i).equals(bookName)) {
                int count = Availability.get(i);
                count++;
                Availability.set(i, count);
                System.out.println("Return book successfully");
            }
        }
    }
    public void memsearchBook(String bookName) {
        int rem = 0;
        for (int i = 0; i < this.name.size(); i++) {
            if (this.name.get(i).equals(bookName)) {
                System.out.println("Name: " + name.get(i));
                System.out.println("Author: " + author.get(i));
                System.out.println("Publisher: " + publisher.get(i));
                System.out.println("Publish Year: " + publishYear.get(i));
                System.out.println("ISBN: " + ISBN.get(i));
                System.out.println("Availability: " + Availability.get(i));
                System.out.println("Price: " + price.get(i));
                rem = 1;
            }
        }
        if (rem != 1){
            System.out.println("Book not found!");
        }
    }
}
