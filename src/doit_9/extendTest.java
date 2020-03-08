package doit_9;

public class extendTest {
	public static void main(String[] args) {
		extend extendLee = new extend();
		extendLee.setID(10010);
		extendLee.setgrade("VIP");
		extendLee.setName("Leegibeom");
		extendLee.point = 100;
		System.out.println(extendLee.showPerson());
	}
}
