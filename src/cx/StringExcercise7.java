package cx;

import java.util.regex.Pattern;

public class StringExcercise7 {
	
	
	public static void main(String[] args) {
		String testString = "(02109876543";
		String badtestString = "cadfa acvc.";
		String badtestString2 = "Caskdfadlkvcja ldaf";
		String regexStart = "[A-Z]+";
		String regexEnd = "\\+.";
		String sen = "^[A-Z].*[\\.]$";
		String sen1 = "\\(?0\\d{2}[)-]?\\d{8}";
		System.out.println(Pattern.matches(sen, testString));
//		System.out.println(Pattern.matches(regexEnd, testString));
		System.out.println(Pattern.matches(sen, badtestString));
//		System.out.println(Pattern.matches(regexEnd, badtestString));
		System.out.println(Pattern.matches(sen, badtestString2));
//		System.out.println(Pattern.matches(regexEnd, badtestString2));
	}

}
