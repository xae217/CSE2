// Xavier Escobar
// April 7th, 2015
// CSE 002

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }//end main method
 
  public static String listArray(int num[]){
	String out="{";
	for(int j = 0; j < num.length; j++){
  	if(j > 0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }//end listArray method
  
  //creates an array full of 10 random integers
  public static int[] randomInput() {
  	int [] randomArray = new int[10];
  	for (int i = 0; i < randomArray.length; i++) {
  		randomArray[i] = (int) (Math.random() * 10);
  	}
  	return randomArray;
  }//end randomInput method
  
  public static int[] delete(int[] list, int pos) {
    //create an array of 1 item less than the orignal array list
  	int [] newList = new int[list.length - 1];
  	if(pos >= 0 && pos <10) {
  	  //loop goes trhough the positions i
    	for (int i = 0; i < newList.length; i++) {
    	  //if the current position of newList is less than pos then:
    		if (i < pos) {
    		  //copy the value of list into newList
    			newList[i] = list [i];
    		}
    		//once the loop reaches the desired position(pos) then:
    		else {
    		  //we set the value of the next position of list into the value of the
    		  //  current position of newList
    			newList[i] = list[i + 1];
    		}//end nested else statement
    	}//end loop
      System.out.println("index " + pos + " element has been removed");	
  	}//end if statement
  	else {
  	  System.out.println("Then index is not valid");
  	  newList = list;
  	}
  	return newList;
  }//end delete method
  
  public static int[] remove(int[] list, int target) {
  	int count = 0;
  	//creates new array called newList
  	int [] newList = list;
  	for (int i = 0; i < newList.length; i++) {
  	  //if the value of the array at i position equals to the target value then:
  		if (newList [i] == target) {
  		  //delete the value using the delete method
  			newList = delete(newList, i);
  			//resets the value of i back one iteration
  			i--;
  		}
  	}//end for loop
  	//if the newList has not changed then:
  	if (newList == list) {
  	  //target was not found
  	  System.out.println("Element " + target + " has not been found");
  	}
  	//if newList has changed then:
  	else {
  	  //target was found and eliminated
  	  System.out.println("Element " + target + " has been found");
  	}
 		return newList;//returns new list
  }//end remove method
  
}//end class
