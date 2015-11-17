package lecture_9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn {
}


@MyAnn
class Perent {
	@MyAnn
	void print(int a) {
	}
}



public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
