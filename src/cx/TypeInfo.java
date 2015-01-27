package cx;

public class TypeInfo {
	
	public static void isPrimitiveType(char[] array){
		if(array instanceof Object){
			System.out.println("This is an object!");
		}else{
			System.out.println("This is primitive type");
		}
		System.out.println(array.getClass().getSuperclass());
	}
	
	public static void main(String[] args){
		isPrimitiveType(new char[]{'a','1','2','e','5'});
	}

}
