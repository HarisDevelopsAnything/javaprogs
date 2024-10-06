import java.util.*;
class Person {
    String name;
    int age;
    String addr;
    Person(String n, int a, String ad) {
        name = n;
        age = a;
        addr = ad;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Addr: " + addr);
    }
}
class Student extends Person {
    String rollno;
    String dept;
    double m1, m2, m3;
    double CGPA;
    Student(String n, int a, String ad, String r, String d, double m1, double m2, double m3) {
        super(n, a, ad);
        rollno = r;
        dept = d;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    void computeCGPA() {
        CGPA = (m1 + m2 + m3) / 30;
    }
    void display() {
        super.display();
        System.out.println("Roll: " + rollno);
        System.out.println("Dept: " + dept);
        System.out.println("CGPA: " + CGPA);
    }
}
class Staff extends Person {
    String dept;
    String doj;
    double basicpay;
    Staff(String name, int age, String addr, String d, String date, double b) {
        super(name, age, addr);
        dept = d;
        doj = date;
        basicpay = b;
    }
    void display() {
        super.display();
        System.out.println("Dept.: " + dept);
        System.out.println("Date of joining: " + doj);
        System.out.println("Basic pay: " + basicpay);
    }
}
class NonTeachingStaff extends Staff {
    double all;
    double sal;
    NonTeachingStaff(double all, String name, int age, String addr, String d, String date, double b) {
        super(name, age, addr, d, date, b);
        this.all = all;
    }
    void computeSalary() {
        sal = basicpay + all;
    }
    void display() {
        super.display();
        System.out.println("Salary: " + sal);
    }
}
class TeachingStaff extends Staff {
    double hra, da, ded, sal;
    TeachingStaff(double hra, double da, double ded, String name, int age, String addr, String d, String date, double b) {
        super(name, age, addr, d, date, b);
        this.hra = hra;
        this.da = da;
        this.ded = ded;
    }
    void computeSalary() {
        sal = basicpay + hra + da - ded;
    }
    void display() {
        super.display();
        System.out.println("Salary: " + sal);
    }
}
public class PersonMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[100];
        int count = 0;
        while (true) {
            System.out.println("1) Add new person 2) Show details of a person 3) Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Select type of person:");
                System.out.println("1) Person");
                System.out.println("2) Student");
                System.out.println("3) Staff");
                int type = sc.nextInt();
                sc.nextLine();
                
                switch (type) {
                    case 1:
                        System.out.print("Name: ");
                        String name1 = sc.nextLine();
                        System.out.print("Age: ");
                        int age1 = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Address: ");
                        String addr1 = sc.nextLine();
                        people[count++] = new Person(name1, age1, addr1);
                        break;
                    case 2:
                        System.out.print("Name: ");
                        String name2 = sc.nextLine();
                        System.out.print("Age: ");
                        int age2 = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Address: ");
                        String addr2 = sc.nextLine();
                        System.out.print("Roll no.: ");
                        String rollno = sc.nextLine();
                        System.out.print("Department: ");
                        String dept1 = sc.nextLine();
                        System.out.print("Marks 1: ");
                        double m1 = sc.nextDouble();
                        System.out.print("Marks 2: ");
                        double m2 = sc.nextDouble();
                        System.out.print("Marks 3: ");
                        double m3 = sc.nextDouble();
                        Student ob1 = new Student(name2, age2, addr2, rollno, dept1, m1, m2, m3);
                        ob1.computeCGPA();
                        people[count++] = ob1;
                        break;
                    case 3:
                        System.out.println("Select type of staff:");
                        System.out.println("1) Non-Teaching Staff");
                        System.out.println("2) Teaching Staff");
                        int staffType = sc.nextInt();
                        sc.nextLine();
                        
                        switch (staffType) {
                            case 1:
                                System.out.print("Allowances: ");
                                double all = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Name: ");
                                String name4 = sc.nextLine();
                                System.out.print("Age: ");
                                int age4 = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Address: ");
                                String addr4 = sc.nextLine();
                                System.out.print("Department: ");
                                String dept3 = sc.nextLine();
                                System.out.print("Date of joining: ");
                                String doj1 = sc.nextLine();
                                System.out.print("Basic pay: ");
                                double basicpay1 = sc.nextDouble();
                                NonTeachingStaff ob2 = new NonTeachingStaff(all, name4, age4, addr4, dept3, doj1, basicpay1);
                                ob2.computeSalary();
                                people[count++] = ob2;
                                break;
                            case 2:
                                System.out.print("HRA: ");
                                double hra = sc.nextDouble();
                                System.out.print("DA: ");
                                double da = sc.nextDouble();
                                System.out.print("Deductions: ");
                                double ded = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Name: ");
                                String name5 = sc.nextLine();
                                System.out.print("Age: ");
                                int age5 = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Address: ");
                                String addr5 = sc.nextLine();
                                System.out.print("Department: ");
                                String dept4 = sc.nextLine();
                                System.out.print("Date of joining: ");
                                String doj2 = sc.nextLine();
                                System.out.print("Basic pay: ");
                                double basicpay2 = sc.nextDouble();
                                TeachingStaff ob3 = new TeachingStaff(hra, da, ded, name5, age5, addr5, dept4, doj2, basicpay2);
                                ob3.computeSalary();
                                people[count++] = ob3;
                                break;
                            default:
                                System.out.println("Invalid staff type.");
                        }
                        break;
                    default:
                        System.out.println("Invalid type.");
                }
            } else if (choice == 2) {
                System.out.print("Name of the person: ");
                String nameToSearch = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (people[i].name.equalsIgnoreCase(nameToSearch)) {
                        people[i].display();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Person " + nameToSearch + " not found.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
