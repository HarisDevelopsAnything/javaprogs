import java.util.*;
class twime {
    public static void main(String[] args) {
        twinPrime(100);
    }
    static void twinPrime(int n) {
        for(int i=2;i<=n;i++){
            if(isPrime(i)&&isPrime(i+2))
                System.out.println("("+i+", "+(i+2)+")");
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i<n;i++)
            if(n%i==0)
                return false;
        return true;
    }
}
