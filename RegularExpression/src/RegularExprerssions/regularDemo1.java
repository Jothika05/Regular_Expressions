
package RegularExprerssions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String sentance="thupparku thuppaya  thuppakki thupparku thuppaya  thuvum malai";
    Pattern p=Pattern.compile("thuppar");
    Matcher m=p.matcher(sentance);
    int count=0;
   while(m.find()) {
	   //System.out.println(m.group() +" starts  "+ m.start()+" ends with "+ m.end());
	   count++;
   }
   System.out.println("thuppar appears: "+count);
	}

}
