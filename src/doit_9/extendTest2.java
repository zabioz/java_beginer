package doit_9;

public class extendTest2 {
	public static void main(String[] args) {
		VIPextend VIPextendkim = new VIPextend();
		
		VIPextendkim.setID(10020);
		VIPextendkim.setgrade("VIP");
		VIPextendkim.setName("kimhangi");
		VIPextendkim.point = 22504;
		System.out.println(VIPextendkim.showPerson());
	}
}
