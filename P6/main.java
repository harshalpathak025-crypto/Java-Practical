
class Book {
    String title;
    String author;
    double price;

    // No-argument constructor
    Book() {
        title = "Rich Dad & Poor Dad";
        author = "Robert Kiyosaki";
        price = 180.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    // Display method
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling",500.0);
        Book b3 = new Book(b2);

        System.out.println("Book 1:");
        b1.display();

        System.out.println("Book 2:");
        b2.display();

        System.out.println("Book 3 (Copied from Book 2):");
        b3.display();

        // Modify the copied object
        b3.title = "Advanced Java";
        b3.price = 700.0;

        System.out.println("After modifying the copied object:");

        System.out.println("Original Book (b2):");
        b2.display();

        System.out.println("Copied Book (b3):");
        b3.display();
    }
}

