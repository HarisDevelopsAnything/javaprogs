class PolyTerm{
    int pow, coe;
    PolyTerm(){
        pow=0;
        coe=0;
    }
    PolyTerm(int coe, int pow){
        this.pow= pow;
        this.coe= coe;
    }
    PolyTerm multiply(PolyTerm p1, PolyTerm p2){
        PolyTerm product= new PolyTerm(p1.pow+p2.pow, p1.coe*p2.coe);
        return product;
    }
    PolyTerm add(PolyTerm p1, PolyTerm p2){
        PolyTerm sum= new PolyTerm(p1.pow, p2.coe+p1.coe);
        return sum;
    }
    void display(){
        System.out.print(this.coe+"x^"+this.pow+" ");
    }
}
class PolyEqn{
    PolyTerm arr[];
    PolyEqn(){
        arr= new PolyTerm[0];
    }
    void insert(PolyTerm p){
        PolyTerm newarr[]= new PolyTerm[arr.length + 1];
        int c=0;
        for(PolyTerm t : arr){
            newarr[c]= t;
            c++;
        }
        newarr[newarr.length-1]= p;
        arr= newarr;
        sort();
    }
    void sort(){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j].pow < arr[j+1].pow){
                    PolyTerm temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    void display(){
        for(PolyTerm t : arr){
            if(t.coe >0)
            System.out.print("+");
            t.display();
        }
        System.out.println();
    }
}
public class poly{
    public static void main(String[] args) {
        PolyEqn pe= new PolyEqn();
        PolyTerm pt= new PolyTerm(5,2);
        PolyTerm pt1= new PolyTerm(7,5);
        PolyTerm pt2= new PolyTerm(-8,7);
        PolyTerm pt3= new PolyTerm(4,1);
        pe.insert(pt);
        pe.insert(pt1);
        pe.insert(pt2);
        pe.insert(pt3);
        pe.display();
    }
}