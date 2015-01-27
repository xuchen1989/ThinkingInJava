package cx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExercise10 {
	public static void main(String[] args) {
		String phrase = "Java now has regular expressions";
		String[] regexes = {"^Java","\\Breg.*","n.w\\s+h(A|i)s","s?","s*","s+","s{4}","s{1}","s{0,3}"};
		for(String regex:regexes){
			Pattern p = Pattern.compile(regex);
			Matcher matcher = p.matcher(phrase);
			System.out.println(matcher.find());
		}
		System.out.println("============");
		String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher("Arline ate eight apples and one orange while Anita hadn¡¯t any");
		while(matcher.find())
			System.out.println(matcher.group()+" start at "+matcher.start()+" and ends with "+matcher.end());
	}

}
