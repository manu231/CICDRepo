package JavaSessions;

public class DataTypes_Examples {

	public static void main(String[] args) {
		// Widening casting (Automatically)
		int myInt = 9;
		double myDouble = myInt;
		System.out.println("Integer value is : " +myInt);
        System.out.println("Double value is : " +myDouble);
        
        // Narrowing casting
        
        double myDouble1 = 9.875;
        int myInt1 = (int )myDouble1; // manual casting
        System.out.println("Double value is : : " +myDouble1);
        System.out.println("Manual casting from double to Integer :  " +myInt1);
        
        // Strings
        
        // Locate a character in a string
        String txt = "Please locate where'locate' occurs";
        System.out.println(txt.indexOf("locate "));	
        
        //Short Hand if .... else (Ternary Operator)
        //int time = 20;
        
        //boolean  result = (time < 18) ? "Good day" " "Good Evening";
        
        
	}

}
