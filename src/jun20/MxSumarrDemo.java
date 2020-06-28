package jun20;

import java.util.ArrayList;
import java.util.List;

public class MxSumarrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="harishankar";
		char[] ch= str.toCharArray();
		int l= ch.length;
		int cnt=0;
		for(int i=0; i<l;i++)
		{
			cnt=1;
			for(int j=i+1;j<l;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='#')
				{
					cnt++;
					ch[j]='#';
				}
			}
			if(ch[i]!='#')
			System.out.println(ch[i] +" : "+cnt);
		}
		
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
