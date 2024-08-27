import java.util.*;
class pascal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(" ");
        System.out.println("1");
        for(int i=0;i<n-1;i++)
            System.out.print(" ");
        System.out.println("1 1");
        for(int i=1;i<n;i++){
            for(int j=1; j<=n;j++){
                if(j<n-i)
                System.out.print(" ");
                else if(j==n-i)
                System.out.print("1 ");
                else
                System.out.print((i+1)+" ");
            }
            System.out.println("1");
        }
    }
}