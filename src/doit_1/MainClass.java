package doit_1;

public class MainClass {
	public static void main(String[] args) {
		NewsMachine newsMachine = new NewsMachine();
		AnnualSubscriber as = new AnnualSubscriber(newsMachine);
		EventSubscriber es = new EventSubscriber(newsMachine);
		newsMachine.setNewsInfo("���� ����", "���� ���� 18�� �Դϴ�.");
		newsMachine.setNewsInfo("���� �����մϴ�", "�ٰ��� ���ɺ���~"); 
	}
}
