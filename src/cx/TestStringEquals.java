package cx;

public class TestStringEquals {
	
	public static void main(String[] args) {
		ObjectA a = new ObjectA(1);
		ObjectA b = new ObjectA(2);
		System.out.println(a.equals(b));
		b.setId(1);
		System.out.println(a.equals(b));
		String astr = new String("abc");
		String bstr = new String("abc");
		System.out.println(astr.equals(bstr));
		System.out.println(astr.compareTo(bstr));
		String s0="kvill";   
		String s1=new String("kvill");   
		String s2="kv" + new String("ill"); 
		String s3 = new String("kvill");
		System.out.println( s0==s1 );   
		System.out.println( s0==s2 );   
		System.out.println( s1==s2 ); 
		System.out.println( s0 == s3);
		System.out.println( s1 == s3);
		System.out.println( s2 == s3);
	}
}

class ObjectA{
	private int id;
	public ObjectA(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof ObjectA){
			ObjectA objA = (ObjectA)obj;
			if(objA.getId() == this.getId()){
				return true;
			}
			return false;
		}
		return false;
	}
}
