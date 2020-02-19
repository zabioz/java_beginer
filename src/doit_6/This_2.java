package doit_6;

class Person{
	String name;
	int age;


Person(){
	this("noname",22);
	
	}

Person(String name, int age){
	this.name = name;
	this.age = age;
	}
}
public class This_2 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
