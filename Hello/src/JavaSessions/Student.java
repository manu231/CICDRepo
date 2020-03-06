package JavaSessions;

import java.util.StringTokenizer;

public class Student {
	
	int rollno;
	String name;
	String college;
    
	Student(int r, String n){
		rollno = r;
		name = n;
	}
	
	Student( String n,int r) {
		
	    name = n;
	    rollno = r;
	}
	
	void display() {
		System.out.println(rollno);
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		Student s = new Student(5,"Manohar");
		//s.display();
		
		Student s1 = new Student("Ramu", 5);
		//s1.display();
		
		// String Tokenizer
		StringTokenizer st = new StringTokenizer("my name is Manohar");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}
