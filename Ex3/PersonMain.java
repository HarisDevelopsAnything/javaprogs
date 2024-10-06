import java.util.*;
class Person{
    String name;
    int age;
    String addr;
    Person(String n, int a, String ad){
        name = n;
        age = a;
        addr = ad;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Addr: "+ addr);
    }
}
class Student extends Person{
    String rollno;
    String dept;
    double m1, m2, m3;
    double CGPA;
    Student(String n, int a, String ad, String r, String d, double m1, double m2, double m3){
        super(n, a, ad);
        rollno = r;
        dept= d;
        this.m1= m1;
        this.m2= m2;
        this.m3= m3;
    }
    void computeCGPA(){
        CGPA= (m1+m2+m3)/30;
    }
    void display(){
        super.display();
        System.out.println("Roll: "+rollno);
        System.out.println("Dept: "+dept);
        System.out.println("CGPA: "+CGPA);
    }
}
class Staff extends Person{
    String dept;
    String doj;
    double basicpay;
    Staff(String name, int age, String addr, String d, String date, double b){
        super(name, age, addr);
        dept= d;
        doj= date;
        basicpay=b;
    }
    void display(){
        super.display();
        System.out.println("Dept.: "+dept);
        System.out.println("Date of joining: "+doj);
        System.out.println("Basicpay: "+ basicpay);
    }
}
class NonTeachingStaff extends Staff{
    double all, sal;
    NonTeachingStaff(double all, String name, int age, String addr, String d, String date, double b){
        super(name, age, addr, d, date, b);
        this.all= all;
    }
    void computeSalary(){
        sal= basicpay+all;
    }
    void display(){
        super.display();
        System.out.println("Salary: "+sal);
    }
}
class TeachingStaff extends Staff{
    double hra, da, ded, sal;
    TeachingStaff(double hra, double da, double ded, String name, int age, String addr, String d, String date, double b){
        super(name, age, addr, d, date, b);
        this.hra= hra;
        this.da= da;
        this.ded= ded;
    }
    void computeSalary(){
        sal= basicpay+hra+da-ded;
    }
    void display(){
        super.display();
        System.out.println("Salary: "+sal);
    }
}
public class PersonMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Person people[]= new Person[100];
        while(true){
            System.out.println("1) Add new person 2) Show details of a person 3) Exit");
            
        }
    }
}
