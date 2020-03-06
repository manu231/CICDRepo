package JavaSessions;

import java.util.Arrays;

public class RemoveDulicateElementsArray {
	public static int renoveDuplicates(int arr[],int n) {
		if(n==0||n==1) {
			return n;
		}
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++ ) {
			if(arr[i] !=arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		
		// Changing original Array
		for(int i=0;i<j;i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
    int arr[] = {10,70,30,80,10,20,30,20,70,40,40};
    Arrays.sort(arr);
    int length = arr.length;
     
    length = renoveDuplicates(arr,length);
    //Printing array elements
    for(int i=0;i<length;i++) {
    	System.out.print(arr[i]+" ");
    }

	}

}
