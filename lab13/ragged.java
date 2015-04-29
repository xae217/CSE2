// Xavier Escobar
// April 23, 2015
// CSE 002
// Ragged.java
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ragged{
    //main method
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] ragged = new int [5][];
        ragged[0] = new int [5];
        ragged[1] = new int [8];
        ragged[2] = new int [2*3+5];
        ragged[3] = new int [3*3+5];
        ragged[4] = new int [4*3+5];
        
        for(int i=0; i < ragged.length; i++) {
            for(int j = 0; j < ragged[i].length; j++) {
                ragged[i][j] = rand.nextInt(40);
            }
        }
        System.out.println("Before sort:");
        printArray(ragged);
        for(int i = 0; i < ragged.length; i++) {
            Arrays.sort(ragged[i]);
        }
        System.out.println("After sort:");
        printArray(ragged);
        
        int[][] rectangle = new int [5][ragged[4].length];
        for(int i = 0; i < rectangle.length; i++) {
            for(int j = 0; j < ragged[i].length; j++) {
                rectangle[i][j] = ragged[i][j];
            }
        }
        System.out.println("After sort and copying:");
        printArray(rectangle);
        
    }
    
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print( "[ ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( array[i][j] + " ");
            }
            System.out.println( "]");
        }
    }//end printArray
}