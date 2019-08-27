package pck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("formatAkhaandDeshStr: "+ formatAkhaandDeshStr(".75866010"));
		collDemo();
	}
	
	public static void collDemo()
	{
		
		List lst= new ArrayList<>();
		//Set lst = new HashSet();
		lst.add("aa");
		lst.add("bb");
		lst.add("cc");
		System.out.println(lst.contains("aa"));
		lst.forEach(n -> System.out.println(n)); 
	}
	
	public static String formatAkhaandDeshStr(String str) {

		if (str.contains("E7")) {
			str = str.replace("E7", "");
		}
		if (str.length() == 9 && str.indexOf(".") == 2) {
			System.out.println("akha and desha looking good format");
			return str;
		}
		int indx_at;
		float f;
		String numberAsString;

		StringBuilder sb = new StringBuilder(str);
		if (str.contains(".")) {
			indx_at = str.indexOf(".");
			int len= str.length();
			if ((indx_at == 0 || indx_at == 1) &&  (len<= 3)) {
				f = Float.parseFloat(str);
				numberAsString = String.format("%.6f", f);
				// String.format ("%.3f", f);
				return "0" + numberAsString;
			}
			sb = sb.deleteCharAt(indx_at);
			sb = sb.insert(2, '.');
			str = sb.toString();
			f = Float.parseFloat(str);
			numberAsString = String.format("%.6f", f);

		} else {
			if (sb.length() < 2)
				sb = sb.insert(0, '0');
			sb = sb.insert(2, '.');
			str = sb.toString();
			f = Float.parseFloat(str);
			numberAsString = String.format("%.6f", f);

		}
		indx_at = numberAsString.indexOf(".");
		if (indx_at < 2)
			numberAsString = "0" + numberAsString;
		return numberAsString;

	}

}
