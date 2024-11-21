
import java.util.*;
class Thread1 extends Thread{
    ArrayList<Integer> primes= new ArrayList<>();
    public void run(){
        for(int i=2;i<50000;i++){
            if(isPrime(i)) primes.add(i);
        }
    }
    boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0 && n!=i)
            return false;
        }
        return true;
    }
    public ArrayList<Integer> getPrimes(){
        return primes;
    }
}
class Thread2 extends Thread{
    ArrayList<Integer> series= new ArrayList<>();
    int value= 2;
    public void run(){
        series.add(1);
        series.add(2);
        while(value<=50000){
            value= 0;
            for(int i: series){
                value+=i;
            }
            series.add(value);
        }
    }
    public ArrayList<Integer> getSeries(){
        return series;
    }
}
class Thread3 extends Thread{
    ArrayList<Integer> common= new ArrayList<>();
    ArrayList<Integer> series = new ArrayList<>();
    ArrayList<Integer> primes= new ArrayList<>();
    Thread3(ArrayList<Integer> pri, ArrayList<Integer> ser){
        primes= pri;
        series= ser;
    }
    public void run(){
        for(int i: series){
            if(primes.contains(i))
            common.add(i);
        }
    }
    public ArrayList<Integer> getCommon(){
        return common;
    }
}

public class NumberCount{
    public static void main(String[] args) {
        Thread1 thread1= new Thread1();
        Thread2 thread2= new Thread2();
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        ArrayList<Integer> primes= thread1.getPrimes();
        ArrayList<Integer> series= thread2.getSeries();
        Thread3 thread3= new Thread3(primes, series);
        thread3.start();
        try{
            thread3.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        ArrayList<Integer> common= thread3.getCommon();
        System.out.println("Primes between 0 to 50000:");
        for(int i:primes) System.out.println(i);
        System.out.println("Series: ");
        for(int i:series) System.out.println(i);
        System.out.println("Common terms:");
        for(int i: common) System.out.println(i);
    }
}