package lecture_9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javafx.scene.Parent;

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
		Class<Parent> c = Perent.class;

	}
}
