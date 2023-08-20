package Utility;
import java.util.ArrayList;
import java.util.LinkedList;
import Utility.Patron;
 
 
public class Librery   {
    
     
    public  LinkedList<Book> bookShelf = new  LinkedList<Book>();
    public LinkedList<Patron> patronList = new LinkedList<Patron>();
     
    //adding books
    public void addBook(Book book){
        book.setAvailability(true);
        this.bookShelf.add(book);


    }
    public void showBookShelf(){
        for(int i=0;i < bookShelf.size();i++){
            Book currentBook = bookShelf.get(i);
            System.out.println(
                i+1 + " : "+
                "\n Title : "  + currentBook.getTitle() +
                "\n Author :" + currentBook.getAuthor() +
                "\n Isbn10 :" + currentBook.getIsbn() + 
                "\n Availability :" + currentBook.getAvailability()
                );
        }
    }

    public void AddPatron(Patron patron){
        patronList.add(patron);
    }
     
    public void lendBook(Book book,Patron patron ){
        for(int i=0;i < bookShelf.size();i++){
            if (book == bookShelf.get(i) ){  
                if(book.getAvailability()){
                book.setAvailability(false);
                }
            }
        }

    }

    public void acceptBook(Book book){
        for(int i=0;i < bookShelf.size();i++){
            if (book == bookShelf.get(i) ){  
                if(book.getAvailability() != true){
                book.setAvailability( true);
                }
            }
        }

    }
}
