package RegularExprerssions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * PREDEFINED CLASS
 * space --> \\s, non space --> \\S,
 * digits--> \\d,non digits--> \\D,
 * all alphanumeric values-->\\w,special charactor including space--> \\W,
 * start and end same word-->\\brejex\\b, non --->\\B
 * \\Grejex -->previuos match ending la same word iruka 
 * . --->  all print 
 */
public class regularDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentance="TamilTamilan TamilNadu 92000002  $%^&&";
	       Pattern p=Pattern.compile("\\d");
		    Matcher m=p.matcher(sentance);
		    while(m.find()) {
		    	System.out.println(m.group()+ " start at " +m.start());
		    	
		    }
		    
	}

}
