package lecture_9;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javafx.scene.Parent;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn {
	int value();
}

@MyAnn(value = 10)
class Perent {
	@MyAnn(value = 20)
	public void print(@MyAnn(value = 20) int a, int b) {
		System.out.println(a + " + " + b);
	}
}


public class Sample1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Perent> c = Perent.class;
		
		
		for(Method m : c.getMethods())
			System.out.println(m.getName());
		Annotation an = c.getAnnotations()[0];
		if (an instanceof MyAnn) {
			System.out.println("class Perent is annoteded myAnn");
			int v = ((MyAnn)an).value();
			System.out.println(v);
		}
		Method m = c.getMethod("print", int.class, int.class);
		
		Perent p = c.newInstance();
		m.invoke(p, 10, 20);
		p.print(10, 20);
	}
}
