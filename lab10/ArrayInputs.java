// Xavier Escobar
// April 3th, 2015
// CSE 002
// ArrayInputs.java will create an array and print its items
import java.util.Scanner;

public class ArrayInputs{
    static int abc = 0;
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer for the size of an array:");
        int arraySize = scan.nextInt();
        int [] myArray = new int[arraySize];
        System.out.println("Please enter " + arraySize + " positive integers:");
        
        for (int i = 0; i < arraySize; i++) {
            if (checkInt(scan)) {
                myArray[i] = abc;
            } 
            else {
                i--;
            }
        }
        System.out.println("The array is:");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(myArray[i]);
        }
        
    }//end main method
    
    public static boolean checkInt(Scanner scan) {
        //scan = new Scanner(System.in);
        boolean arg = true;
        if (scan.hasNextInt()) {
            int input = scan.nextInt();
            if (input >= 0) {
                //number(input)
                abc = input;
                arg = true;
            }
            else {
                arg = false;
                System.out.println("You did not enter a positive integer");
            }
        } 
        else {
            scan.next();
            arg = false;
            System.out.println("You did not enter an integer");
        }
        return arg;
    }//end checkInt method
    
    public static int number(int input) {
        int i = input;
        return i;
    }
}//end class