import java.util.*;
class Equation{
    int a;
    int b;
    int c;
    void create(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Format ax^2 + bx +c: ");
        System.out.print("Enter a:");
        a= sc.nextInt();
        if(a==0){
            System.out.println("a can't be zero!");
            System.exit(0);
        }
        System.out.print("Enter b:");
        b= sc.nextInt();
        System.out.print("Enter c:");
        c= sc.nextInt();
    }
    void display(){
        System.out.println(a+"x^2 + "+b+"x + "+c);
    }
    void solve(){
        double x;
        x= b*b - 4*a*c;
        if(x>=0){
            double r1, r2;
            r1= (-b+Math.sqrt(x))/(2*a);
            r2= (-b-Math.sqrt(x))/(2*a);
            System.out.println("Root 1: "+r1);
            System.out.println("Root 2: "+r2);
            System.out.print("The roots are real and ");
            if(r1==r2)
            System.out.println("equal");
            else
            System.out.println("distinct");
        }
        else{
            String r1="";
            String r2="";
            r1= (-b/2)+" + "+(Math.sqrt(Math.abs(x))/2)+"i";
            r2= (-b/2)+" - "+(Math.sqrt(Math.abs(x))/2)+"i";
            System.out.println("Root 1: "+r1);
            System.out.println("Root 2: "+r2);
            System.out.print("The roots are imaginary");
        }
    }
}
public class quadratic {
    public static void main(String[] args) {
        System.out.println("Enter the equation: ");
        Equation e= new Equation();
        e.create();
        e.display();
        e.solve();
    }
}
