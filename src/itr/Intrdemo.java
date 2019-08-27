package itr;

class ItrDemoChild
{
	
	static  public void  f1()
	{
		System.out.println("f1 of ItrDemoChild");
	}
}


public class Intrdemo extends ItrDemoChild 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hariisinggh";
		char cha[]=str.toCharArray();
		StringBuilder stb =new StringBuilder();
		String t=null;
		for(char ch: cha)
		{
			if(t.indexOf(ch)<0)
			{
				//stb=stb.append(ch);
				t= t+ch+"";
			}
		}
		
		System.out.println("stb  "+t);
	}
	
	public void myM()
	{
	System.out.println("myMMMMM");	
	}
	static public void f1()
	{
		System.out.println("override f1");
	}

}


