package RegularExprerssions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Trichy Chennai Tamilnadu";
		String st="www.aruljothi.com";
		 String[] str=s.split("a");  //argument - rejex pattern
		  for(String s1:str) {
			 System.out.println(s1);
		} 
		
	/*	Pattern p=Pattern.compile("a");  //rejex pattern
        String[] st2=p.split(s);  //argument - string
		
		for(String s1:st2) {
			System.out.println(s1); 
		}
		*/
	
	}
	
}
