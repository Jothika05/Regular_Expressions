package RegularExprerssions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * [ab]  -->either a or b or compile
 * [^ab] -->Except a and b
 * [a-zA-Z] -->All albhabets including small and capital letter
 * [^a-zA-Z0-9] ---> except alphanumeric values,all special chatracter
 * [a-zA-Z0-9]  ---> ALl alphanumeric values
 * 
 */
public class regularDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="abcabcHccabbbbac78babca123@#$%^&*()";
   Pattern p=Pattern.compile("[^a-zA-Z0-9]");
   Matcher m=p.matcher(s);
   while(m.find()) {
	   System.out.println(m.group()+" Starts at " +m.start());
   }
}

}
