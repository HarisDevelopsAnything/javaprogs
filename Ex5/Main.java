import java.util.*;
interface PrimeTest {
    boolean isPrime(int n);
}
interface OddTest {
    boolean isOdd(int n);
}
interface PaliTest {
    boolean isPali(int n);
}
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PrimeTest isPrime = (num) -> {
            for(int i=2;i<num/2;i++){
                if(num%i==0)
                return false;
            }
            return true;
        };
        OddTest isOdd = (num) -> num%2!=0;
        PaliTest isPali = (num) -> {
            int r=0,d;
            int temp= num;
            while(num!=0){
                d=num%10;
                r=r*10+d;
                num=num/10;
            }
            if(r==temp) 
            return true;
            return false; 
        };
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println(n+" is prime: "+ isPrime.isPrime(n));
        System.out.println(n+" is odd: "+isOdd.isOdd(n));
        System.out.println(n+" is palindrome: "+isPali.isPali(n));
    }
}
