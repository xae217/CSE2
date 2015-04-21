// Xavier Escobar
// April 21st, 2015
// CSE 002
// Muliply.java calulates the product of 2 matrices.
import java.util.Scanner;
import java.util.Random;

public class Multiply{
    //main method
    public static void main(String[] args) {
        //create an Scanner object
        Scanner scan = new Scanner(System.in);
        //declare and initialize useful variables
        int width1 = 0, width2 = 0, height1 = 0, height2 = 0;
        //ask user to input dimensions for the matrices
        System.out.println("Enter the width and height of two matrices:");
        //while loop will keep asking until all necessary input has been
        //  aquired and verified
        while(true) { 
            //ask user for input
            System.out.print("Width  1: ");
            //call checkInput method to make sure user inputs desired input.
            width1 = checkInput(scan);
            System.out.print("Height 1: ");
            height1 = checkInput(scan);
            System.out.print("Width  2: ");
            width2 = checkInput(scan);
            System.out.print("Height 2: ");
            height2 = checkInput(scan);
            //check if the # of columns of matrix1 matches the # of rows of matrix2
            if (width1 != height2) {
                //if they are not equal then print error message and loop again
                System.out.println("Cannot compute product...");
                System.out.println("Width 1 must equal to Height 2.");
            }
            //if they are equal then break from the loop
            else {
                break;
            }
        }
        //create a matrix of random numbers with user specifications
        int[][] matrix = randomMatrix(width1,height1);
        System.out.println("This is matrix 1:");
        //call print method to print matrix1
        printMatrix(matrix);
        //create matrix 2
        int[][] matrix2 = randomMatrix(width2,height2);
        System.out.println("This is matrix 2:");
        //print matrix2
        printMatrix(matrix2);
        System.out.println("This is their product:");
        //multiply matrix1 and matrix2
        int[][] product = matrixMultiply(matrix,matrix2);
        //print the prduct of the matrices
        printMatrix(product);
    }//end main method
    
    //create a method that generates a matrix of random numbers
    public static int[][] randomMatrix(int width, int height) {
        Random rand = new Random();
        int[][] matrix = new int [height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                //fills matrix with random integers in [-10,10]
                matrix[i][j] = rand.nextInt(11) * (int) Math.pow(-1,rand.nextInt(11));;
            }//end nested for loop
        }//ed for loop
        return matrix;
    }//end randomMatrix
    
    //create a method that prints a matrix
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print( "[ ");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print( array[i][j] + " ");
            }
            System.out.println( "]");
        }
    }//end printMatrix
    
    //create a method that performs matrix multiplication
    public static int[][] matrixMultiply(int[][] a, int[][]b) {
        int[][] newMatrix = new int [a.length][b[0].length];
        if(a[0].length == b.length) {
            //controls  height1
            for(int i = 0; i < a.length; i++) {
                //control width2
                for(int j = 0; j < b[0].length; j++) {
                    //controls width1 and height2
                    for(int k = 0; k < a[0].length; k++) {
                        newMatrix [i][j] += a[i][k]*b[k][j];
                    }//end nested for loops
                }//end nested for loops
            }//end for loops
        }
        else {
            return null;
        }
        return newMatrix;
    }//end matrixMultiply method
    
    public static int checkInput(Scanner scan) {
        int input = 0;
        while(true) {
            if (scan.hasNextInt()) {
                input = scan.nextInt();
                if (input > 0) {
                    //if input is valid, then return input
                    return input;
                }//end nested if
                else {
                    //if not then print error message
                    System.out.println("You did not enter an int > 0");
                }//end nested else statement
            }
            //if user does noet enter an int
            else {
                scan.next();
                //then print error message
                System.out.println("You did not enter an integer. Try again.");
            }//end else statement
        }//end while loop
    }//end checkInput method
}//end class