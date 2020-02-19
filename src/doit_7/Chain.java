package doit_7;

public class Chain {
	public static void main(String[] args) {
		Person personPO = new Person("PO", 3000);
		Person personSX = new Person("SX", 10000);
	
		Bus bus100 = new Bus(100);
		personPO.takeBus(bus100);
		personSX.takeBus(bus100);
		bus100.showinfo();
	}
}
