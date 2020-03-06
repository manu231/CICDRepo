package JavaSessions;

import java.util.regex.*;



public class RegularExpression {

	public static void main(String[] args) {
		System.out.println("HELLO");
		//1st way
		Pattern p = Pattern.compile(".s"); // represents a single character
        Matcher m = p.matcher("as");
        boolean b1 = m.matches();
        
        // 2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        
           // 3rd way
        boolean b3 = Pattern.matches(".s", "aks");
        
        System.out.println(b1+"   "+b2+"    "+b3);
	}

}
