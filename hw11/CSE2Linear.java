// Xavier Escobar
// April 14th, 2015
// CSE 002
// CSE2Linear.java
import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    //main method
    public static void main(String[] args) {
        //create new scanner object
        Scanner myScanner = new Scanner(System.in);
        //create new arrays of size 15
        int [] grades = new int [15];
        //ask user to input numbers for the array
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        //call checkInput to check if the user input is valid
        grades = checkInput(grades, myScanner);
        //print the array by calling the print method
        System.out.print("The grades sorted are: ");
        print(grades);
        //ask user for a grade to search for
        System.out.print("Enter a grade to search for: ");
        //store user input in a variable
        int input = myScanner.nextInt();
        //call binarySearch to search for the target
        binarySearch(grades, input);
        //call scramble method to randomly sort the grade array
        System.out.println("Scrambled:");
        grades = scramble(grades);
        //print grade array
        print(grades);
        //ask user again for a grade to search for
        System.out.print("Enter a grade to search for: ");
        //store user input in variable
        input = myScanner.nextInt();
        //call linearSeach method to perform a search on the target
        linearSearch(grades, input);
    }//end main
    
    //create a method that validates user input
    public static int[] checkInput(int[] grades, Scanner myScanner) {
        for(int i = 0; i < grades.length; i ++) {
            //if user input is an int:
            if(myScanner.hasNextInt()) {
                //then store input
                int input = myScanner.nextInt();
                //if input is in the range [0,100] then;
                if (input >= 0 && input <= 100) {
                    //check if the input is greater or equal to the previous
                    if (i == 0) {
                        grades[i] = input;
                    }
                    else if (grades[i-1] <= input) {
                        grades[i] = input;
                    }
                    //if not then print error message
                    else {
                        System.out.println("You did not enter a grade " + 
                            "greater or equal to the previous one.");
                        i--;//set i back one iteration
                    }
                }
                //if user input is not an int inside range, print error message
                else {
                    System.out.println("You did not enter a grade between " +
                        "0 and 100.");
                    i--;//set i back one iteration
                }
            }
            //if user does not enter an int then print error message
            else {
                myScanner.next();
                System.out.println("You did not enter an integer.");
                i--;//set i back one iteration
            }
        }
        //return the filled array
        return grades;
    }//end checkInput method
    
    //create method to print a array
    public static void print(int [] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print( list[i] + " ");
        }
        System.out.println("");
    }//end print method
    
    //create a method that performs a binary search
    //note ouput is void sice it doesn't not need to return the index of found target
    public static void binarySearch(int[] list, int target) {
        //declare and intialize necessary variables
        int high = list.length - 1;
        int low = 0;
        int mid = 0 ;
        int i = 0;
        //create a while loop that runs as long as there exists an upper half and lower half
        while (high >= low) {
            //mid is set to the middle of the array
            mid = (low + high) / 2;
            //if the target is less than the middle (lower half)
            if (target < list[mid]) {
                //the value of mid -1 as the new high
                high = mid - 1;
                //counts how many iterations
                i++;
            }
            //if the target is found in the array
            else if (target == list[mid]) {
                //print that the target was found and in how many iterations
                System.out.println(target + " was found with " + i +
                    " iterations." );
                //exit method
                return;
            }
            //if the target is greater than the mid (upper half)
            else {
                //set the value of mid+1 as the new low
                low = mid + 1;
                i++;
            }
        }
        //if the number was not found, then loop stops running and the program
        //  prints the message and how many iterations, which otherwise wouldn't
        System.out.println(target + " was not found with " + i + " iterations.");
    }//end binarySearch method
    
    //create a method that randomly sorts an array
    public static int[] scramble(int[] list) {
        //create a new random object
        Random rand = new Random();
        //create a new array of same length as input array (list)
        int [] scrambledList = new int[list.length];
        //create for loop
        for (int i = 0; i < list.length; i++) {
            //generates a random number and stores it in a variable
            //the random numbers range from [0,14]
            int randIndex = rand.nextInt(list.length);
           
            //create boolean variable that will serve as a trigger
            boolean trigger = true;
            //for the first iteration...
            if (i == 0) {
                //...store any random number inside the range in the array at 0
                scrambledList[i] = randIndex;
            }
            //nested for loop to check if a particular randIndex has already been asigned
            for (int j = 0; j < i; j++) {
                //if randIndex has already been asigned to a previous 
                //  position in the array then:
                if (randIndex == scrambledList[j]) {
                    //set trigger to false
                    trigger = false;
                    break;//exit nested for loop
                }
                //if randIndex has not been asigned to a previous 
                //   position in the array then:
                else {
                    //set trigger to true
                    
                    trigger = true;
                }
            }//end nested for loop

            //if randIndex is free to be asigned then:
            if (trigger) {
                //fills array with indexes in random order
                scrambledList[i] = randIndex;
            }
            //if randIndex is not free to be asigned then:
            else {
                //set i back one iteration
                i--;
            }
        }//end for loop
        //create a new list to get the scrambled values
        int [] list2 = new int[list.length];
        for( int i = 0; i < list.length; i++) {
            list2[scrambledList[i]] = list[i];
        }
        return list2;//return the new list
    }//end scramble class
    
    //create linear search method
    public static void linearSearch(int[] list, int target) {
        int i = 0;
        for (i = 0; i < list.length; i++) {
            //if target is found then:
            if (list[i] == target) {
                //print message and number of iterations
                System.out.println(target + " was found with " + (i+1) +
                    " iterations." );
                return;//exit method
            }
        }
        //if target was not found print message and number of iterations
        System.out.println(target + " was not found with " + i +
                    " iterations." );
    }//end linearSearch method
}//end class