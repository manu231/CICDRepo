package JavaSessions;

import java.util.Arrays;

public class ArraysExamples1 {

	public static void main(String[] args) {
		
    // Find minimum number from an given array
		
    int [] num = {22,44,11,4,77}		;
    int min = num[0];
    Arrays.sort(num);
    //System.out.println("Modified Array is : ------>>", +Arrays.toString(num));
    
    try {
    	 for(int i=0;i<num.length;i++) {
    	    	if (num[i]<min) {
    	    		min = num[i];
    	    	}
    	    	
    	    }
    	    System.out.println("Smallest number in an array is : " +min);

    	
    } catch (Exception e) {
    	
    	System.out.println("There is an error---------" +e);
    	
    }
    
    //Find sum of elements in an array
    int sum = 0;
    try {
    	for(int i = 0;i<num.length; i++) {
    		sum+=num[i];
    	}
    	System.out.println("Sum of an array is :--"+sum);
    }catch(Exception e) {
    	System.out.println("There is an error of ---------" +e);
    }
    
    // Find max number from a given Array
    int max = num[0];
    try {
    	for(int i = 0; i<num.length; i++ ) {
    	  if( num[i] > max) {
    		  max= num[i];
    	  }
    	  
    	}
    	System.out.println(" Max number in an Array is "  +max);
    	
    } catch(Exception e) {
    	
    	System.out.println("Max number in the array is" +max);
    }
   
	}
	

	


}
