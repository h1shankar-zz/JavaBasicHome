package test_jan_19;


class A{
	public static void f1(int a)
	{
		System.out.println("f1 int");
	}
	public static void f1(long a)
	{
		System.out.println("f1 long");
	}
	
	/*public static void f1(Object a)
	{
		System.out.println(" f1 Object");
	}*/
	public static void f1(String a)
	{
	 final int g=10;
		System.out.println(" f1 String");
	}
	
	public static void f1(Integer a)
	{

		System.out.println(" f1 Integer");
	}
	
	
}

public class PolyTest  {

	// Overloaded main methods 
    public static void main(String arg1) { 
        System.out.println("Hi, " + arg1); 
       // Test.main("Dear Geek","My Geek"); 
    }
	final public static void main(String[] args) {
		// TODO Auto-generated method stub
//A.f1(3);
//A.f1(new Integer(2));
		int a=2;
		int b= new Integer(2);
		System.out.println("=");
		System.out.println(a==b);
		
		System.out.println("eqal");
		System.out.println(a);
		System.out.println();
		
		String str= "hari";
		String str2= new String("hari");
		System.out.println(str.equals(str2));
		System.out.println(str==str2);
		String str4="ca#$%&34421ngfAD";
		char[] ch =str4.toCharArray(); 
 Character c;
 
StringBuffer sb =new StringBuffer(str4);
int l=str4.length();
l=l-1;
int r=0;


StringBuffer sbc =new StringBuffer();
StringBuffer sbd =new StringBuffer();
StringBuilder sbf =new StringBuilder();
for(int i=0;i<l;i++)
{
	if(Character.isDigit(ch[i]))
	{
		sbd.append(ch[i]);
	}
	if(Character.isAlphabetic(ch[i]))
	{
		
		sbc.append(ch[i]);
		
	}
	else
		
		{
			
			sbf.append(ch[i]);
		}
}
int l2=sbf.length();
System.out.println("digit: "+ sbd);
System.out.println("Char: "+ sbc);
System.out.println("digit: "+ sbf);
System.out.println("sb: "+ sb);
int k=sbf.length();
System.out.println("after replacing");

while(l>r)
{
	
	if(!(Character.isDigit(ch[l])||Character.isAlphabetic(ch[l])))
	{
		l--;
	}
	
	else if(!(Character.isDigit(ch[r])||Character.isAlphabetic(ch[r])))
	{
		r++;
	}
	
	else
	{
		char temp;
		temp= ch[l];
		ch[l]=ch[r];
		l--;
		r++;
		ch[r]=temp;
	}
	
	
}
String revStr = new String(ch); 

System.out.println("Output string: " + revStr); 

	}
}

