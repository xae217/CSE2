// Xavier Escobar
// March 17th, 2015
// CSE 002
// waves.java will generate waves of numbers using user input
import java.util.Scanner;

public class waves{
    //main method
    public static void main(String[] args) {
        //declare an instance of the Scanner method
        Scanner myScanner = new Scanner(System.in);
        //set input to a value outside desired range [1,30]
        int input = 0;
        //first loop checks for correct input 
        //checks if input is outside desired range
        while (input < 1 || input > 30 ) {
                //if true then asks user for input again
            System.out.print("Enter a number between 1 and 30: ");
            //checks if input is an int
            while(!myScanner.hasNextInt()) {
                //takes wrong input and discards it
                myScanner.next();
                //if not then asks again
                System.out.print("Enter a number between 1 and 30: ");
            }
            //once correct input is entered it is stored in a variable
            input = myScanner.nextInt();
        }
        //Waves Loops:
        System.out.println("");
        //for loop begins
        System.out.println("FOR LOOP:");
        //outer loop keeps track of the number being printed
        for (int i = 1; i <= input; i++) {
            //if i is odd then this loop will run with a descendant pattern
            for (int j = i; j > 0 && i % 2 != 0; j--){
                for (int k = j; k > 0; k--) {
                    System.out.print(i);
                }
                System.out.println("");
            }
            //if it is even then this loop will run with an ascendant pattern
            for (int j = 1; j <= i && i % 2 == 0 ; j++){
                for (int k = j; k > 0; k--) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }//for loop ends
        System.out.println("");
        //while loop begins
        System.out.println("WHILE LOOP:");
        int i = 1, j = 0, k=0;
        while (i <= input) {
            j = i;
            //similarly, 2 sets of nested loops for 2 different patterns
            //if odd then run this loop
            while (j > 0 && i % 2 != 0) {
                k = j;
                while (k > 0) {
                    System.out.print(i);
                    k--;
                }
                System.out.println("");
                j--;
            }
            j = 1;
            //if i is even then run this loop
            while (j <= i && i % 2 == 0) {
                k = j;
                while (k > 0) {
                    System.out.print(i);
                    k--;
                }
                System.out.println("");
                j++;
            }
            i++;
        }// while loop ends
        System.out.println("");
        //do while loop begins
        System.out.println("D0-WHILE LOOP:");
        //reset useful variables  
        i = 1; j = 0; k=0;
        do {
            j = i;
            //if statement to check if i is even or odd
            //if it is even
            if (i % 2 != 0) {
                do {
                    k = j;
                    do {
                        System.out.print(i);
                        k--;
                    } while (k > 0);
                    System.out.println("");
                    j--; 
                } while (j > 0);
            }
            //if it is even then:
            else {
                j = 1;
                do {
                    k = j;
                    do {
                        System.out.print(i);
                        k--;
                    } while (k > 0);
                    System.out.println("");
                    j++;
                } while (j <= i);
            }
            i++;
        //outer do-while loop ends
        } while (i <= input);
        
        System.out.println("");
        
    }//end main method
}//end class

