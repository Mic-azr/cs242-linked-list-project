/**
 * Driver class for a LinkedList using the BookNode data type
 *
 * @author Michael Cummings
 * @version 12.10.2021
 */

public class Main
{
    /**
     * Main method
     */
    public static void main(String[] args)
    {
        LinkedBookList new_list = new LinkedBookList();
        
        BookNode book_A = new BookNode("0743455967", "On Writing: A Memoir of the Craft", "Stephen King", 297, 18.99); //All book information from the CWMars library catalog 
        BookNode book_B = new BookNode("9780451223296", "The Mist", "Stephen King", 230, 15.99);
        BookNode book_C = new BookNode("9781119680451", "Java All-in-One for Dummies", "Doug Lowe", 880, 29.99);
        BookNode book_D = new BookNode("0590409433", "Fallen Angels", "Walter Dean Myers", 309, 15.99);
        BookNode book_E = new BookNode("1495083373", "Hardwired... To Self-Destruct Transcibed Score", "Metallica", 154, 19.99);
        
        new_list.append(book_A); //Adding element book_A to end of new_list
        new_list.prepend(book_B); //Adding element book_B to beginning of new_list
        new_list.insertAt(book_B, book_C); //Adding element book_C after book_B in new_list
        new_list.insertAt(book_B, book_D); //Adding element book_D after book_B in new_list
        new_list.prepend(book_E);
        
        new_list.printBookList();
        
        System.out.println();
        System.out.println("List after removing tail:");
        new_list.removeAfter(book_C);
        
        new_list.printBookList();
        
        System.out.println();
        System.out.println("Searching for a specific ISBN: ");
        new_list.searchISBN("9780451223296");
    }

    
}
