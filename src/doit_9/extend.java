package doit_9;

public class extend {
	private int ID;
	private String Name;
	protected String grade;
	double point;
	double pointresult;
	
	private int agentID;
	double vipsale;
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getgrade () {
		return grade;
	}
	
	public void setgrade(String grade) {
		this.grade = grade;
	}
	
//	public VIPextend() {
//		grade = "VIP";
//		pointresult = 0.05;
//		vipsale = 0.1;
//	}
//	
	public extend() {
		grade = "silver";
		pointresult = 0.01;
		System.out.println("extend() call");
	}
//	
//	public int price(int price) {
//		point += price * pointresult;
//		return price;
//	}
	
	public String showPerson() {
		return Name + "grade is" + grade + "point is" + point;
	}
}
