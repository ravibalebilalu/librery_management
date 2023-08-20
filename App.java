 
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
 
import java.util.LinkedList;

import Utility.Book;
import Utility.Patron;
import Utility.Librery;
import java.util.Scanner;

public class App {

   
   
 public static void main(String[] args) {
        //book title,authors and isbn10 in the form of array
     String [] book_title = { "The Hunger Games" , "Harry Potter and the Philosopher's Stone" , "Twilight" , "To Kill a Mockingbird" , "The Great Gatsby" , "The Fault in Our Stars" , "The Hobbit or There and Back Again" , "The Catcher in the Rye" , "Angels & Demons " , "Pride and Prejudice" , "The Kite Runner " , "Divergent" , "Nineteen Eighty-Four" , "Animal Farm: A Fairy Story" , "Het Achterhuis: Dagboekbrieven 14 juni 1942 - 1 augustus 1944" , "Män som hatar kvinnor" , "Catching Fire" , "Harry Potter and the Prisoner of Azkaban" , " The Fellowship of the Ring" , "Mockingjay" };
     String [] authors = { "Suzanne Collins" , "J.K. Rowling, Mary GrandPré" , "Stephenie Meyer" , "Harper Lee" , "F. Scott Fitzgerald" , "John Green" , "J.R.R. Tolkien" , "J.D. Salinger" , "Dan Brown" , "Jane Austen" , "Khaled Hosseini" , "Veronica Roth" , "George Orwell, Erich Fromm, Celâl Üster" , "George Orwell" , "Anne Frank, Eleanor Roosevelt, B.M. Mooyaart-Doubleday" , "Stieg Larsson, Reg Keeland" , "Suzanne Collins" , "J.K. Rowling, Mary GrandPré, Rufus Beck" , "J.R.R. Tolkien" , "Suzanne Collins" };
     String [] isbn10 = { "439023483" , "439554934" , "316015849" , "61120081" , "743273567" , "525478817" , "618260307" , "316769177" , "1416524797" , "679783261" , "1594480001" , "62024035" , "451524934" , "452284244" , "553296981" , "307269752" , "439023491" , "043965548X" , "618346252" , "439023513" };     
     
     //lists to Book object
      LinkedList<Book> bookDetails = new LinkedList<Book>();
      for(int i=0;i < book_title.length;i++){
        Book book = new Book();
        book.setTitle( book_title[i]);
        book.setAuthor(authors[i]);
        book.setIsbn( isbn10[i]);
        bookDetails.add(book); 
      }
        //adding Books to librery
         
         Librery librery = new Librery();
         for(int i =0; i < bookDetails.size();i++){
         librery.addBook(bookDetails.get(i));}

         Scanner selector = new Scanner(System.in);
         System.out.println("Are you librerian[L] or reader[R]?");

         String selection = selector.nextLine();
         if(selection.equals("R")){
          /*reader code */ 
          System.out.println("Are you a member of this librery? [Y] or [N]");
          String isMember = selector.nextLine();
          if(isMember.equals("N")){
            System.out.println("Take membership for this librery .");
            /*new membership code */
          }else if(isMember.equals("N")){
            /*check membership */
            System.out.println("Give Your name and id");
          }




         }else if (selection.equals("L")){
          System.out.println("Librerian");
         }
          
          
}
}