import java.util.*;
public class PrintQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        Iterator<Integer> it= pq.iterator();
        pq.forEach((Integer a) -> {
            System.out.println(a);
        });
        Scanner sc= new Scanner(System.in);
        System.out.println("1) Insert 2) Delete 3) Empty queue");
        while(true){
        int ch= sc.nextInt();
        switch(ch){
            case 1:
            System.out.print("Enter the size of job: ");
            pq.add(sc.nextInt());
            System.out.println("Job submitted successfully.");
            break;
            case 2:
            System.out.print("Enter the file size: ");
            if(pq.remove(sc.nextInt())){
                System.out.println("Job removed.");
            }
            else
            System.out.println("No such job.");
            break;
            case 3:
            while(!pq.isEmpty()){
                System.out.println("Job of size "+pq.poll()+" completed.");
            }
            System.out.println("All jobs finished.");
            break;
            case 4:
            System.out.println("Exiting.");
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
    }
}