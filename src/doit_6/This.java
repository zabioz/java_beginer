package doit_6;

class Days {
	int day;
	int month;
	int year;

	public void setyear(int year) {
		this.year = year;
	}
	public void print() {
		System.out.println(this);
	}
}



public class This {

	public static void main(String[] args) {
		Days days = new Days();
		days.setyear(2020);
		System.out.println(days);
		days.print();
	}
}
