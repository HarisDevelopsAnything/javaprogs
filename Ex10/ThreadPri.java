import java.util.*;

class PriThread extends Thread{
    public int priority;
    public int delay;
    PriThread(int pri, int del){
        priority= pri;
        delay= del;
        setPriority(priority);
    }
    public void run(){
        try{
            sleep(delay);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thread priority: "+ priority);
        System.out.println("Thread delay: "+delay);   
    }
}
public class ThreadPri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the no. of thread:");
        n= sc.nextInt();
        PriThread[] threads= new PriThread[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the delay of thread "+(i+1)+": ");
            int d= sc.nextInt();
            System.out.print("Enter the thread priority: ");
            int p= sc.nextInt();
            PriThread thread= new PriThread(p,d);
            threads[i] = thread;
        }
        //bubble sorting threads
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(threads[j].getPriority()<threads[j+1].getPriority()){
                    PriThread temp= threads[j];
                    threads[j]= threads[j+1];
                    threads[j+1]= temp;
                }
            }
        }
        for(PriThread t : threads){
            t.start();
            try{
                t.join();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
