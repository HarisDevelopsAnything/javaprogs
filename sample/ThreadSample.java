class CountThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println("Thread 1: "+i);
    }
}
class DecountThread extends Thread{
    public void run(){
        try{
        for(int i=10;i>=0;i--){
            System.out.println("Thread 2: "+i);
        }
        }
        catch(Exception e){ System.err.println(e.getMessage());}
    }
}

public class ThreadSample{
    public static void main(String[] args) {
        CountThread thread= new CountThread();
        DecountThread thread2= new DecountThread();
        try{
            thread.start();
            thread.join();
            thread2.start();
            thread2.join();
        }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
        }
    }

}