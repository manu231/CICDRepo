package JavaSessions;

import java.util.Scanner;

public class PrimeNumber {

static void checkPrimeNUmber(int n) {
int i,m = 0;
int flag = 0;
m=n/2;
if(n==0||n==1) {
	System.out.println(n+ " is not a prime number");
	}else {
    for(i=2;i<=m;i++)     {
    	if(n%i==0) {
    		System.out.println(n+ "  is not a prime number");
    		flag = 1;
    		break;
    	}
    }
    
    if(flag==0) {
    	System.out.println(n+ " is a prime number");
    }
	}
}

// Another method to find prime number
    /*public static boolean isPrime(int p) {
    	if(p<=1) {
    		return false;
    	}
    	
    	for(int i=2;i<Math.sqrt(p);i++) {
    		if(n%i==0) {
    			return false;
    		}
    	}
    	return true;
    	
    } */
    
	public static void main(String[] args) {
	    
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int q = s.nextInt();
		
		if(isPrime(n)) {
			System.out.println(q+ " is a prime number");
		} else {
			System.out.println(q+ " is not a prime number");
		} */
		
		checkPrimeNUmber(1);
		checkPrimeNUmber(2);
		checkPrimeNUmber(3);
		checkPrimeNUmber(11);
		checkPrimeNUmber(19);
	
		

	}

}
