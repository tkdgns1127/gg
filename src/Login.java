
import java.util.Scanner;


public class Login {

		String id;
		String pw;
		boolean login = true;
		Join jj = new Join();
		
		
		public void loginTest01() {
			Scanner sc = new Scanner(System.in);
			
			
			
			int num;
			
			System.out.println("1.�α��� 2.ȸ������");
			num = sc.nextInt();
			
			
			if(num == 1) {
				Hlogin();
			}else {
				jj.join();
				loginTest01();
				
			}
			
		}	

		
		public void Hlogin() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("���̵� : ");
		id = sc.nextLine();
		
		
		System.out.println("��й�ȣ : ");
		pw = sc.nextLine();
		
		for (int i =0; i<jj.member.size(); i++) {
			if(id.equals(jj.member.get(i).getId())) {
				if(pw.equals(jj.member.get(i).getPw())) {
					login = false;
					System.out.println(jj.member.get(i).getName() + "�� ȯ���մϴ�.");
					
				}
				//System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			} 
		}
		
		
		if(login) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
			loginTest01();
		}
		
	
	}
		
		public static void main(String[] args) {
			Login ll = new Login();
			ll.loginTest01();
		}
		
		
}
