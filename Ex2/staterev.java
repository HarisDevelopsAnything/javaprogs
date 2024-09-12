import java.util.*;
public class staterev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String in= sc.nextLine();
        String words[]= in.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.print(reverseWord(words[i])+" ");
        }
        System.out.println();
    }
    static String reverseWord(String word){
        if(word.length()>=1 && word.length()<=3)
        return word;
        else{
            String rev= "";
            for(int i= word.length()-1;i>=0;i--)
            rev+=word.charAt(i);
            return rev;
        }
    }
}
