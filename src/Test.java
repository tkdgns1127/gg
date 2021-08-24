import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	//�˻� ����� ����Ʈ - > arr, Person ��ü�κ��� �޴� ���� ��ȣ -> phoneNumber �� �����ϰ� �ۼ��߽��ϴ�. 
	
	String inputName;
	String inputPhoneNumber;
	
//	void inputInformation(ArrayList<Person> arr) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("�̸��� �Է����ּ���.");
//		inputName = scanner.nextLine();
//		
//		System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
//		inputPhoneNumber = scanner.nextLine();
//	
//		scanner.close();
//		
//		informationCheck(arr);
//	}
//	
//	
//	void informationCheck(ArrayList<Person> arr) {
//		
//		for(Person person: arr) {
//			
//			if(inputName.equals(person.name)) {
//				
//				if(person.phoneNumber.contains(inputPhoneNumber)) {
//					randomTest();
//				} else {
//					System.out.println("������ �߿� ��ġ�ϴ� ����� �����ϴ�. ����� ���� �ް� ������.");
//				}
//				
//			} else {
//				System.out.println("��ȭ��ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� Ȯ�����ּ���.");
//				inputInformation();
//			}	
//		}
//	}
	
	void inputInformation(ArrayList<Person> arr) { // ������ ����Ʈ�� �Ű������� �޴´�.
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;
		
		do {
			System.out.println("�̸��� �Է����ּ���.");
			inputName = scanner.nextLine();
			
			System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
			inputPhoneNumber = scanner.nextLine();
			
			// ������ ����Ʈ�� �Է°��� ��
			boolean correct = false; 
			
			for(Person person: arr) {
				
				String fullNum = person.phoneNumber;
				String lastNum = fullNum.substring(7);
				
				if(inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) {
					correct = true;
					break;
				}	
			}
			
			if(correct) {
				checkReservation = true;
				randomTest(arr);
			} else {
				System.out.println("��ġ�ϴ� ������ �����ϴ�. �ٽ� Ȯ�����ּ���.");
			}
		} while (!checkReservation);
		
		scanner.close();
	}
	
	ArrayList<Person> randomTest(ArrayList<Person> arr) {
		ArrayList<Person> infectionPersonList = new ArrayList<>();
		
		for(int i = 0; i < arr.size(); i++) {
			Random random = new Random();
			
			arr.get(i).confirmed = (random.nextInt(2)!= 0);
			
			if(arr.get(i).confirmed) {
				infectionPersonList.add(arr.get(i));
			}		
		}
		
		return infectionPersonList;
	}
}
