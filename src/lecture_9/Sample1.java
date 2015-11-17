package lecture_9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

import javafx.scene.Parent;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn {
}

@MyAnn
class Perent {
	@MyAnn
	public void print(int a) {
	}
}


public class Sample1 {
	public static void main(String[] args) {
		Class<Perent> c = Perent.class;
		for(Method m : c.getMethods())
			System.out.println(m.getName());
		
	}
}
