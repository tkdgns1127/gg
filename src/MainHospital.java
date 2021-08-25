import java.util.Scanner;

public class MainHospital {
	Hospital Seoul = new Hospital();
	Hospital Asan = new Hospital();
	Hospital Ewha = new Hospital();
	
	Scanner scanner = new Scanner(System.in);
	
	public void start() {
		
		String[] hospitallist = {"����뺴��", "�ƻ꺴��", "��ȭ���뺴��"};
		Hospital[] hospitalarraylist = {Seoul, Asan, Ewha};

		//���� ����
		System.out.println("============  2.����    ================");
		System.out.println("���� ������ �����ϼ���!");
		System.out.println("1.����뺴��   2.�ƻ꺴��   3.��ȭ���뺴��");
		System.out.println("=====================================");
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int chooseHospital = scanner.nextInt();
	
		System.out.println(hospitallist[chooseHospital-1] + "�� ���õǾ����ϴ�.");
		
		//���� �޴�����
		System.out.println("============  " + hospitallist[chooseHospital-1] + "  ================");
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1.��� ��ȸ     2.��� ��û     3.�ڷΰ���");
		System.out.println("=====================================");
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int choosemenu = scanner.nextInt();
		
		if(choosemenu == 1) {
			hospitalarraylist[chooseHospital].vaccinesearch();
		}else if(choosemenu == 2) {
			hospitalarraylist[chooseHospital].vaccinerequest();
		}else if(choosemenu == 3) {
			Corona19 corona19 = new Corona19();
			corona19.coronaSystem();
		}
		
		}
	
	
	public static void main(String[] args) {
		MainHospital mainhospital = new MainHospital();
		mainhospital.start();
	}
}