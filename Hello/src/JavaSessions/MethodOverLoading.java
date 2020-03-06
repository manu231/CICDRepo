package JavaSessions;

// Overriding is called Runtime Polymorphism

class Super {
	void display() {
	System.out.println("Super Class");
}

class Sub extends Super{
	void dispaly() {
		System.out.println("Sub class Class");
	}
}
public static  class MethodOverLoading {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.dispaly();

	}

}
