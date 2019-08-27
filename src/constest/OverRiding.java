package constest;

public class OverRiding
{
	public void f1()
	{
		System.out.println("OverRiding f1");
	}

}

class OverTestet extends OverRiding
{
	@Override
	public void f1()
	{
		System.out.println("OverTest f1");
	}
	
}
