import java.util.*;

public class geom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a= sc.nextInt();
        System.out.print("Enter the geometric diff.: ");
        int r= sc.nextInt();
        System.out.print("Enter the term number: ");
        int n= sc.nextInt();
        double res= a*Math.pow(r,n-1);
        System.out.println("The nth term is "+res);
    }
}