package doit_7;

public class Bus {
	int busNum;
	int monney;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int monney) {
		this.monney += monney;
	}
	public void showinfo() {
		System.out.println("BusClass" + busNum + "monney" + monney);
	}
}
