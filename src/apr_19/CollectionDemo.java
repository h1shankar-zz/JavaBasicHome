package apr_19;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mapTest();
	//	CollectionDemo a =new B();
		//swapTest();
		formatArr();
	}
	
	public static void formatArr()
	{
		int arr[] = {0, -1, -1, 0,0,-1,-1 };
		int l =arr.length;
		int i=arr[0];
		int j= arr[l-1];
		int temp;
		for (i=arr[0],j=arr[l-1];i<j;)
		{
		if(arr[i]==0&&arr[j]==-1)	
		{
			j--;
			i++;
			continue;
		}
		
		if(arr[i]==-1 &&arr[j]==0)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		if(arr[i]==-1 && arr[j]==-1)
		{
			j--;
		}
		}
		for(int k=0;k<l;k++)
		System.out.println(arr[k]);
	}
	public static void swapTest()
	{
		int arr[] = { 5, 7, 3, 9,2,10,1 };
		 
	    for (int i = 0; i < arr.length-1; i++)
	    {
	 
	      if (arr[i] > arr[i +1]) {
	       int t=arr[i];
	       arr[i]=arr[i +1];
	       arr[i]=t;
	        i = 0;
	      }
	 
	    }
	    System.out.print("Sorted Array : ");
	    for (int i = 0; i < arr.length; i++)
	    {
	      System.out.print(arr[i] + " ");
	    }
	  
	}
	
	
	public static void mapTest()
	{
		Map<Character, Integer> mp = new Hashtable<Character, Integer>();
		String str ="harishankar";
		char ch[]=str.toCharArray();
		/*mp.put('a',1);
		mp.put('b',2);
		mp.put('c',3);
		mp.put('b',2);
		mp.put('c',3);*/
		
		
		for(Map.Entry entry: mp.entrySet())
		{
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}
	public  void listTest()
	{
		List<String> lst =new ArrayList<String>();
		Set<String> lst2 = new HashSet<String>();
		//List<String> lst2 =new ArrayList<String>();
		
		lst.add("aa");		
		lst.add("ab");
		lst.add("aa");
		lst.add("bb");
		
		lst.add("aa");
		lst.add("bb");
		int l= lst.size();
		
		System.out.println("duplicate items");
		for(String s:lst)
		{
			
			
			if(!lst2.add(s))
			{
				System.out.println(s +"  ");
			}
		}
		
		
	}
	public static void f1()
	{
	String str="aabbbc"	;
	String str2="";
	StringBuilder strb =new StringBuilder();
	for(int i=0;i<str.length();i++)
	{
		
	if(i<str.length()&&str.charAt(i)==str.charAt(i+1)&&str.charAt(i+1)==str.charAt(i+2))	
	//	if(str.charAt(i))
	{
		System.out.println(str.charAt(i));
		i=i+2;
	}
	else {
		strb= strb.append(str.charAt(i));
	}
	}
	System.out.println("dtrb  "+strb);
	}
}

class B extends CollectionDemo
{
	public void f11()
	{
		System.out.println("B data");
	}
}

class C extends B
{
	public void f11()
	{
		System.out.println(" sdata");
	}
}
