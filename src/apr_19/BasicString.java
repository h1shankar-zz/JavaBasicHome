package apr_19;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		wWordCount();
		//B b= new B();
BB.a =10;
D d =new D("hs");

D d1= new D("hs");
System.out.println("============");
System.out.println(d.equals(d1));
System.out.println("============");
System.out.println("in 1st"+ BB.a);
System.out.println("in 2nd");
BB.a =20;
System.out.println("in 1st"+ BB.a);
		//
		f1();
	}

	public static void f1()
	{
		String str ="my name is hari";
		
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			for(int j=str1[i].length()-1;j>=0;j--)
				
			System.out.print(str1[i].charAt(j));
			System.out.println();
		}
	}
	
	public static void wWordCount()
	{
		String str ="my name is hari my frnd name is also hari";
		int cnt=0;
		
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			cnt=1;
			if(str1[i]!=" ")
			for(int j=i+1;j<str1.length;j++)
			{
				//System.out.println("str1[i] : "+str1[i] +" str1[j] "+str1[j]  + "str1[i].equals(str1[j])"+str1[i].equals(str1[j]) );
				if(str1[i].equals(str1[j]))
				{
					cnt++;
					
					str1[j]=" ";
				}
				
			
			}
			if(str1[i]!=" ")
			System.out.print(str1[i]  +" :" +cnt);
		System.out.print("  ");
		}
	}
}

class BB 
{
	public static int a;
}

class D
{
	public D(String st)
	{
		
	}
}