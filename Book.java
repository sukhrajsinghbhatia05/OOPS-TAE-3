import java.util.ArrayList; [cite: 5]

class Book {
    String title, author, ISBN; [cite: 5]
    Book(String title, String author, String ISBN) {
        this.title = title; this.author = author; this.ISBN = ISBN;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>(); [cite: 5]

    void addBook(Book b) { books.add(b); } [cite: 6]
    
    void removeBook(String isbn) { [cite: 6]
        books.removeIf(b -> b.ISBN.equals(isbn));
    }

    void displayBooks() { [cite: 6]
        for (Book b : books) System.out.println(b.title + " by " + b.author);
    }
}
