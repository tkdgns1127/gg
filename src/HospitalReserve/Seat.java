package HospitalReserve;

import java.util.Scanner;

class reserveseat{
	
	
		//���� ���� - Ÿ�� 
		//�����ؾ� �� �κ� - ��¥ / ����Ʈ
		//�ٽ�
	
		
		String reserveName; // ������ ����
		int dayNum; // ��¥
		int Seattype; // �ڸ�Ÿ��
		String[][] seats = new String[3][31]; // �̸��� 3���� ���ڴ�31��
		String[] list = {"A","B"}; //�ڸ� Ÿ��
		
		public reserveseat(String cusName, int dayNum) {
			this.reserveName = cusName;
			this.dayNum = dayNum;
			
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = 0; j < 31 ; j++) {
					seats[i][j] = "__";
				}
			}
		}
		
		public void Seat() { // ��¥����
			// ���� - ������ �� �޿� �ִ� �ϼ��θ� ����Ѵ�.
			// - �¼��� A��,B�����γ�����,���� 2���� �¼��� �ִ�.
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("==============================");
			System.out.println("�����Ͻ÷��� ���� ������ �Է����ּ���!");
			System.out.println("���� :");
			String reserveName = scanner.next();
			/*while(true) {
				System.out.println("==============================");
				System.out.println("���Ͻô� ��¥�� �������ּ���.!<���ڷθ� �Է¹ٶ��ϴ�>");
				System.out.println("���Ͻô� ��¥ :");
				int Seattype = scanner.nextInt() - 1;
				System.out.println("���Ͻô� �ڸ�Ÿ���� �����ϼ���. A,B");
				System.out.println("�¼���ȣ :");
				int dayNum = scanner.nextInt() - 1 ;
	         		if(dayNum>31){
	         			System.out.println("�߸��� �¼���ȣ �Դϴ�. �ٽ� �Է����ּ���.");
	         			dayNum = scanner.nextInt()-1;
	         		}
	         		if(seats[Seattype][dayNum].equals(reserveName)){
	         			System.out.println("�̹� ����� �ڸ��Դϴ�.�ٽ� �õ����ּ���.");
	         	}
	         	seats[Seattype][dayNum] = (reserveName);
	         	break;*/
			}
			//System.out.println();
		//}
		public void searchSeat() {
			
		}

		public void CancleSeat() {
				
		}

	}
