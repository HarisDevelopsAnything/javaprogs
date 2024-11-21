import java.util.*;
class Employee{
    String name;
    int id;
    Employee(String n, int i){
        name= n;
        id= i;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("____");
    }
}
class QueueADT <T> {
    int front, rear;
    int cap;
    Object arr[];
    QueueADT(int size){
        cap= size;
        front = -1;
        rear = -1;
        arr= new Object[size];
    }
    void enqueue(T ele){
        if(front==-1 && rear==-1){
            front++;
            rear++;
            arr[rear]= ele;
            return;
        }
        if((rear+1)%cap==front){
            System.out.println("Queue is full!");
            return;
        }
        rear= (rear+1)%cap;
        arr[rear]= ele;
    }
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Dequeued ");
        if (arr[front] instanceof Employee) {
            ((Employee) arr[front]).display();
        } else {
            System.out.println(arr[front]);
        }

        if (front == rear) {
            front = -1;  
            rear = -1;
        } else {
            front = (front + 1) % cap;  
        }
    }
    void display(){
        if(front == -1 && rear ==-1){
            System.out.println("Empty queue!");
            return;
        }
        System.out.println("All queue elements: ");
        for(int i=front;i<=rear;i++){
            if(arr[i] instanceof Employee)
            ((Employee)arr[i]).display();
            else
            System.out.println(arr[i]);
        }
    }
}

public class GenericQueue{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1) Integer 2) String 3) Employee");
        int dch = sc.nextInt();

        QueueADT<Integer> intList = null;
        QueueADT<String> strList = null;
        QueueADT<Employee> empList = null;
        switch (dch) {
            case 1:
                intList = new QueueADT<>(10);
                break;
            case 2:
                strList = new QueueADT<>(10);
                break;
            case 3:
                empList = new QueueADT<>(10);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }
        System.out.println("1) Enqueue 2) Dequeue 3) Display 4) Exit");
        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter value to enqueue:");
                    if (intList != null) {
                        intList.enqueue(sc.nextInt());
                    } else if (strList != null) {
                        strList.enqueue(sc.next());
                    } else if (empList != null) {
                        System.out.print("Enter the name: ");
                        String n= sc.next();
                        System.out.print("Enter ID: ");
                        int id= sc.nextInt();
                        empList.enqueue(new Employee(n, id));
                    }
                    break;
                case 2:
                    System.out.println("Enter value to dequeue:");
                    if (intList != null) {
                        intList.dequeue();
                    } else if (strList != null) {
                        strList.dequeue();
                    } else if (empList != null) {
                        empList.dequeue();
                    }
                    break;
                case 3:
                    if (intList != null) {
                        intList.display();
                    } else if (strList != null) {
                        strList.display();
                    } else if (empList != null) {
                        empList.display();
                    }
                    break;
                case 4:
                    System.out.println("Exiting.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}