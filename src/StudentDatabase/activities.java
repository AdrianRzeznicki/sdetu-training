package StudentDatabase;

public interface activities {
	
	public static final int costOfCourse=800;
	
	public void payTution(int tution);
	public void showBalance();
	public void showCourses();
	public String toString();
	public void enroll(String course, int cost);
	
}
