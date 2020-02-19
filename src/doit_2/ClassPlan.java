package doit_2;

public class ClassPlan {
	public static void main(String[] args) {
		Premiemplan classplan = new Premiemplan();
		classplan.name = "basic";
		
		Premiemplan classplan2 = new Premiemplan();
		classplan2.name = "vip";
				System.out.println(classplan2.name + classplan.name);
		int plan = 66;
		int premiemplan;
		
		Subject math;
		
		if (plan < 10) {
			premiemplan = 1000;
			System.out.println("premiemPlan is  1000 en");
		}
		else if(plan < 5) {
			premiemplan = 500;
			System.out.println("vipPlan is 500en");
		}
		else if(plan > 100) {
			premiemplan = 100;
			System.out.println("kannrisya Plan is 0 en");
		}
		else {
			premiemplan = 0;
			System.out.println("guest is 0 en");
		}
	}
}
