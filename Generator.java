import java.util.Scanner;
// import java.util.ArrayList;
import java.util.Random;

public class Generator {
        
        public static void main(String[] args){
        String password="" ;
        String intList ="0123456789";
        String smallLetter ="abcdefghijklmnopqrstuvwxyz";
        String bigLetter ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String character = "!@#$%^&*()";
        int length;
        
            try(Scanner myObj = new Scanner(System.in)){
                System.out.println("Enter the length of the password");

                length = myObj.nextInt();
                System.out.println("You entered "+ length+".");
            }
            for(int i=0;i<length;i++){

                Random rand = new Random();
                int option = rand.nextInt(4);

                if(option==0){
                    int place = rand.nextInt(intList.length());
                    Character charc = intList.charAt(place);
                    password+=charc;
                }
                else if(option==1){
                    int place = rand.nextInt(smallLetter.length());
                    password+= (smallLetter.charAt(place));
                }

                else if(option==2){
                    int place = rand.nextInt(bigLetter.length());
                    password+=(bigLetter.charAt(place));
                }

                else if(option==3){
                    int place = rand.nextInt(character.length());
                    password+=(character.charAt(place));
                }

        }
        System.out.println("Your password is: "+ password);
            }
        }
        
