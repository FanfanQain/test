package sd;
public class Student {
	private String name;
	private int id;
	private String phone;
	private int age;
	private String department;
	private String address;
	public Student(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	void setAddress(String address){
		this.address=address;
	}
	String getAddress() {
		return address;
		
	}
	protected void setPhone(String phone) {
		this.phone=phone;
		
	}
	protected String getPhone() {
		return phone;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void printStudent() {
		System.out.println("the information is :"+"\n"+this.getName()+"\n"+this.getId()+"\n"+this.getAddress()+"\n"+this.getAge()+"\n"+this.getDepartment()+"\n"+this.getPhone());
	}
	public static void main(String[] args) {
		Student stu=new Student(7,"Kristi");
		stu.setAddress("RPI");
		stu.setAge(23);
		stu.setDepartment("ITWS");
		stu.setPhone("123456789");
		stu.printStudent();
		
		
	}

}
