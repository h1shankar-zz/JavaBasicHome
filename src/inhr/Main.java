package inhr;

/*
class FieldDemoBase
{
	private int a=10;
	
}
public class FieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
final class Complex {
	 
	private double re;
    private final double im;
 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    
 
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
 
class Main {
  public static void main(String args[])
  {
       Complex c = new Complex(10, 15);
       System.out.println("Complex number is " + c);
       Complex c1 = new Complex(100, 15);
       System.out.println("Complex number is " + c1);
  }         
}
