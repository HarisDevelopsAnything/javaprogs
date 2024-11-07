import java.util.*;
public class SynAnt{
    static HashMap<String, String> synmap= new HashMap<>();
    static HashMap<String, String> antmap= new HashMap<>();
    static HashMap<String, String> merged= new HashMap<>();
    static String words[];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of words:");
        int n= sc.nextInt();
        words= new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the word "+(i+1)+": ");
            String word= sc.next();
            words[i]= word;
        }
        for(int i=0;i<n;i++){
            System.out.print("Enter the syn for "+words[i]+": ");
            String syn= sc.next();
            synmap.put(words[i], syn);
        }
        for(int i=0;i<n;i++){
            System.out.print("Enter the ant for "+words[i]+": ");
            String ant= sc.next();
            antmap.put(words[i], ant);
        }
        int ch=0;
        while(ch!=4){
        System.out.println("1) Delete a word 2) Merge the dicts 3) Display meaning 4) Exit");
        System.out.print("Enter your choice: ");
        ch= sc.nextInt();
        switch(ch){
            case 1:
            System.out.print("Enter the word: ");
            deleteWord(sc.next());
            break;
            case 2:
            mergeDicts();
            System.out.println("Merged the dictionaries.");
            break;
            case 3:
            System.out.println("Enter the word: ");
            meaningOf(sc.next());
            break;
            case 4:
            System.out.println("Exiting.");
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
    }
    static void deleteWord(String word){
        if(synmap.containsKey(word)){
            synmap.remove(word);
            antmap.remove(word);
            merged.remove(word);
            System.out.println("Word "+word+" removed.");
        }
        else
        System.out.println("No such word.");
    }
    static void mergeDicts(){
        for (String key : synmap.keySet()) {
            merged.put(key, "Synonym:"+synmap.get(key)+" Antonym:"+antmap.get(key));
        }
        for(String key : merged.keySet()){
            System.out.println(key+" => "+merged.get(key));
        }
    }
    static void meaningOf(String word){
        if(!synmap.containsKey(word)){
            System.out.println("No such word.");
            return;
        }
        System.out.println("Synonym: "+synmap.get(word));
        System.out.println("Antonym: "+antmap.get(word));
    }
}