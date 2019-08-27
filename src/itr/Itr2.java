package itr;

public interface Itr2 {
	default public void  f1()
	{
		System.out.println("f1 of Itr1");
	}
	
	 public static void  f2()
	{
		System.out.println("f2 static  of Itr1");
	}
}
