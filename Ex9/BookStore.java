import java.util.*;
class Book{
    String name;
    String author;
    String bookId;
    float price;
}
public class BookStore {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Vector<Book> books= new Vector<>();
        while(true){
            System.out.println("1) Insert 2) Delete 3) Update 4) Display");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                System.out.print("Enter the book name: ");
                String name= sc.nextLine();
                System.out.print("Enter the author: ");
                String auth= sc.nextLine();
                System.out.print("Enter the price: ");
                float pri= sc.nextFloat();
                System.out.print("Enter the book ID: ");
                String bookId= sc.next();
                Book book= new Book();
                books.add(book);
                break;
                case 2:
                System.out.print("Enter the book ID: ");
                String bid= sc.nextLine();
                for(Book b : books){
                    if(b.bookId.equals(bid)) books.remove(b);
                }
                break;
                case 3:
                System.out.print("Enter the book ID: ");
                String id= sc.nextLine();
                break;
                case 4:
                System.out.print("Enter the book ID: ");
                String selId= sc.next();
                for(Book cb: books){
                    if(selId.equals())
                }
            }

        }
    }
}
