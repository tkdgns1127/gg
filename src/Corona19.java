
import java.util.Scanner;

public class Corona19 {
	

	public void methodA() {
		Patient pp = new Patient();
		pp.patientStart();
		};
	public void methodB() {
		MainHospital mainhospital = new MainHospital();
		mainhospital.start();
		};
	public void methodC() {
		MainSearch mainsearch = new MainSearch();
		mainsearch.start();
	};
	
	
	public void coronaSystem() {
		
		Corona19 corona = new Corona19();// ȯ�� Ŭ����, ���� Ŭ����, ��ȸ Ŭ���� ��ü ����
		
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���! ");
		System.out.println("1.ȯ�� 2.���� 3.��ȸ");
		System.out.println("===============================");
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		if(num == 1) {
			methodA();
		}else if(num == 2) {
			methodB();
		}else {
			methodC();
		}
	}
	
	
	public static void main(String[] args) {
		
		Corona19 corona = new Corona19();// ȯ�� Ŭ����, ���� Ŭ����, ��ȸ Ŭ���� ��ü ����
		corona.coronaSystem();
		
		
	}

}
