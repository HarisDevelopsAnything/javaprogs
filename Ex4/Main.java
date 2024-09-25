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
            arr[0]= ele;
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
    }
    public void Dequeue(){
        if(front == rear && front == 0){
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
        Queue q= new Queue();
        q.Enqueue(0);
        q.Enqueue(1);
        q.Dequeue();
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        System.out.println(q.Front());
        System.out.println(q.Rear());
        q.display();
    }
}
