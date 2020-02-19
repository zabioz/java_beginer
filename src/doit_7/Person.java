package doit_7;

public class Person {
	public String PersonName;
	public int money;
	
	public Person(String PersonName, int money) {
		this.PersonName = PersonName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
}
