
import java.util.ArrayList;
import java.util.Scanner;

public class Join {
	
	static ArrayList<Membership> member = new ArrayList<Membership>();
	
	public void join() {

		int hospital_num = 1111;
		int unique_num;
		String name;
		String id;
		String pw;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���� ���� ��ȣ :");
		unique_num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("�̸� : ");
		name = sc.nextLine();
		
		System.out.println("���̵� : ");
		id= sc.nextLine();
		
		System.out.println("��й�ȣ : ");
		pw = sc.nextLine();
		

	
		if(unique_num != hospital_num) {
			System.out.println(" ���� ���� ��ȣ�� �ٸ��ϴ�.");
			System.out.println(" �ٽ� ���");
		}else {
			
			member.add(new Membership(unique_num,name, id, pw));
			System.out.println(name+"�� ȸ�������� �����Ͽ����ϴ�.");
		}

	}

	public static ArrayList<Membership> getMember() {
		return member;
	}

	public static void setMember(ArrayList<Membership> member) {
		Join.member = member;
	}

	
	


}
