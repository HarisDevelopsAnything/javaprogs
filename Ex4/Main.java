import java.util.*;
interface QueueADT {
    static int size= 10;
    int arr[]= new int[10];
    abstract void Enqueue(int ele) throws QueueFullException;
    abstract void Dequeue() throws QueueEmptyException;
    abstract int Front() throws QueueEmptyException;
    abstract int Rear() throws QueueEmptyException;
    abstract void display();
}
class QueueFullException extends Exception{
    QueueFullException(){
        super("Queue is full!");
    }
}
class QueueEmptyException extends Exception{
    QueueEmptyException(){
        super("Queue is empty!");
    }
}
class Queue implements QueueADT{
    int front, rear;
    Queue(){
        front=0;
        rear=0;
    }
    public void Enqueue(int ele){
        if(front == rear && front == 0){
            arr[rear]= ele;
            rear++;
            return;
        }
        else if(rear<size-1)
        {
            rear++;
            arr[rear]= ele;
        }
        else
        try{
            throw new QueueFullException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        display();
    }
    public void Dequeue(){
        if(front == rear+1){
            try{
                throw new QueueEmptyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else
        {
            front++;
        }
        display();
    }
    public int Front(){
        return(arr[front]);
    }
    public int Rear(){
        return(arr[rear]);
    }
    public void display(){
        System.out.println("Current queue is: ");
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Queue q= new Queue();
        q.Dequeue();
        int ch;
        while(true){
            System.out.println("1) Enqueue 2) Dequeue 3) Front 4) Rear 5) Display 6) Exit");
            System.out.print("Enter your choice: ");
            ch= sc.nextInt();
            switch(ch){
                case 1:
                System.out.print("Enter the element: ");
                int e= sc.nextInt();
                System.out.println("Adding 1 element...");
                q.Enqueue(e);
                break;
                case 2:
                System.out.println("Removing element...");
                q.Dequeue();
                break;
                case 3:
                System.out.println("Front: "+ q.Front());
                break;
                case 4:
                System.out.println("Rear: "+ q.Rear());
                break;
                case 5:
                q.display();
                break;
                case 6:
                System.out.println("Exitting...");
                System.exit(0);
                default:
                System.out.println("Invalid choice!");
                break;
            }
        }
    }
}
