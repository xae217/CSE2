// Xavier Escobar
// April 14th, 2015
// CSE 002
// CSE2Linear.java
import java.util.Scanner;
import java.util.Random;

public class Matrix{
    //main method
    public static void main(String[] args) {
        //create new scanner object
        Scanner myScanner = new Scanner(System.in);
        boolean format = false;
        int [] [] matrix = increasingMatrix(3,2, true);
        printMatrix(matrix, true);
        System.out.println("");
        
        translate(matrix);
        printMatrix(matrix, false);
        System.out.println("");
        
        int [] [] matrix2 = increasingMatrix(3,2, true);
        printMatrix(matrix2, true);
        System.out.println("");
        
        int [] [] newMatrix =addMatrix(matrix, true, matrix2, true) ;
        printMatrix(newMatrix, true);
        System.out.println("");
        
    }
    
    public static int[][] increasingMatrix(int width,int height,boolean format){
        int [] [] matrix;
        if (format) {
            matrix = new int [height] [width];
            for (int i = 0; i < height; i++) {
                int x = width*i;
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = x;
                    x++;
                }
            }
            
        }
        else {
            matrix = new int [width] [height];
            for (int i = 0; i < height; i++) {
                int x = width*i;
                for (int j = 0; j < width; j++) {
                    matrix[j][i] = x;
                    x++;
                }
            }
            
        }
        return matrix;
    }
    
    public static void printMatrix( int[][] array, boolean format ) {
        if (format) {
            for (int i = 0; i < array.length; i++) {
                System.out.print( "[ ");
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print( array[i][j] + " ");
                }
                System.out.println( "]");
            }
            
        }
        else {
            for (int i = 0; i < array[0].length; i++) {
                System.out.print( "[ ");
                for (int j = 0; j < array.length ; j++) {
                    System.out.print(array[j][i] + " ");
                }
                System.out.println( "]");
            }
            
        }
        
        if(array == null) {
            return ;
        }
    }
    
    public static int[][] translate(int[][] array) {
        int [][]rowMajor = new int [array[0].length] [array.length];
            for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array.length; j++) {
                    rowMajor[i][j] = 0;
                }
            }
        return rowMajor;
    }
    
    public static int[][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb) {
        int[][] newMatrix = new int [a.length] [a[0].length];
        if (!formata) {
            translate(a);
        }
        if (!formatb) {
            translate(b);
        }
        if (a.length == b.length && a[0].length == b[0].length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    newMatrix[i][j] =  a[i][j] + b[i][j];
                }
            }
        }
        else {
            System.out.println( "Can't add");
            return null;
        }
        return newMatrix;
    }
    
}//end class