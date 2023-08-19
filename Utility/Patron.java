/*Patron: A class representing a library patron with 
attributes like name, ID, and a list of borrowed books. */
package Utility;
import Utility.Book;
import java.util.ArrayList;

public class Patron extends Book{
    private String name;
    private int id;
    private ArrayList<String> bookList = new ArrayList<>();

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

    //list of borrowed books
    public void borrowBook(String title){
        
        this.bookList.add(title);
    }
    
    public void returnBook(String title){
        this.bookList.remove(title);
    }

    public void allBooks(){
        for(String i:bookList){
            System.out.println(i);
        }
    }
}
