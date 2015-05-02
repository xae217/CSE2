// Xavier Escobar
// April 10th, 2015
// CSE 002
// Search.java
import java.util.Scanner;

public class Search{
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int [] array1 = new int[50];
        for (int i = 0; i < array1.length; i++) {
  		    array1[i] = (int) (Math.random() * 100);
        }
        //search for maximum and minimum values of the array
        int minimum = 100;
        int maximum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < minimum) {
                minimum = array1[i];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > maximum) {
                maximum = array1[i];
            }
        }
        System.out.println("The maximum of array1 is: " + maximum);
        System.out.println("The minimum of array1 is: " + minimum);
        //crate a increasing random array
        int [] array2 = new int[50];
        for (int i = 0; i < array2.length; i++) {
            if (i == 0) {
                array2[i] = (int) (Math.random() * 100);
            }
            else {
  		        array2[i] = (int) (Math.random() * 100) + array2[i-1];
            }
        }
        int minimum2 = array2[0];
        int maximum2 = array2[49];
        System.out.println("The maximum of array2 is: " + maximum2);
        System.out.println("The minimum of array2 is: " + minimum2);
        //ask user for input
        System.out.println("Enter an int >= 0:");
        int input = 0;
        if (myScanner.hasNextInt()){
            input = myScanner.nextInt();
            if(input < 0) {
               System.out.println("You did not enter an int >= 0"); 
               return;
            }
        }
        else {
            System.out.println("You did not enter an int"); 
            return;
        }
        int high = array2.length - 1;
        int low = 0;
        int index = 0;
        int found = 0;
        int mid = 0 ;
        while (high >= low) {
            mid = (low + high) / 2;
            if (input < array2[mid]) {
                high = mid - 1;
            }
            else if (input == array2[mid]) {
                 index = mid;
                 found = 1;
                 System.out.println("Number was found.");
                 break;
            }
            else {
                low = mid + 1;
            }
        }
        
        if (found == 0){
            System.out.println("Number above key: " + array2[mid-1]);
            System.out.println("Number above key: " + array2[mid]);
        }
    }//end main method
}//end class