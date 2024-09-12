import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1= sc.next().toUpperCase();
        System.out.print("Enter the second string: ");
        String s2= sc.next().toUpperCase();
        if(s1.length()!=s2.length()){
            System.out.println("Not anagrams!");
            System.exit(0);
        }
        char arr1[]= new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            arr1[i]= s1.charAt(i);
        }
        arrangeAscending(arr1);
        char arr2[]= new char[s2.length()];
        for(int i=0;i<s2.length();i++){
            arr2[i]= s2.charAt(i);
        }
        arrangeAscending(arr2);
        for(int i=0;i<s1.length();i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("Not anagrams!");
                System.exit(0);
            }
        }
        System.out.println("Anagrams");
    }
    static void arrangeAscending(char in[]){
        for(int i=0;i<in.length;i++){
            for(int j=0;j<in.length-i-1;j++){
                if(in[j]>in[j+1]){
                    char temp= in[j];
                    in[j] = in[j+1];
                    in[j+1]= temp;
                }
            }
        }
    }
}
