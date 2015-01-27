package holding;

//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

public class UniqueWords {
	private static int totalVowels = 0;
  public static void main(String[] args) {
    Set<String> words = new TreeSet<String>(
      new TextFile("C:/Users/xuchen2/workspace_web/TestJava/src/holding/SetOperations.java", "\\W+"));
    for(String word:words){
    	int currentVoewl = getVowelNumber(word);
    	System.out.print(word+":"+currentVoewl);
    	System.out.println();
    	totalVowels += currentVoewl;
    }
  }
  
  public static int getVowelNumber(String word){
	  int vowel =0;
	  if(word.toLowerCase().contains("a")){
		  vowel++;
	  }
	  if(word.toLowerCase().contains("e")){
		  vowel++;
	  }
	  if(word.toLowerCase().contains("i")){
		  vowel++;
	  }
	  if(word.toLowerCase().contains("o")){
		  vowel++;
	  }
	  if(word.toLowerCase().contains("u")){
		  vowel++;
	  }
	  return vowel;
  }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
