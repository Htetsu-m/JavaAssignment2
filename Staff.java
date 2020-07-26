package Assignment3;

import java.util.Scanner;

public class Staff extends Person{
	String school;
	double pay;
	
	public Staff(String name, String address,String school,double pay) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.school=school;
		this.pay=pay;
	}

	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public void display() {
		System.out.println(super.toString());
		System.out.println(school);
		System.out.println(pay);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st1=new Staff("Mg Kaung","Mandalay","Technology University",300000.00);
		Staff st2=new Staff("Ma Aye","Monywa","Computer University",200000.00);
		
		st1.display();
		st2.display();
	}

}
