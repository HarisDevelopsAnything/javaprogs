import java.util.*;
class Account{
    String accNo;
    String name;
    double balance;
        int actype;
    Account(String accNo, String name, double balance, int actype){
            this.accNo= accNo;
            this.name= name;
            this.balance= balance;
            this.actype= actype;
    }
    void deposit(double amt){
        balance+= amt;
        System.out.println("Deposited Rs. " + amt);
        System.out.println("Current bal.:" + balance);
        }
    void display(){
            System.out.println("Acc no: "+ accNo);
            System.out.println("Name: "+ name);
            System.out.println("Balance: "+ balance);
    }
    void withdraw(double amt){
                balance -= amt;
                System.out.println("Withdrawn "+ amt);
}
}
class SavingsAccount extends Account{
    static double minBal= 2000;
    static double roi= 5;
    SavingsAccount(String accNo, String name, double balance){
            super(accNo, name, balance, 0);
    }
    void display(){
            super.display();
            System.out.println("Min bal: " + minBal);
            System.out.println("Rate of interest: "+ roi);
            System.out.println("Type of account : Savings");
    }
    void deposit(double amt){
            balance+= amt;
            System.out.println("Deposited Rs. " + amt);
            System.out.println("Current bal.:" + balance);
    }
    void withdraw(double amt){
            if(balance-amt>=minBal){
                    balance -= amt;
                    System.out.println("Withdrawn "+ amt);
            }
            else
                    System.out.println("Insufficient funds");
    }
}
class OverdraftAccount extends Account{
    static double overlimit = -2000;
    static double roi= 5;
    static double sc= 2;
    OverdraftAccount(String accNo, String name, double balance){
            super(accNo, name, balance, 1);
    }
    void display(){
            super.display();
            System.out.println("Overdraft limit: "+ overlimit);
            System.out.println("Account type: Overdraft");
    }
    void deposit(double amt){
            if(balance+amt<0){
                    System.out.println("You still have a debt of "+balance);
                    balance+=amt-amt*sc/100;
            }
            else
                    balance+=amt;
            System.out.println("Rs. "+amt+" deposited!");
    }
    void withdraw(double amt){
            if(balance-amt < overlimit){
                    System.out.println("Insufficient funds!");
                    return;
            }
            balance-=amt;
            System.out.println("Withdrawn Rs. "+amt);
    }
}
public class Main{
    public static void main(String args[]){
        Account[] aclist= new Account[10];
        Scanner sc= new Scanner(System.in);
        int c=0;
        int ch;
        while(true){
                System.out.println("1) Create account 2) Access account 3) Exit");
                System.out.print("Enter your choice: ");
                ch= sc.nextInt();
                switch(ch){
                        case 1:
                        System.out.println("1) Savings 2) Overdraft");
                        System.out.print("Enter the type of account: ");
                        int t= sc.nextInt();
                        System.out.print("Enter the name: ");
                        String n= sc.next();
                        System.out.print("Enter the acc.no: ");
                        String acn= sc.next();
                        System.out.print("Enter the initial funds: ");
                        double b= sc.nextDouble();
                        switch(t){
                                case 1:
                                SavingsAccount sa= new SavingsAccount(acn, n, b);
                                aclist[c]= sa;
                                break;
                                case 2:
                                OverdraftAccount oa= new OverdraftAccount(acn, n, b);
                                aclist[c]= oa;
                                break;
                        }
                        c++;
                        break;
                        case 2:
                        for(int i=0;i<c;i++)
                        aclist[i].display();
                        System.out.print("Enter account no.: ");
                        String sel= sc.next();
                        int index=-1;
                        int f=0;
                        for(int i=0;i<c;i++){
                                if(aclist[i].accNo.equals(sel)){
                                        index= i;
                                }
                        }
                        if(index==-1){
                                System.out.println("No such account!");
                                break;
                        }
                        Account ob;
                        if(aclist[index].actype==0){
                                ob= (SavingsAccount)aclist[index];
                        }
                        else{
                                ob= (OverdraftAccount)aclist[index];
                        }
                        System.out.println("1) Deposit 2) Withdraw 3) Logout");
                        System.out.print("Enter the choice:");
                        int choice= sc.nextInt();
                        switch(choice){
                                case 1:
                                System.out.print("Enter the amount: ");
                                double amt= sc.nextDouble();
                                ob.deposit(amt);
                                break;
                                case 2:
                                System.out.print("Enter the amount: ");
                                double a= sc.nextDouble();
                                ob.withdraw(a);
                                break;
                                case 3:
                                System.out.println("You are logged out.");
                                break;
                                default:
                                System.out.println("Invalid choice.");
                        }
                        break;
                        case 3:
                        System.out.println("Exiting");
                        System.exit(0);
                        default:
                        System.out.println("Invalid choice!");
                        break;
                }

        }
    }
}