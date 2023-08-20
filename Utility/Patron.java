/*Patron: A class representing a library patron with 
attributes like name, ID, and a list of borrowed books. */
package Utility;
import Utility.Book;
import Utility.Librery;
import java.util.ArrayList;
import java.util.LinkedList;

public class Patron {
    private String name;
    private int id;
    public  LinkedList <Book> borrowedBooks =  new LinkedList<Book>();

    //name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //id
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

     
    
    
      
    public void borrowBook(Book book){
         borrowedBooks.add(book);
         
    }
    public void showBorrowedBooks(){
         for(Book i: borrowedBooks){
            i.display();
         }
    }
     
    public void returnBook(Book book){
        borrowedBooks.remove(book);
        
    }
}
