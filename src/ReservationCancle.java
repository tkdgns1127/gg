
import java.util.Scanner;

public class ReservationCancle {	//���� ��� Ŭ����

	Scanner sc = new Scanner(System.in);
	String endNum = "010-7927-7479"; 	// ���� ����Ʈ�� �޹�ȣ
	String phone_num;
	
	
	//���ฮ��Ʈ ��ȸ & ��ġ Ȯ�� �޼ҵ�
	public void res_correct() {
		//phone_num�� ���� ����Ʈ�� �ִ��� Ȯ��
		/*
		 * for(; array.size;)
		 * if(������.��ȣ.substring(9).equals(phone_num)){
		 *  ������ ����Ʈ ���
		 * }
			
		 */
	}
	
	
	
	public void res_cancle() {	// ���� ��� �޼ҵ�
		
		System.out.println("�����Ͻ� ���� �� ��ȣ 4�ڸ��� �Է��ϼ���");
		System.out.print("�� ��ȣ �Է� :");
		phone_num = sc.nextLine();
		
		//res_correct();
		
		if(phone_num.equals(endNum.substring(9))) {
			//����Ʈ ���
			System.out.println("���� ����Ʈ ���");
			System.out.println("������ ����Ͻðڽ��ϱ�? [Yes/No]");
			
			if(sc.nextLine().equals("Yes")) {
				System.out.println("������ ��ҵǾ����ϴ�.");
				System.out.println("ȯ�� �޴��� �̵�");
			}else {
				System.out.println("������ ��� X");
				System.out.println("ȯ�� �޴��� �̵�");
			}
			
		}else{
			System.out.println("���� ����Ʈ�� �������� �ʽ��ϴ�.");
		};
		
	}
	
	public static void main(String[] args) {
		
		ReservationCancle rescan = new ReservationCancle();
		rescan.res_cancle();
		
		
	
		
	}

}
