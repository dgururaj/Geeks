package problems;

import java.util.ArrayList;

public class ANBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "aabbcc";
		char[] ch = txt.toCharArray();
		ArrayList strList = new ArrayList();

		for (int i = ch.length - 1; i >= 0; i--) {
			//System.out.println(ch[i]);
			strList.add(ch[i]);
		}
		//System.out.println(strList);
		String finalt = strList.toString();
		//System.out.println(finalt);
		String[] finalt2=finalt.split(",");
		strList.clear();
		System.out.println(strList);
		for (int i = 0; i < finalt2.length; i++) {
			//System.out.print(finalt2[i]);
			strList.add(finalt2[i]);
		}
		
		
	}

}
