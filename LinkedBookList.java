/**
 * A class representing a LinkedList containing elements of data type BookNode
 * @author Michael Cummings
 * @version 12.10.2021
 */

public class LinkedBookList
{
    private BookNode head;
    private BookNode tail;

    /**
     * Constructor for objects of class LinkedBookList
     */
    public LinkedBookList()
    {
       head = null;
       tail = null;
    }
    
    /**
     * Method to add a new BookNode to the end of a LinkedBookList
     */
    public void append(BookNode new_node)
    {
        if(head == null) //checks for empty list, if empty, new_node is made head of list
        {
            head = new_node;
            tail = new_node;
        }
        else //list is not empty
        {
            tail.next = new_node;
            tail = new_node;
        }
    }
    /**
     * Method to add a new BookNode to the beginning of a LinkedBookList
     */
    public void prepend(BookNode new_node)
    {
        if(head == null) //checks for empty list, if empty, new_node is made head of list
        {
            head = new_node;
            tail = new_node;
        }
        else
        {
            new_node.next = head;
            head = new_node;
        }
    }
    /**
     * Method to add a new BookNode at the position immediately after another existing BookNode 
     */
    public void insertAt(BookNode current_node, BookNode new_node)
    {
        if(head == null) //checks for empty list, if empty, new_node is made head of list
        {
            head = new_node;
            tail = new_node;
        }
        else if (current_node == tail) //checks if current_node is at the end of the list
        {
            tail.next = new_node;
            tail = new_node;
        }
        else
        {
            new_node.next = current_node.next;
            current_node.next = new_node;
        }
    }
    /**
     * Method to remove a BookNode's successor from a LinkedBookList
     */
    public void removeAfter(BookNode current_node)
    {
        if(current_node == null && head != null) //Case to remove head node by passing current_node == null
        {
            BookNode succeeding_node = head.next;
            head = succeeding_node;
            if(succeeding_node == null)//last item in the list was removed
            {
                tail = null;
            }
        }
        else if(current_node.next != null)
        {
            BookNode succeeding_node = current_node.next.next;
            current_node.next = succeeding_node;
            if(succeeding_node == null)
            {
                tail = current_node; //Remove tail
            }
        }
    }

    /**
     * A method to search for a specific BookNode by its isbn_num data member
     * @param int isbn_num
     */
    public void searchISBN(String book_isbn)
    {
        BookNode node = head;
        System.out.println(String.format("%-20s" + "\t" + "%-50s" + "\t" + "%-30s" + "\t" + "%-10s" + "\t" + "%s", "ISBN", "Title", "Author", "No. Pages", "Price USD"));
        while(node != null)
        {
            if(node.isbn_num.equals(book_isbn))
            {
                System.out.println(String.format("%-20s" + "\t" + "%-50s" + "\t" + "%-30s" + "\t" + "%-10d" + "\t" + "$%5.2f", node.isbn_num, node.title, node.author, node.num_pages, node.price));
            }
            node = node.next;
        }
    }
    
    /**
     * Method to print the LinkedBookList as an array
     */
    public void printBookList()
    {
      BookNode node = head;
      System.out.println(String.format("%-20s" + "\t" + "%-50s" + "\t" + "%-30s" + "\t" + "%-10s" + "\t" + "%s", "ISBN", "Title", "Author", "No. Pages", "Price USD"));
      while (node != null) {
         System.out.println(String.format("%-20s" + "\t" + "%-50s" + "\t" + "%-30s" + "\t" + "%-10d" + "\t" + "$" + "%5.2f", node.isbn_num, node.title, node.author, node.num_pages, node.price));
         node = node.next;
      }
      System.out.println();
    }
}
