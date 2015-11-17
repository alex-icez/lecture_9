package lecture_9;

@interface MyAnn {
}


@MyAnn
class Perent {
	@MyAnn
	void print(@MyAnn int a) {
	}
}

class Child extends Perent {
	void print(int a) {

	}
}


public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
