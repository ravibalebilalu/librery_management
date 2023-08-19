 
import javax.sound.sampled.SourceDataLine;

import Utility.Book;

public class App {
 public static void main(String[] args) {
       Book book = new Book();
       book.setTitle("python made easy");
       book.setAuthor("Corey shefer");
       book.setIsbn("56-67-34");
       book.setAvailability(true);
       book.display();
 }   
}
