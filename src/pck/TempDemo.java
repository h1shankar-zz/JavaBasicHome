package pck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TempDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ListDemo();
		// charCount();
		// charCountMap();
		//starPrint();
		//System.out.println(2/3);
		stringDemo();
	}
	
	
	public static void stringDemo()
	{
		String str ="AbGnmD";
		int l= str.length();
		char[] ch= str.toCharArray();
		for(int i=0;i<l;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			System.out.print((char)(ch[i]-'a'+'A'));
		}
	}

	public static void starPrint() {
		int n = 4;
		int i, j, k;
		for (i = 0; i < n; i++) {
			for (j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void charCount() {
		// char ch[]= new char[15];
		String str1 = "harishankar";
		StringBuffer str = new StringBuffer(str1);
		int cnt = 1;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			cnt = 0;
			ch = str.charAt(i);
			for (int j = i; j < 5; j++) {
				if (str.charAt(j) != '$' && str.charAt(j) == ch) {
					cnt++;
					str.setCharAt(str.charAt(j), '$');

				}
			}
			if (str.charAt(i) != '$')
				System.out.println(str.charAt(i) + "  times " + cnt);
		}

	}

	public static void charCountMap() {
		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		String str = "harishankar saingh";
		char[] charArrayStr = str.toCharArray();

		for (char c : charArrayStr) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);
			} else {
				mp.put(c, 1);
			}
		}
		for (Map.Entry entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void ListDemo() {
		// List<String> lst= new ArrayList<String>();
		Set<String> lst = new HashSet<String>();
		lst.add("1");
		lst.add("2");
		lst.add("3");
		lst.add("4");

		System.out.println("for each");
		for (String str : lst) {
			System.out.println(str);
		}
		System.out.println("for");
		/*
		 * for(int i=0; i<lst.size();i++) { System.out.println(lst.get(i)); }
		 */

		System.out.println("itrator");
		Iterator itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
