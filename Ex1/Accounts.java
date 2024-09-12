import java.util.Scanner;
class account {
    String accno;
    String name;
    int age;
    double balance;
    double minBalance;
    account(String accno, String name, int age, double balance){
        this.accno= accno;
        this.name= name;
        this.age= age;
        this.balance= balance;
        this.minBalance= 2000;
    }
    public void deposit(double amt){
        System.out.println("Depositing "+amt);
        balance+= amt;      
        System.out.println(amt+" deposited to account "+accno);
    }  
    public void withdraw(double amt){
        System.out.println("Withdrawing "+amt);
        if(balance-amt < minBalance)
        System.out.println("Insufficient balance!");
        else{
            balance-= amt;
            System.out.println(amt+" withdrawn from account "+ accno);
        }
    }
    public void updateMinBal(double amt){
        minBalance= amt;
        System.out.println("Minimum balance for account "+accno+" updated to "+ minBalance);
    }
    public void displayDetails(){
        System.out.println("===================================");
        System.out.println("Account no: "+accno);
        System.out.println("Name of holder: "+name);
        System.out.println("Age: "+age);
        System.out.println("Balance: "+balance);
        System.out.println("Minimum balance: "+minBalance);
        System.out.println("===================================");
    }
}
public class Accounts{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        account accounts[]= new account[100];
        int c= 0,i;
        while(true){
            System.out.print("1)Add new account\n2)Show current accounts\n3)Show account details\n4)Perform transactions\n5)Exit\nEnter your choice: ");
            int ch= sc.nextInt();
            String acno;
            switch(ch){
                case 1:
                    System.out.println("Creating new account");
                    System.out.print("Account no.: ");
                    String accno= sc.next();
                    System.out.print("Name: ");
                    String name= sc.next();
                    System.out.print("Age: ");
                    int age= sc.nextInt();
                    System.out.print("Balance: ");
                    double bal= sc.nextDouble();
                    account ac= new account(accno, name, age, bal);
                    accounts[c]= ac;
                    c++;
                    System.out.println("Added account successfully!");
                    break;
                case 2:
                    System.out.println("Acc. no.\t\tName\t\tAge\tBalance");
                    for(i=0;i<c;i++)
                    System.out.println(accounts[i].accno+"\t\t"+accounts[i].name+"\t\t"+accounts[i].age+"\t"+accounts[i].balance);
                    break;
                case 3:
                    System.out.print("Enter the account no.: ");
                    acno= sc.next();
                    for(i=0;i<c;i++){
                        if(accounts[i].accno.equals(acno))
                            accounts[i].displayDetails();
                    }
                    break;
                case 4:
                    System.out.print("Enter the account no.: ");
                    acno= sc.next();
                    account acc= new account("default","-",0,0);
                    double amt;
                    for(i=0;i<c;i++){
                        if(accounts[i].accno.equals(acno))
                        acc= accounts[i];
                    }
                    if(acc.accno.equals("default")){
                        System.out.println("Account doesn't exist!");
                        break;
                    }
                    System.out.print("1) Withdraw\n2) Deposit\n3) Check balance\n4) Update min bal\n5) Logout\nEnter your choice: ");
                    int choice= sc.nextInt();
                    switch(choice){
                        case 1:
                            System.out.print("Enter the amount: ");
                            amt= sc.nextDouble();
                            acc.withdraw(amt);
                            acc.displayDetails();
                            break;
                        case 2:
                            System.out.print("Enter the amount: ");
                            amt= sc.nextDouble();
                            acc.deposit(amt);
                            acc.displayDetails();
                            break;
                        case 3:
                            acc.displayDetails();
                            break;
                        case 4:
                            System.out.print("Enter the new min. bal: ");
                            amt= sc.nextDouble();
                            acc.updateMinBal(amt);
                            break;
                        case 5:
                            System.out.println("Logged out.");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 5:
                    System.out.println("Exitting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}