package cx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Haha {
	void haha1();

	void haha2(String str);
}

class HahaImplementation implements Haha {
	public void haha1() {
		System.out.println("This is haha implementation haha1");
	}

	public void haha2(String str) {
		System.out.println("This is haha implementation haha2 " + str);
	}
}

class HahaHandler implements InvocationHandler {
	private Object proxied;

	public HahaHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (method.getName().equals("haha2")) {
			System.out.println("I can do whatever before haha2,hahahahahaha");
		}
		return method.invoke(proxied, args);
	}

}

public class TypeInfoDynamicProxyTest {
	public static void main(String[] args) {
		Haha hahaProxy = (Haha) Proxy.newProxyInstance(
				Haha.class.getClassLoader(), new Class[] { Haha.class },
				new HahaHandler(new HahaImplementation()));
		hahaProxy.haha1();
		hahaProxy.haha2("cx");
	}
}
