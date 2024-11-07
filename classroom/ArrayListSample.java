import java.util.*;
public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>(10);
        ArrayList<Integer> oddlist = new ArrayList<Integer>();
        ArrayList<Integer> evenlist = new ArrayList<Integer>();
        alist.add(3);
        alist.add(4);
        alist.add(5);
        alist.add(7);
        Iterator<Integer> it= alist.iterator();
        while(it.hasNext()){
            Integer curr= it.next();
            if((int)curr%2==0){
                evenlist.add(curr);
            }
            else
            oddlist.add(curr);
        }
        System.out.println("Odd list: ");
        Iterator<Integer> oit = oddlist.iterator();
        while(oit.hasNext()){
            System.out.println((int)oit.next());
        }
        System.out.println("Even list: ");
        Iterator<Integer> eit = evenlist.iterator();
        while(eit.hasNext()){
            System.out.println((int)eit.next());
        }
        System.out.println("Odd list reversed:");
        while(oddlist.size()!=0){
            System.out.println(oddlist.getLast());
            oddlist.removeLast();
        }
        System.out.println("Even list reversed:");
        while(evenlist.size()!=0){
            System.out.println(evenlist.getLast());
            evenlist.removeLast();
        }
    }
}
