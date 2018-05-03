package problems;

public class ConsqDigiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long Num = 10111000111110L;
		int count = 0;
		int result = 0;
		System.out.println(Num);
		String tes = Long.toString(Num);
		System.out.println("tes::" + tes);

		char[] arr = tes.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			if (arr[i] == '0') {
				count = 0;
			} else {
				count++;
				result = Math.max(result, count);

			}
		}
		System.out.println("Result::" + result);

		Digits ob = new Digits();
		System.out.println("maximum occurence::" + ob.CheckMaxDigi());

	}

}
