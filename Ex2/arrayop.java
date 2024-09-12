import java.util.*;
public class arrayop {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the initial list: ");
        int l= sc.nextInt();
        int arr[]= new int[l];
        int i,j;
        getArray(arr);
        while(true){
            System.out.println("1) Merge 2) Append 3) Delete at first 4) Rearrange odd even 5) Display 6) Exit");
            System.out.print("Enter your choice: ");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                System.out.print("Enter the size of the array to merge: ");
                int s= sc.nextInt();
                int m[]= new int[s];
                getArray(m);
                int merged[]= new int[s+l];
                for(i=0;i<s+l;i++){
                    if(i<l)
                    merged[i]= arr[i];
                    else
                    merged[i]= m[i-l];
                }
                l+=s;
                arr= merged;
                System.out.println("Merged.");
                break;
                case 2:
                System.out.print("Enter the element: ");
                int e= sc.nextInt();
                int appended[]= new int[l+1];
                for(i=0;i<l+1;i++){
                    if(i<l)
                    appended[i]= arr[i];
                    else
                    appended[i]= e;
                }
                l+=1;
                arr= appended;
                System.out.println("Appended.");
                break;
                case 3:
                if(l==0){
                    System.out.println("Array empty.");
                    break;
                }
                int removed[]= new int[l-1];
                for(i=0;i<l-1;i++){
                    removed[i]= arr[i+1];
                }
                l-=1;
                arr= removed;
                System.out.println("Removed first element");
                break;
                case 4:
                int odd=0, even=0;
                for(i=0;i<l;i++){
                    if(arr[i]%2==0){
                        even++;
                    }
                    else
                    odd++;
                }
                int oddele[]= new int[odd];
                int evenele[]= new int[even];
                int oc=0, ec=0;
                for(i=0;i<l;i++){
                    if(arr[i]%2==0){
                        evenele[ec]= arr[i];
                        ec++;
                    }
                    else{
                        oddele[oc]= arr[i];
                        oc++;
                    }
                }
                for(i=0;i<l;i++){
                    if(i<oc)
                    arr[i]= oddele[i];
                    else
                    arr[i]= evenele[i-oc];
                }
                System.out.println("Ordered.");
                break;
                case 5:
                System.out.println("The current list: ");
                showArray(arr);
                break;
                case 6:
                System.out.println("Exiting.");
                System.exit(0);
                default:
                System.out.println("Invalid choice!");
            }
        }
    }
    static void getArray(int arr[]){
        System.out.println("Enter "+arr.length+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void showArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
