package atmmachine;
import java.util.ArrayList;

public class Customer {
	
	private String customerName;
	private byte age;
	private boolean isStudent;
	private String gender;
	
	ArrayList<AtmDetails> atmArray = new ArrayList<AtmDetails>();
	
	//Constructor
	
	Customer (String customerName,String gender) {
		this.customerName = customerName;
		this.gender = gender;
	}
	
	//Getters and Setters
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public boolean isStudent() {
		return isStudent;
	}
	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public ArrayList<AtmDetails> getAtmArray() {
		return atmArray;
	}

	public void setAtmArray(ArrayList<AtmDetails> atmArray) {
		this.atmArray = atmArray;
	}
	
}
