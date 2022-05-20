package student_spr2022;
import java.util.*; 

public class Student_spr2022 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word :");//scanner
        String myWord = scan.nextLine();
        //System.out.print(word);
        //char[] test = new char[5];
        //test[0]='M';
        //test[1]='a';
        //test[2]='R';
        //test[3]='c';
        //test[4]='O';
        
        char[] myLetter = new char[myWord.length()];
                
        for (int i = 0; i < myLetter.length; i++) {
            myLetter[i] = myWord.charAt(i);
        }
 
        System.out.println("Printing in reverse order");
        
        for (int i = myLetter.length-1; i >= 0; i--){
        System.out.println(myLetter[i]);
        }       
        
        //for (char c : ch) {
          //  System.out.println(c);
        
    }

}
