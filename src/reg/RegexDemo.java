package reg;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPattern();
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

}
