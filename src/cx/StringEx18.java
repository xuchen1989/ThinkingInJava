package cx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class StringEx18  {
	public static void main(String[] args) throws Exception {

		String file = System.getProperty("user.dir")+"\\src\\cx\\ExcelReader.java";
		//all the literal
//		Pattern p = Pattern.compile("\".*\"");
		//all the comments
//		Pattern p = Pattern.compile("(//\\s.+)|(/\\*\\s+.+)|(\\*\\s+.+)");
		// all the class names used in a particular program
		Pattern p = Pattern.compile("class \\w+\\s+");
		Pattern q = Pattern.compile("^(//|/\\*|\\*)");
		System.out.println(file + " string literals:");
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher(""); // creates emtpy Matcher object
		for(String line : new TextFile(file)) {
			m.reset(line);
			while(m.find())
				System.out.println(index++ + ": " + m.group());
		}
	}
}