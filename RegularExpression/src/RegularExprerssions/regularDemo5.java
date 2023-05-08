
package RegularExprerssions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularDemo5 {
/*
 * Quantity-->numnber of occurrences
 *  ?, + ,*, {}
 *  + -->atleast one match
 *  * -->any number of match including zero number
 *  ? -->atmost one match
 *  {number} -->number of occurrences
 *  {number1,number2}-->number1 and number2 n times
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="aaaaabbbbaacccababava";
   Pattern p=Pattern.compile("a{2,6}");
   Matcher m=p.matcher(s);
   while(m.find()) {
	   System.out.println(m.group()+ " starts at " +m.start());
   }
   
	}

}
