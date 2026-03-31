import java.util.ArrayList;

class Book 
{
    String title, author, ISBN;

    Book(String title, String author, String ISBN) 
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}

class Library 
{
    // Managing a collection of Book objects
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) 
    {
        books.add(b);
    }
    
    void removeBook(String isbn) 
    {
        books.removeIf(b -> b.ISBN.equals(isbn));
    }

    void displayBooks() 
    {
        for (Book b : books) 
        {
            System.out.println(b.title + " by " + b.author);
        }
    }
}}
}
