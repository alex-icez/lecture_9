package lecture_9;

enum OS {
	Windows, UNIX, MacOS;
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
		MyOS o1 = MyOS.Windows;
		MyOS o2 = new MyOS();
		
		OS o = OS.UNIX;
		OS b = OS.Windows;

		System.out.println(o == b);
		

	}

}
