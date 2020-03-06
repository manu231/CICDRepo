package JavaSessions;

public class Inheritance {

	 class Father {
		String f_name;
		int f_age;
	}
	
	 class Child extends Father {
		String c_name;
		int c_age;
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.f_name = "Manohar";
		c.c_name = "Tarun";
		
		Father f = new Father();
		f.f_age = 53;
		

	}

}
