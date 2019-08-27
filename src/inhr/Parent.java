package inhr;

public class Parent {
  protected static int ip =10;
	
protected Parent()
	{
		System.out.println("parent default const");
		
	}
	public static void f1()
	{
		System.out.println("f1 of parent");
	}
	
	public void f2()
	{
		System.out.println("f2 of parent");
	}
}
