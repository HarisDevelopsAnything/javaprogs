import java.util.*;
class Item {
    String name;
    String itemid;
    double pp;
    double sp;
    int expdate;
    String dop;
    Item(String name, String itemid, double pp, int expdate, String dop){
        this.name= name;
        this.itemid= itemid;
        this.pp= pp;
        this.sp= pp;
        this.expdate= expdate;
        this.dop= dop;
    }
    public void CalculateSellingPrice(){
        double profit;
        if(expdate>=3)
        profit=8;
        else if(expdate==2)
        profit=6;
        else
        profit=4;
        sp=pp*(1+profit/100);
    }
    public void displayDetails(){
        System.out.println("===============================");
        System.out.println("Name: "+name);
        System.out.println("ID: "+itemid);
        System.out.println("Date of purchase: "+dop);
        System.out.println("Expiry in: "+expdate+" days");
        System.out.println("Purchase price: "+pp);
        System.out.println("Selling price: "+sp);
        System.out.println("===============================");
    }
}
class Grocery {
    public static void main(String args[]){
        Item items[]=new Item[100];
        Scanner sc= new Scanner(System.in);
        System.out.println("Grocery store management");
        System.out.println("Enter your choice: ");
        System.out.println("1) Add item 2) List items 3) Show item details 4) Exit");
        int c=0;
        while(true){    
            System.out.print("Enter your choice: ");
            int ch= sc.nextInt();
            String name, id, dop;
            int ed;
            double pp;
            switch(ch){
                case 1:
                    System.out.print("Enter ID: ");
                    id= sc.next();
                    System.out.print("Enter the name: ");
                    name= sc.next();
                    System.out.print("Enter date of purchase: ");
                    dop= sc.next();
                    System.out.print("Enter days until expiry: ");
                    ed= sc.nextInt();
                    System.out.print("Enter the purchase price: ");
                    pp= sc.nextDouble();
                    Item it= new Item(name, id, pp, ed, dop);
                    it.CalculateSellingPrice();
                    items[c]= it;
                    c++;
                    System.out.println("Added 1 item.");
                    break;
                case 2:
                    System.out.println("ID:\t\tName:\t\tDOP\t\tExp:\t\tPurchase:\t\tSell:");
                    for(int i=0; i<c;i++){
                        Item ci= items[i];
                        System.out.println(ci.itemid+"\t\t"+ci.name+"\t\t"+ci.dop+"\t\t"+ci.expdate+"\t\t"+ci.pp+"\t\t"+ci.sp);
                    }
                    break;
                case 3:
                    System.out.print("Enter the item id: ");
                    id= sc.next();
                    int f=0;
                    for(int i=0;i<c;i++){
                        if(items[i].itemid.equals(id)){
                        items[i].displayDetails();
                        f=1;
                        break;
                        }
                    }
                    if(f==0)
                    System.out.println("Item not found!");
                    break;
                case 4:
                    System.out.println("Thank you.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
