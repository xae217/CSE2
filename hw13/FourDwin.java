// Xavier Escobar
// April 21st, 2015
// CSE 002
// Muliply.java calulates the product of 2 matrices.
import java.util.Scanner;
import java.util.Random;

public class FourDwin{
    //main method
    public static void main(String[] args) {
        //create a Random object
        Random rand = new Random();
        //create an Scanner object
        Scanner scan = new Scanner(System.in);
        //declare X variable
        int X = 0;
        //Ask user for input for X
        System.out.print("Enter an integer X: ");
        //while loop runs until desired input has been aquired
        while (true) {
            //if user enters and in then:
            if(scan.hasNextInt()) {
                //store input into variable
                X = scan.nextInt();
                //if input is positive, then break from loop
                if( X > 0) { 
                    break; 
                }
                //if input is =< 0 then:
                else {
                    //print error message
                    System.out.print("Invalid input. Please enter an int > 0: ");
                }
            }
            //if input is not an int then:
            else {
                scan.next();
                //print error message
                System.out.print("Invalid input. Please enter an integer: ");
            }
        }
        //similarly for variable Y
        System.out.print("Enter an integer Y > X: ");
        int Y = 0;
        while (true) {
            if(scan.hasNextInt()) {
                Y = scan.nextInt();
                //Y must be greater than zero and greater than X
                if( Y > 0 && Y > X) { 
                    break; 
                }
                //if not then print error message
                else {
                    System.out.print("Invalid input. Please enter an int > 0 " +
                        "and < X: ");
                }
            }
            //if input is not an integer then print error message
            else {
                scan.next();
                System.out.print("Invalid input. Please enter an integer");
            }
        }
         
        //create and allocate 4 dimensional array
        double four[][][][] = new double[3][][][];
        
        //allocate the jagged array and subarrays
        //  and fill the arrays with doubles
        for (int i=0; i<four.length; i++) {
            //allocate 3D arrayd
            four[i] = new double[rand.nextInt(Y - X+1) + X][][];
            for (int j=0; j<four[i].length; j++) {
                //allocate 2D arrayd
                four[i][j] = new double[rand.nextInt(Y - X+1) + X][];
                for (int k=0; k <four[i][j].length; k++){
                    //allocate 1D arrays
                    four[i][j][k] = new double[rand.nextInt(Y - X+1) + X];
                    for (int q=0; q <four[i][j][k].length; q++){
                        //intialize and fill the array with values from 0 to 30
                        four[i][j][k][q] = rand.nextInt(301)/10.0;
                    }
                }
            }
        }
        
        //call print method
        printArray(four);
        
        sort4DArray(four);
        //call sort3D method
 
        sort3DArray(four);
        //print array after sort
        System.out.println("After Sort:");
        printArray(four);
        
        statArray(four);
     
    }//end main method
    
    //create print method
    public static void printArray(double[][][][] a) {
        //print parenthesis for 4D array
        System.out.println("{");
        for (int i=0; i<a.length; i++) {
            //print parenthesis for 3D arrays
            System.out.println("    {");
            for (int j=0; j<a[i].length; j++) {
                //print parenthesis for 2D arrays
                System.out.print("        {");
                for (int k=0; k<a[i][j].length; k++){
                    //print parenthesis for 1D arrays
                    System.out.print("{");
                    for (int q=0; q<a[i][j][k].length; q++){
                        //print the value in teh inner most array
                        System.out.print(a[i][j][k][q] + ", ");
                    }
        //close arrays with parenthesis
                    System.out.print("}");
                }
                System.out.println("} ");
            }
            System.out.println("    }, ");
        }
        System.out.println("}");
        System.out.println("");
    }//end print method
    
    //create statistics method
    public static void statArray(double[][][][]a) {
        //declare and initialize variables
        double sum = 0;
        double members = 0;
        double mean = 0;
        //for loop that goes through each double in the array
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                for (int k=0; k<a[i][j].length; k++){
                    for (int q=0; q<a[i][j][k].length; q++){
                        //add up the # of members 
                        members += 1;
                        //sum up the members
                        sum += a[i][j][k][q];
                    }
                }
            }
        }
        //calculate the mean
        mean = sum/members;
        //print out the statistics
        System.out.println("Members: " + members);
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
    
    //create a selection sort array
    public static void sort3DArray(double[][][][] a) {
        //sorts the individual doubles inside the array 
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                for (int k=0; k<a[i][j].length; k++){
                    for (int q=0; q<a[i][j][k].length; q++){
                        double currentMin = a[i][j][k][q];
                        int currentMinIndex = q;
                        for (int x = q + 1; x < a[i][j][k].length; x++) {
                            if (currentMin > a[i][j][k][x]) {
                            currentMin = a[i][j][k][x];
                            currentMinIndex = x;
                            }
                        }
                        // Swap list[i] with list[currentMinIndex] if necessary
                        if (currentMinIndex != q) {
                        a[i][j][k][currentMinIndex] = a[i][j][k][q];
                        a[i][j][k][q] = currentMin;
                        }
                    }
                }
            }
        }//end outer for loop
    }//end method
    
    //create a method that sorts the 4D Array
    public static void sort4DArray(double[][][][] list) {
        int x;
        //for loop for insertion sort
        for (int i = 1; i < list.length; i++) {
            double[][][] currentElement = list[i];
             //shifts the 3D arrays   
            for (x = i - 1; x >= 0 && count(list,x) > count(list,i); x--) {
                list[x + 1] = list[x];
            } 
            //inserts the 3d array to its new position
            list[x + 1] = currentElement;
        } 
    }

    //create a method that counts the number of double in a 3D aray
    public static int count(double[][][][] list, int x) {
        int count = 0;
            for (int j=0; j < list[x].length; j++) {
                for (int k=0; k < list[x][j].length; k++){
                    count += list[x][j][k].length;
                }
            }
        //return count value
        return count;
    }
}//end class