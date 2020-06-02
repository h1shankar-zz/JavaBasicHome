package reg;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testPattern1();
		testFormatter();
		
	}
	
	public static void testPattern()
	{
		Pattern p = Pattern.compile("[A-Z]+");
		
		System.out.println(p.pattern());
		//System.out.println(p.matcher("AB").matches());
		System.out.println(Pattern.matches("[0-9]*[a-z]+", "5eedd9"));
		System.out.println(Pattern.matches("[a-z][0-9]{2}", "a56"));
		System.out.println(Pattern.matches("[a-z]*[0-9]{2}", "gff04"));//alphnumeric of digit 2
		
		System.out.println("yeeeeeeeeeeeeee");
		System.out.println(Pattern.matches("[3-4][0-9]{2}", "300"));
	}
	
	public static void testPattern1()
	{
		System.out.println(Pattern.matches("[a-zA-Z0-9]\2{3}", "aaa"));
	}
 public static  void testFormatter()
 {
	 int d=14;
	 String s1= String.format("%7d0", d);
	 System.out.println(s1);
	 
	int a=10;
	 String name="oonoo";  
	 String sf1=String.format("name is %s",a);  
	 String sf2=String.format("value is %f",32.33434);  
	 String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
	   
	 System.out.println(sf1);  
	 System.out.println(sf2);  
	 System.out.println(sf3);  
 }
}
