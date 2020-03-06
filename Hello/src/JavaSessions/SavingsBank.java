package JavaSessions;

public class SavingsBank implements Bank {

	@Override
	public void rateOfInterest_fixed() {
		System.out.println("ROI is 9%");
		
	}

	@Override
	public void rateOfInterest_Savings() {
		System.out.println("ROI is 5%");
		
	}

	@Override
	public void rateOfInterest_CreditCards() {
		System.out.println("ROI is 15%");
		
	}

	@Override
	public void rateOfInterest_Loans() {
		System.out.println("ROI is 4%");
		
	}


}
