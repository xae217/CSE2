// Xavier Escobar
// March 6th, 2015
// CSE 002
// zigzag.java will generate a * zigzag
import java.util.Scanner;

public class zigzag{
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int nStars = 0;
        // infinite loop to check if user wants to keep using the program
        while (true) {
            //checks if input is not within the desired range
            while (nStars < 3 || nStars >33) {
                //if true then asks user for input again
                System.out.print("Enter an int between 3 and 33: ");
                //checks if input is an int
                while(!myScanner.hasNextInt()) {
                    //takes wrong input and discards it
                    myScanner.next();
                    //if not then asks again
                    System.out.print("Enter an int between 3 and 33: ");
                }
                //store user input in variable
                nStars = myScanner.nextInt();
            }
        
            for (int i=1; i < nStars; i++) {
                //prints a line of *
                System.out.print("*");
            
            }
            System.out.print("");
            int j = 0;// initializes useful variable
            for (int i=0; i < nStars - 1; i++ ) {
                //prints * after each space/s
                System.out.println("*");
            
                j++;
                for ( int k = j; k > 0 && k < nStars - 1; k--) {
                    //add spaces incrementaly
                    System.out.print(" ");
                }
            }
            //prints another * line
            for (int i=0; i < nStars; i++) {
            
                System.out.print("*");
            
            }
            System.out.println(""); 
            //asks user if they want to use the program again
            System.out.print("Enter y or Y to go again: "); 
            String again = myScanner.next();
            //input is not y or Y then break
            if ( !(again.equals("y") || again.equals("Y"))){
                break;
                }
            //reset nStars
            nStars = 0;
        }      
        
    }//end main method
}//end class