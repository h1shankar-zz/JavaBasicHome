package jun20;

import java.util.ArrayList;
import java.util.List;

public class MxSumarrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=11;
		System.out.println("lcm of 2 nums :"+getMul(a,b)/getGCD(a,b));
	
	}
	public static int getMul(int a, int b)
	{
		return a*b;
	}
	public static int getGCD(int a,int b)
	{
		if(a==0)
			return b;
		else
			return getGCD(b%a ,a);
	}
	public static void getMaxSum()
	{
		List<Integer> lst= new ArrayList<Integer>();
		//int ar[]={-2,-3,4,-1,-2,1,5,-3};
		int ar[]={0,-4,8,-8, 9,3,7,-3};
		int mx_sf=0;
		int mx_ending_here=0;
		for(int i=0;i<ar.length;i++)
		{
			mx_ending_here =mx_ending_here+ ar[i];
			if(mx_ending_here<0)
			{
				mx_ending_here=0;
			}
			if(mx_ending_here>mx_sf)
			{
				//lst.add(ar[i]);  //not working properly
				mx_sf=mx_ending_here;
			}
		}
		System.out.println("mx sum : "+ mx_sf);
		System.out.println(lst);
	}

}
