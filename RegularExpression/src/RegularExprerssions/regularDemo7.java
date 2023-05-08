package RegularExprerssions;

import java.util.StringTokenizer;

public class regularDemo7 {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // StringTokenizer st=new StringTokenizer("Tamilnadu Chennai");
           StringTokenizer st=new StringTokenizer("20-90-29929","-",true);
         //System.out.println(st.countTokens());
      while(st.hasMoreTokens())
    	System.out.println(st.nextToken());
    
    
    //delimiter -default-space
        //String s="Tamilnadu Chennai";
   		String s="http:\\www.aehdihc.com";
        String[] str=s.split("\\:|\\\\|\\.");
        for(String s1:str) {
    	    System.out.println(s1);
         }
    
	}

}