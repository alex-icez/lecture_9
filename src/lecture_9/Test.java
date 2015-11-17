package lecture_9;

enum OS {
	Windows(1980), UNIX(1900), MacOS(3000);
	int year;
	
	private OS(int year) {
		this.year = year;
	}
}

class MyOS {
	public final static MyOS Windows = new MyOS();
	public final static MyOS UNIX = new MyOS();
	public final static MyOS MacOS = new MyOS();
	
	
	private MyOS() {
	}
}

public class Test {

	public static void main(String[] args) {		
		OS o = OS.UNIX;
		OS b = OS.Windows;

		System.out.println(o == b);
		
		System.out.println(o.ordinal());
		

	}

}
