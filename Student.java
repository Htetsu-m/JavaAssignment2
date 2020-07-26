package Assignment3;
class Person{
	String name;
	String address;
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return("Person Name :"+name+"\n"+"Person Address :"+address);
	}

}
public class Student extends Person{
	String program;
	int year;
	double fee;

	public Student(String name, String address,String program,int year,double fee) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void display() {
		System.out.println(super.toString());
		System.out.println("Program :"+program);
		System.out.println("Year :"+year);
		System.out.println("Fee :"+fee+"\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student("Mg Mg","Mandalay","Java",5,250000.00);
		Student std2=new Student("Mya Mya","Yangon","C#",4,200000.00);
		
		std1.display();
		std2.display();
		

	}

}
