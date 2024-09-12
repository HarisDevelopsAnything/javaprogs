import java.util.*;
public class username {
    public static void main(String[] args) {
        String usr;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the username: ");
        usr= sc.next();
        if(Character.isLetter(usr.charAt(0))){
            if(usr.length()>=8 && usr.length()<=30){
                for(int i=0;i<usr.length();i++){
                    if(Character.isLetterOrDigit(usr.charAt(i))==false){
                        if(usr.charAt(i)!='_'){
                            System.out.println("Invalid special character found! Only underscore allowed.");
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Valid username!");
            }
            else{
                System.out.println("Username length should be between 8-30 characters.");
                System.exit(0);
            }
        }
        else{
            System.out.println("Username should begin with letter!");
            System.exit(0);
        }
    }
}
