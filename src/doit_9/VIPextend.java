package doit_9;

public class VIPextend extends extend{
	private int agentID;
	double vipsale;
	
	public VIPextend() {
		grade ="VIP";
		point = 0.05;
		vipsale = 0.1;
		System.out.println("VIPextend() call");
	}
	
	public int getagentID() {
		return agentID;
	}
}
