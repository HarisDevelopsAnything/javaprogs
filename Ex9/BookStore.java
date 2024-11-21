import java.util.*;
class Book{
    String name;
    String author;
    String bookId;
    float price;
    Book(String n, String a, String id, float p){
        name= n;
        author= a;
        bookId= id;
        price= p;
    }
}
public class BookStore {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Vector<Book> books= new Vector<>();
    
        while(true){
            System.out.println("1) Insert 2) Delete 3) Display 4) Update 5) Exit");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                System.out.print("Enter the book name: ");
                String name= sc.next();
                System.out.print("Enter the author: ");
                String auth= sc.next();
                System.out.print("Enter the price: ");
                float pri= sc.nextFloat();
                System.out.print("Enter the book ID: ");
                String bookId= sc.next();
                Book book= new Book(name, auth, bookId, pri);
                books.add(book);
                break;
                case 2:
                System.out.print("Enter the book ID: ");
                String bid= sc.next();
                for(Book b : books){
                    if(b.bookId.equals(bid)) books.removeElement(b);
                }
                break;
                case 3:
                System.out.print("Enter the book ID: ");
                String id= sc.next();
                int f= 0;
                for(Book temp : books){
                    if(temp.bookId.equals(id)){
                        System.out.println("Name: "+temp.name);
                        System.out.println("Author: "+temp.author);
                        System.out.println("Price: "+temp.price);
                        f=1;
                        break;
                    }
                }
                if(f!=1) System.out.println("Not found");
                break;
                case 4:
                System.out.print("Enter the book ID: ");
                String selId= sc.next();
                int fl=0;
                for(Book cb: books){
                    if(selId.equals(cb.bookId)){
                        fl=1;
                        System.out.println("What to update?");
                        System.out.println("1) Book name 2) Author 3) Price");
                        int ch1= sc.nextInt();
                        if(ch==1){
                        System.out.print("Enter the book name: ");
                        cb.name= sc.next();
                        }
                        else if(ch==2){
                        System.out.print("Enter the author: ");
                        cb.author= sc.next();
                        }
                        else if(ch==3){
                        System.out.print("Enter the price: ");
                        cb.price= sc.nextFloat();
                        }
                        else{
                        System.out.println("Invalid choice!");
                        break;
                        }
                        System.out.println("Updated details.");
                        break;
                    }
                }
                if(fl==0)
                System.out.println("No such book.");
                break;
                case 5:
                System.out.println("Exiting.");
                System.exit(0);
                default:
                System.out.println("Invalid choice!");
            }

        }
    }
}
