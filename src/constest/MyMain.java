package constest;

public class MyMain 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OverRiding m = new OverRiding();
		m.f1();
		//f1(2,5.0f);
		//f1(5.0f,5);
		f1(5.0,5.0);
	}
	
	public static float f1(int a, float b)
	{
		System.out.println("sum0  :"+ a+b);
		return a+b;
	}
	
	public static float f1( float b,int a)
	{
		float f =a+b;
		System.out.println("sum1  :"+ f);
		return f;
	}
	
	public static double f1( float b,double a)
	{
		double f =a+b;
		System.out.println("sum2  :"+ f);
		return f;
	}
	
	public static double f1( double b,double a)
	{
		double f =a+b;
		System.out.println("sum3  :"+ f);
		return f;
	}

}
