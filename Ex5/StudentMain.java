import java.util.*;
class Student{
    String rollNo;
    String name;
    String className;
    double marks;
    double CGPA;
    static int count=0;
    Student(String r, String n, String c, double m){
        rollNo= r;
        name= n;
        className= c;
        marks= m;
        CGPA= marks/10;
    }
    public boolean equals(Student s){
        if(this.rollNo.equals(s.rollNo))
        return true;
        else
        return false;
    }
    static String toString(Student s){
        return("["+s.rollNo+", "+s.name+","+s.className+","+s.marks+","+s.CGPA+"]");
    }
    public int hashCode(){
        return Math.abs(rollNo.hashCode())%100;
    }
    void display(){
        System.out.println("Roll no.: "+ rollNo);
        System.out.println("Name: "+name);
        System.out.println("Class: "+className);
        System.out.println("Total marks: "+ marks);
        System.out.println("CGPA: "+CGPA);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c=0;
        Student students[]= new Student[100];
        System.out.println("1) Create new student 2) Show details 3) Exit");
        while(true){
            System.out.print("Enter your choice: ");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                System.out.print("Name: ");
                String name= sc.next();
                System.out.print("Classroom: ");
                String classroom= sc.next();
                System.out.print("Roll no: ");
                String roll= sc.next();
                System.out.print("Marks: ");
                double marks= sc.nextDouble();
                Student newStudent = new Student(roll, name, classroom, marks);
                int f=0;
                for(int i=0;i<c;i++){
                    if(students[i].equals(newStudent)){
                        System.out.println("Duplicate entry!");
                        f=1;
                    }
                }
                if(f!=0)
                break;
                students[newStudent.hashCode()] = newStudent;
                c++;
                System.out.println("Student added.");
                break;
                case 2:
                System.out.print("Enter roll no.:");
                String rn= sc.next();
                int f1=0;
		int index= Math.abs(rn.hashCode())%100;
                if(students[index]!=null){
                     System.out.println("String rep: "+Student.toString(students[index]));
                        students[index].display();
                        f1=1;
                    }
                if(f1==0)
                System.out.println("No such student.");
                break;
                case 3:
                System.out.println("Exiting.");
                System.exit(0);
                default:
                System.out.println("Invalid choice.");
            }
        }
    }
}
