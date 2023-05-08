package RegularExprerssions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularDemo8 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\JOTHIKA\\eclipse-workspace\\RegularExpression\\src\\RegularExprerssions\\abc.txt");
		Scanner sc=new Scanner(file);
		boolean linePresent= sc.hasNext();
		while(linePresent) {
		     String w=sc.next();
		     int i=w.lastIndexOf(":");
		     String mobile=w.substring(i+1);
		     Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
			 Matcher m=p.matcher(mobile);
			 if(m.find()) {
				System.out.println(m.group() + " is valid mobile no ");}
			 else
				{System.out.println(mobile + " is not valid mobile no ");
			
			  linePresent=sc.hasNext();}

		 }
		
		/*
		String mobile="6989978662";
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(mobile);
		if(m.find())
			System.out.println(m.group()+ " is valid mobile no ");
		else
			System.out.println(mobile+ " is not valid mobile no ");
    */
	}

}
