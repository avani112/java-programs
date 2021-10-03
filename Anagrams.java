import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

static  boolean IsAnagram ( String a , String b) {
		
		int al = a.length();
		int bl = b.length();
		
		
		boolean result = true;
		
		if(al!=bl) {
			result = false;
		}
		else
		{
			char aArray [] = a.toLowerCase().toCharArray();
			char bArray [] = b.toLowerCase().toCharArray();
			
			Arrays.sort(aArray);
			Arrays.sort(bArray);
			
			result = Arrays.equals(aArray , bArray);  
		  	System.out.println(result);  	
	    }
	return result;
	}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String a = s.next();
	String b = s.next();
	boolean result = IsAnagram(a,b);
	System.out.println((result)? "Anagrams": "Not Anagrams");
	s.close();
	}

}
