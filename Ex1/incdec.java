import java.util.*;
public class incdec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[3];
        int asc[]= new int[3];
        int des[]= new int[3];
        System.out.println("Enter the elements: ");
        for(int i=0;i<3;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<3;i++){
            asc[i]= arr[i];
            des[i]= arr[i];
        }
        for(int i=0; i< 3; i++){
            for(int j=0; j<3-i-1;j++){
                if(asc[j]>asc[j+1]){
                    int temp= asc[j];
                    asc[j]= asc[j+1];
                    asc[j+1]= temp;
                }
            }
        }
        for(int i=0; i< 3; i++){
            for(int j=0; j<3-i-1;j++){
                if(des[j]<des[j+1]){
                    int temp= des[j];
                    des[j]= des[j+1];
                    des[j+1]= temp;
                }
            }
        }
        if(Arrays.equals(arr,asc))
        System.out.println("Ascending order");
        else if(Arrays.equals(arr,des))
        System.out.println("Descending order");
        else
        System.out.println("Neither ascending nor descending");

    }
    
}
