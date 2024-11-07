import java.util.*;

class Employee{
    int age, id;
    String name;
    Employee(int age, int id, String name){
        this.age= age;
        this.name= name;
        this.id= id;
    }
}
public class EmployeeList {
    static LinkedList<Employee> emps= new LinkedList<Employee>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("1) Insert 2) Show in order");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
            }
        }
    }    
}
