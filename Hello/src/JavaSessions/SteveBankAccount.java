package JavaSessions;
// Multiple Inheritance using Interface
public class SteveBankAccount extends AccountDetails implements Bank {

	public static void main(String[] args) 
	{
		
		SteveBankAccount s = new SteveBankAccount();
		s.account_number = "123456";
		s.customer_name = "Manohar";
     
	}

	@Override
	public void rateOfInterest_fixed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateOfInterest_Savings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateOfInterest_CreditCards() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateOfInterest_Loans() {
		// TODO Auto-generated method stub
		
	}

}
