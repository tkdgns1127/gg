
import java.util.Scanner;


public class Login {

	public static void main(String[] args) {
		
		String id;
		String pw;
		boolean login = true;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���̵� : ");
		id = sc.nextLine();
		
		
		System.out.println("��й�ȣ : ");
		pw = sc.nextLine();
		
		System.out.println("��й�ȣ : ");
	
		for (int i =0; i<Join.member.size(); i++) {
			if(id == Join.member.get(i).getId()) {
				if(pw == Join.member.get(i).getPw()) {
					login = true;
					System.out.println(Join.member.get(i).getName() + "�� ȯ���մϴ�.");
					
				}
				System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			} 
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
		}
		
		
		if(login) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
		}
	}

}
