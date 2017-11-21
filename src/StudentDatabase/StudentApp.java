package StudentDatabase;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1= new Student("Adrian", "11111");
		stu1.enroll("Mathematic", 123);
		stu1.payTution(12);
		System.out.println( stu1.toString());
		System.out.println( stu1.toString()+ "git test");
	}

}
