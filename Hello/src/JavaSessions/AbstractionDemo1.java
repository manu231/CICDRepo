package JavaSessions;

abstract class Sample {
	abstract void display() ;
	 void display1() {
		System.out.println("This is a concrete method ");
	}
}
 class Demo extends Sample {
	 void display() {
		 System.out.println("Abstract method implemented in sub class" );
	 }
 }
public class AbstractionDemo1 {

	public static void main(String[] args) {
    
		Demo d = new Demo();
		d.display();
		d.display1();
	//---------------------------------------------------------------------------------	
       // Sample s = new Sample(); --------> Abstract class cannot ne instatiated
    //---------------------------------------------------------------------------------
	}

}
