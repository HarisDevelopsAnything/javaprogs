import java.util.*;

class ListADT <T> {
    int index;
    int size;
    Object arr[];
    ListADT (int size){
        index= 0;
        this.size= size;
        arr = new Object[size];
    }
    void insert(T ele){
        if(index==size-1){
            System.out.println("List is full!");
            return;
        }
        arr[index]= ele;
        index++;
    }
    void sort(Comparator<T> comp){
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j--){
                if(comp.compare((T)arr[j],(T)arr[j+1])>0){
                    T temp= (T)arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void delete(T ele){
        for(int i=0;i<index;i++){
            if(arr[i].equals(ele)){
                System.out.println("Deleted "+arr[i]);
                for(int j=i+1;j<index;j++){
                    arr[j-1] = arr[j];
                }
                index--;
                return;
            }
        }
        System.out.println("No such element!");
        return;
    }
    void display(){
        System.out.println("Current list:");
        for(int i=0;i<index;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}

public class ListADT{
    
}