package doit_3;

public class Swithcase {
	public static void main(String[] args) {
		int ranking =10;
		char medalColor;
		
		switch(ranking ) {
		case 1 : medalColor = 'G';
		break;
		case 2 : medalColor = 'S';
		break;
		case 3 : medalColor = 'B';
		break;
		
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "is" +medalColor);
	}
}
