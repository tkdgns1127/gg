
import java.util.Scanner;

public class Patient2 {
	
	Scanner sc = new Scanner(System.in);
	Consult consult = new Consult();//���
	Cure cure = new Cure();//ġ��
	Test test = new Test();
	
	public void methodAA() {consult.conusltMethod(sc);}
	public void methodBB() {test.inputInformation(Consult.coronatestList);}
	public void methodCC() {System.out.println("���� ���� �޼ҵ� ȣ��");}
	public void methodDD() {cure.cureMethod(sc);}
	
	public void patientStart() {
		Patient2 pp = new Patient2();	// ���, �˻�, ����, ġ�� ��ü ����
		
		//Corona19 cc = new Corona19();

		while(true) {
		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���!");
		System.out.println("1.��� 2.�˻� 3.���� 4.ġ�� 5.�ڷΰ���" );
		System.out.println("===============================");
		String userInput = sc.nextLine();
		
		switch (userInput) {
		case "1":
			pp.methodAA();
			break;
		case "2":
			pp.methodBB();
			break;
		case "3":
			//����޼ҵ�
			break;
		case "4":
			pp.methodDD();
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			break;
		}
		}
	}
	
	
}
