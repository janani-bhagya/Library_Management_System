package Library;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int publishYear;
    private String ISBN;
    private int Availability;
    private double price;

    public Book(){}

    public Book(String name, String author, String publisher, int publishYear, String ISBN, int Availability, double price){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.ISBN = ISBN;
        this.Availability = Availability;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAvailability() {
        return Availability;
    }

    public double getPrice() {
        return price;
    }
}