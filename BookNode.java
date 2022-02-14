/**
 * A class representing a book stocked in a bookstore.
 * This class's instance variables include ISBN number(String), title(String), author(String), number of pages(int), and price(double)
 * @author Michael Cummings
 * @version 12.10.21
 */

public class BookNode
{
    public String isbn_num;
    public String title;
    public String author;
    public int num_pages;
    public double price;
    
    public BookNode next;
    /**
     * Constructor for objects of class BookNode
     * @param book_isbn, book_title, book_author, book_page_count, book_price
     */
    public BookNode(String book_isbn, String book_title, String book_author, int book_page_count, double book_price)
    {
        this.isbn_num = book_isbn;
        this.title = book_title;
        this.author = book_author;
        this.num_pages = book_page_count;
        this.price = book_price;
        
        this.next = null;
    }
}
