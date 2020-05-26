package test_jan_19;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(((())))";
		int l = str.length();
		int cnt = 0, cnt1 = 0;
		for (int i = 0; i < l; i++) {
			if (str.charAt(i) == '(') {
				cnt++;
			}
			
		}
		System.out.println("count of ( :" + cnt);
		cnt=0;
		for (int i = 0; i < l; i++) {
			if (str.charAt(i) == ')') {
				cnt++;
			}
			
		}
		System.out.println("count of ) :" + cnt);
	}

}
