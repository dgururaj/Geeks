package problems;

public class Student {
	public int roll_no;
	public String name;
	Student(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = new Student[5];
		arr[0] = new Student(1,"aman");
		arr[1] = new Student(1,"guru");
		arr[2] = new Student(1,"raj");
		arr[3] = new Student(1,"red");
		arr[4] = new Student(1,"blue");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].roll_no+arr[i].name);
			
		}
		
				

	}

}
