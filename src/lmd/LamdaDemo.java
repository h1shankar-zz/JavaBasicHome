package lmd;

interface Itrd {
	default void show1() {
		System.out.println("show1");
	}
}

interface Itr {
	void show();
	
}
interface Itr1 {
	
	void show(int a);
}

interface Itr2 {
	
	int show(int a,int b);
}

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("msg from main");

	
		/*	Itr it = new Itr() {  //annonymous inner class

			@Override
			public void show() {
				System.out.println("in innner show");
			}
		};
		it.show();*/
		
		//lamda expression
		Itr it =()->System.out.println("lamda exp msg");
		it.show();
		//lamda expression
		Itr1 it1 =(a)->System.out.println(a*20);
		it1.show(7);
		System.out.println("multy-----------");
		Itr2 mult=(a,b)-> a*b;
		System.out.println(mult.show(2, 5));
	}

}
