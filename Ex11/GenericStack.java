import java.util.Comparator;
import java.util.Scanner;

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name= name;
        this.age= age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("______");
    }
}
class StackADT <T> {
    Object arr[];
    int top;
    int size;
    StackADT(int cap){
        size= cap;
        top=-1;
        arr= new Object[size];
    }
    void push(T ele){
        if(top==size-1){
            System.out.println("Stack is full!");
            return;
        }
        arr[++top]= ele;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack empty!");
            return;
        }
        System.out.print("Popped ");
        if(arr[top] instanceof Person)
        System.out.println(((Person)arr[top]).name);
        else
        System.out.println(arr[top]);
        top--;
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element: "+ arr[top]);
        return;
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("The elements in stack: ");
        for(int i=0;i<top;i++){
            if(!(arr[i] instanceof Person))
            System.out.println(arr[i]);
            ((Person)arr[i]).display();
        }
    }
}

public class GenericStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Integer 2) Person 3) Float");
        int dch = sc.nextInt();

        StackADT<Integer> intList = null;
        StackADT<Person> personList = null;
        StackADT<Float> floatList = null;
        switch (dch) {
            case 1:
                intList = new StackADT<>(10);
                break;
            case 2:
                personList = new StackADT<>(10);
                break;
            case 3:
                floatList = new StackADT<>(10);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }
        while (true) {
            System.out.println("1) Push 2) Pop 3) Peek 4) Display 5) Exit");
            System.out.print("Enter the choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter value to push:");
                    if (intList != null) {
                        intList.push(sc.nextInt());
                    } else if (personList != null) {
                        System.out.print("Enter person name: ");
                        String name= sc.next();
                        System.out.print("Enter person age: ");
                        int age= sc.nextInt();
                        personList.push(new Person(name, age));
                    } else if (floatList != null) {
                        floatList.push(sc.nextFloat());
                    }
                    break;
                case 2:
                    if (intList != null) {
                        intList.pop();
                    } else if (personList != null) {
                        personList.pop();
                    } else if (floatList != null) {
                        floatList.pop();
                    }
                    break;
                case 3:
                    System.out.println("Sorting the list");
                    if (intList != null) {
                        intList.peek();
                    } else if (personList != null) {
                        personList.peek();
                    } else if (floatList != null) {
                        floatList.peek();
                    }
                    break;
                case 4:
                    if (intList != null) {
                        intList.display();
                    } else if (personList != null) {
                        personList.display();
                    } else if (floatList != null) {
                        floatList.display();
                    }
                    break;
                case 5:
                System.out.println("Exiting.");
                System.exit(0);
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
