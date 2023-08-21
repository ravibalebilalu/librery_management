 
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
         
         System.out.println("           Welcome to RK LIBRERY \n Explore the world of books, knowledge, and imagination!");

         Scanner selector = new Scanner(System.in);
         String flag = "run";


    while (!(flag.equals("exit"))){
         System.out.println("\n \nAre you librerian[L] or reader[R] or want exit[exit]?");

         String selection = selector.nextLine();
         flag = selection;
         if(selection.equals("R")){
          /*reader code */ 
          System.out.println("Are you a member of this librery? [Y] or [N]");
          String isMember = selector.nextLine();

          if(isMember.equals("N")){
            System.out.println("Take membership for this librery .");
            /*new membership code */
            
            Patron newPatron = new Patron();
            System.out.println("Enter Your name :");
            String new_name = selector.nextLine();
            newPatron.setName(new_name);
            int new_id = librery.patronList.size() + 1;
            newPatron.setId(new_id);
            librery.AddPatron(newPatron);
            System.out.println("\nCongrats " + newPatron.getName() + " you are a member of librery!\n you can lend books");
            System.out.println("Name :" + new_name + "\nId : " + newPatron.getId());
            
               
            


          }else if(isMember.equals("Y")){
            /*check membership */
            System.out.println("Give Your name and id");
            String name_string = selector.nextLine();
            int  id_number = selector.nextInt();
            int verified_id = librery.checkPatron(id_number); 
            Patron verified = librery.patronList.get(verified_id - 1);

            System.out.println("\nYou are verified!\n");

            System.out.println("Select option \n 1 : for lending book\n 2 : for return book");
            int memberAction = selector.nextInt();
            if(memberAction == 1){
              //book lending

              System.out.println("\nSelect the book:");
              librery.showBookShelf();

              int selected_book_id = selector.nextInt();
              Book selected_book = librery.bookShelf.get(selected_book_id - 1);
              System.out.println("\n \nYou picked the book!");
              selected_book.display();

              librery.lendBook(selected_book,verified);
              verified.borrowBook(selected_book);
              System.out.println("\nThe book " + selected_book.getTitle() + " is lended to " + verified.getName());
              System.out.println("Happy reading!");




            }else if(memberAction == 2){
              //book return code
               System.out.println("\n \nWhich book you want to return?");
                 int count = 1;
                 for(Book book:verified.borrowedBooks){
                  System.out.println(count + " : for " +book.getTitle());
                  count++;

                 }
                 int returnBookIndex = selector.nextInt();
                 Book returningBook = verified.borrowedBooks.get(returnBookIndex - 1);
                 verified.returnBook(returningBook);
                 librery.acceptBook(returningBook);
                 
                 System.out.println("The book "+ returningBook.getTitle() + " is accepted from " + verified.getName() );
                 System.out.println("I hope you enjoyed the book!");
               }

            
            

            
          }




         }else if (selection.equals("L")){
           //librerian code
           System.out.println("Select options: \n 1 : Add book \n 2 : View Bookshelf");
           
           String LibrerianChoice = selector.nextLine();
           if(LibrerianChoice.equals("1")){
            //add book code
            System.out.println("Book title :");
            String new_title = selector.nextLine();
            System.out.println("Author :");
            String new_author = selector.nextLine();
            System.out.println("Isbn10 :");
            String new_isbn = selector.nextLine();
            
            Book new_book = new Book();
            new_book.setTitle(new_title);
            new_book.setAuthor(new_author);
            new_book.setIsbn(new_isbn);

            librery.addBook(new_book);

           }else if(LibrerianChoice.equals("2")){
            librery.showBookShelf();
           }
           



         }else if (selection.equals("exit")){
          flag = "exit";
         }
           
          
 }//while loop ends here
 selector.close();
  
 
}
}