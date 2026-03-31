class BookArray 
{
    String title, author;
    double price;

    BookArray(String t, String a, double p) 
    {
        title = t;
        author = a;
        price = p;
    }

    public static void main(String[] args) 
    {
        BookArray[] books = new BookArray[2];
        books[0] = new BookArray("Java", "Author A", 500);
        books[1] = new BookArray("OOPS", "Author B", 600);
        
        for(BookArray b : books) 
        {
            System.out.println(b.title + " - " + b.price);
        }
    }
}
