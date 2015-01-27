//: typeinfo/toys/ToyTest.java
// Testing class Class.
package typeinfo.toys;

import static net.mindview.util.Print.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	Toy() {
		System.out.println("Create toy");
	}

	Toy(int i) {
	}
}

interface myInterface {

}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots,
		myInterface {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? ["
				+ cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name : " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
//		Class c = null;
//		try {
//			c = Class.forName("typeinfo.toys.FancyToy");
//		} catch (ClassNotFoundException e) {
//			print("Can't find FancyToy");
//			System.exit(1);
//		}
//		printInfo(c);
//		for (Class face : c.getInterfaces())
//			printInfo(face);
//		Class up = c.getSuperclass();
//		Object obj = null;
//		try {
//			// Requires default constructor:
//			obj = up.newInstance();
//		} catch (InstantiationException e) {
//			print("Cannot instantiate");
//			System.exit(1);
//		} catch (IllegalAccessException e) {
//			print("Cannot access");
//			System.exit(1);
//		}
//		printInfo(obj.getClass());
		try {
			Class<?> clss = Class.forName("typeinfo.toys.Toy");
			Constructor[] cons = clss.getConstructors();
			for(Constructor con :cons){
				Object obj = con.newInstance(1);
				print(obj.toString());
				try {
					print(Toy.class.getDeclaredConstructor(int.class).newInstance(1));
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} /*
 * Output: Class name: typeinfo.toys.FancyToy is interface? [false] Simple name:
 * FancyToy Canonical name : typeinfo.toys.FancyToy Class name:
 * typeinfo.toys.HasBatteries is interface? [true] Simple name: HasBatteries
 * Canonical name : typeinfo.toys.HasBatteries Class name:
 * typeinfo.toys.Waterproof is interface? [true] Simple name: Waterproof
 * Canonical name : typeinfo.toys.Waterproof Class name: typeinfo.toys.Shoots is
 * interface? [true] Simple name: Shoots Canonical name : typeinfo.toys.Shoots
 * Class name: typeinfo.toys.Toy is interface? [false] Simple name: Toy
 * Canonical name : typeinfo.toys.Toy
 */// :~
