package pck;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FirstClass {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(String.format("%.2f", Float.parseFloat("050")));
		System.out.println("formatAkhaandDeshStr :"+formatAkhaandDeshStr("456"));
		

		/*
		 * String str="37,44,46,66,77"; int i=0; int count=0;
		 * while(str.length()>i) { if(str.charAt(i)==',') { count++; } i++; }
		 * System.out.println("count of , :"+count);
		 */

		/*
		 * System.out.println("Hi hari"); File f =new File("tt");
		 * System.out.println(f.getAbsolutePath());
		 * 
		 * System.out.println("dateConvert "+ dateConvert("04/01/2018"));
		 */
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
			if (indx_at == 0 || indx_at == 1 && str.length() <= 3) {
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
	 public static List<String> getListFromString(String str)
	    {
		List<String> lst =new ArrayList<String>();
		String str1= str.substring(1, str.length()-1);
		if(str1.isEmpty())
		{
			return lst;
		}
		String[] strlist =str1.split(",");
		
		for(int i=0;i<strlist.length;i++)
		{
		    System.out.println(strlist[i]);
		    lst.add(strlist[i]);
		}
		Collections.sort(lst);
		return lst;
	    }

	public static String formatArea(String str)
	{
		if(str.length()==4 && str.indexOf(".")==1)
		{
		System.out.println(" area in proper format");	
		}
		else
		{
			float f= Float.parseFloat(str);
			String numberAsString = String.format ("%.2f", f);
			str=numberAsString;
		}
		return str;
	}
	public static String formatAkhaandDesh(String str) {

		if(str.length()==9 && str.indexOf(".")==2)
		{
			System.out.println("akha and desha looking good format");
			return str;
		}
		int indx_at;
		float f;
		String numberAsString;

		StringBuilder sb = new StringBuilder(str);
		if (str.contains(".")) 
		{
			indx_at = str.indexOf(".");
			if (indx_at == 0 || indx_at == 1 && str.length() <= 3) {
				f = Float.parseFloat(str);
				numberAsString = String.format("%.6f", f);
				// String.format ("%.3f", f);
				return "0" + numberAsString;
			}
			sb = sb.deleteCharAt(indx_at);
			sb = sb.insert(2, '.');
			str=sb.toString();
			f = Float.parseFloat(str);
			numberAsString = String.format("%.6f", f);
			
		} 
		else 
		{
			if (sb.length() < 2)
				sb = sb.insert(0, '0');
			sb = sb.insert(2, '.');
			str=sb.toString();
			f = Float.parseFloat(str);
			numberAsString = String.format("%.6f", f);
			
		}
		indx_at = numberAsString.indexOf(".");
		if (indx_at < 2)
			numberAsString = "0" + numberAsString;
		return numberAsString;

	}

	public static String getMobile(String mobileText) {

		if (!mobileText.isEmpty()) {

			if (mobileText.length() != 10) {
				System.out.println(" mobileText.length() " + mobileText.length());

				if (mobileText.length() > 12) {
					System.out.println("going to deduct 0");
					mobileText = mobileText.substring(mobileText.length() - 12);

				} else {
					System.out.println("going to add 0");
					int ml = 10 - mobileText.length();
					for (int j = 1; j <= ml; j++) {
						mobileText = "0" + mobileText;
					}
				}

			}
		}
		return mobileText;

	}

	public static String getAkhDesh(String str) {
		String aksh = "256.45588";
		aksh = aksh.replace(aksh, ".");
		System.out.println("aksh " + aksh.length());
		int indx = aksh.indexOf('.');

		System.out.println("indx " + indx);
		return aksh;
	}

	public static int getListindex(List ls, String str) {
		int l = ls.size();
		int indx = 0;
		for (int i = 0; i < l; i++) {
			if (ls.get(i).equals(str)) {
				indx = i;
				break;
			}
		}
		return indx;
	}

	public static String dateConvert(String strDate) throws ParseException {

		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		// //changed on 6-may-18
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date varDate = dateFormat.parse(strDate);
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("Date :" + dateFormat.format(varDate));

		return dateFormat.format(varDate).toString().toUpperCase();

	}

	// this method for getting any back date from today
	public static String getNumberOfDaysBackDateString(int dayback) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -dayback);
		return dateFormat.format(cal.getTime());
	}

	public static int getNumberOfDaysFromLastSatarday() {
		LocalDate date = LocalDate.now();
		DayOfWeek dow = date.getDayOfWeek();
		System.out.println("Enum = " + dow);
		String dayName = dow.getDisplayName(TextStyle.NARROW_STANDALONE, Locale.ENGLISH);
		// String dd = dow.getDisplayName(TextStyle.NARROW_STANDALONE, locale)
		return Integer.parseInt(dayName) + 1;
	}

}