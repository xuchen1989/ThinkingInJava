package holdingObject;

import java.util.ArrayList;

public class Exer1 {
	public static ArrayList<Gerbil> gerbilList = new ArrayList<Gerbil>();
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			gerbilList.add(new Gerbil(i));
		}
		for(Gerbil gerbil : gerbilList){
			gerbil.hop();
		}
	}

}

class Gerbil{
	private int gerbiNumber;
	public Gerbil(int gerbiNumber){
		this.gerbiNumber = gerbiNumber; 
	}
	public void hop(){
		System.out.println("gerbiNumber:"+gerbiNumber);
	}
}
