 
import javax.sound.sampled.SourceDataLine;

import Utility.Book;
import Utility.Patron;

public class App {
 public static void main(String[] args) {
       Patron ravi = new Patron();
       ravi.setName("Ravi kiran");
       ravi.setId(001);
       ravi.borrowBook("python");
       ravi.borrowBook("java");
       ravi.allBooks();
       ravi.returnBook("python");
       ravi.allBooks();
 }   
}
