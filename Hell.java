import java.util.Random;
public class Hell{
    public static void main(String[] args) {
        
        int [] randomArray = new int[10];
  	    for (int i = 0; i < randomArray.length; i++) {
  		    randomArray[i] = (int) (Math.random() * 10);
  	    }
  	    System.out.println(randomArray[0]);
  		System.out.println(randomArray[1]);
  		System.out.println(randomArray[2]);
  		System.out.println(randomArray[3]);
  		System.out.println(randomArray[4]);
  		System.out.println(randomArray[5]);
  		System.out.println(randomArray[6]);
  		System.out.println(randomArray[8]);
  		System.out.println(randomArray[9]);
    }
}


