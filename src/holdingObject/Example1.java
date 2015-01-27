package holdingObject;

import java.util.ArrayList;

public class Example1 {
//	@SuppressWarnings("unchecked")
//	public static void main(String args[]){
//		ArrayList apples = new ArrayList();
//		for(int i = 0 ;i<3;i++){
//			apples.add(new Apple());
//		}
//		apples.add(new Orange());
//		for(int i=0;i<apples.size();i++){
//			System.out.println(((Apple)apples.get(i)).id());
//		}
//	}

	//using generics
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
		}
		for(int i=0;i<apples.size();i++){
			System.out.println(apples.get(i).id());
		}
		for(Apple c:apples){
			System.out.println(c.id());
		}
	}
}

class Apple{
	private static long counter;
	private final long id = counter++;
	public long id(){
		return id;
	}
}

class Orange{
	
}

