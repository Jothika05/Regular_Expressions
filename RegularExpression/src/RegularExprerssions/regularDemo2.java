
package RegularExprerssions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Starting word in given sentance-->^rejex
 * Ending word in given sentance-->rejex$
 * Any two characters in a given sentance-->T|a
 */
public class regularDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Tamil is oldest Language";
    Pattern p=Pattern.compile("T|a");//Starting --> ^Tamil,ending-->  Language$
    Matcher m=p.matcher(str);
    while(m.find()) {
    	System.out.println(m.group()+" Starts at " +m.start()+" and ends at " +m.end());
    }
	}

}
