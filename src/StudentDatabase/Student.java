package StudentDatabase;

public class Student implements activities{
	private static int id=1000;
	private String userId;
	private String name;
	private String email;
	private String ssn;
	private String phone,city,state;
	private int balance;
	private String courses="";
	
	Student(String name,String ssn){
		id++;
		this.name=name;
		this.ssn=ssn;
		setUserId();
		setEmail();
	}
	private void setUserId(){
		int min=1000;
		int max=9000;
		int randNumber=(int)(Math.random()*(max-min));
		randNumber=randNumber+min;
		userId=id + randNumber + ssn.substring(5);
		System.out.println("Twoj userId to: "+ userId);
	}
	
	private void setEmail(){
		email=name.toLowerCase()+id+"@wat.edu.pl";
		System.out.println("Twoj email to: " +email);
	}
	
    public String toString(){
        return "[NAME: " + name + " ] [COURSES: " + courses + "] [BALANCE: " + balance + "]";
    }
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public void enroll(String course, int cost) {
		// TODO Auto-generated method stub
		courses=courses+ " " +course;
		balance = balance + cost;
	}
	@Override
	public void payTution(int tution) {
		// TODO Auto-generated method stub
		balance=balance-tution;
		
	}
	@Override
	public void showBalance() {
		System.out.println("Balance : "+ balance);
	}
	@Override
	public void showCourses() {
		// TODO Auto-generated method stub
		System.out.println("Courses : " + courses);
		
	}
	
}
