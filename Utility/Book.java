/*Book: A class representing a book with attributes 
like title, author, ISBN, and availability status.
 */
package Utility;
 public class Book{
    String title;
    String author;
    String isbn;
    boolean availability;

    //title
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
         return title;
    }
    //author
    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    //isbn
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }
    //availability
    public void  setAvailability(boolean availability){
        this.availability = availability;
    }

    public boolean getAvailability(){
                 return availability;
    }

    public void display(){
        System.out.println(
            title + " \n " +
            author + " \n " +
            isbn + " \n " +
            availability
        );
    }
    
    
}