package holdingObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Exer2 {
	

	public static void main(String[] args) {
//		Collection<Integer> c = new ArrayList<Integer>();
		Collection<Integer> c = new HashSet<Integer>();
		for (int i = 0; i < 10; i++)
			c.add(i); // Autoboxing
		for (Integer i : c)
			System.out.print(i + ", ");
	}
}
	

