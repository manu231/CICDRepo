package JavaSessions;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r,temp,sum=0;
		int n=454; //Given number to be verified
		
		temp = n;
		//n=n/10;
		//r=n%10;
		//System.out.println("Value of n is:  " +n);
		
	 while(n>0) {
			r = n%10; //getting the reminder
			System.out.println("Value of r is :" +r);
			sum = (sum*10)+r;
			System.out.println("Sum is :" +sum);
			n=n/10;
			System.out.println("Value of n : " +n);
			
		} 
		if(temp==sum ) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome number");
		}

	}

}
