import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


	//Test�� ���� arr ����
//class A {
//	
//	
//	public static void main(String[] args) {
//		
//		ArrayList<Person> arr = new ArrayList<Person>();
//			
//			arr.add(new Person("������", "01055552222"));
//			arr.add(new Person("ȫ�浿", "01022223333"));
//			arr.add(new Person("����", "01022224444"));
//			
//			Test test = new Test();
//				
//			test.inputInformation(arr);
//	}
//} 

public class Test {
	
// Type 1 - �˻� �� ����
	String inputName;
	String inputPhoneNumber;
	public static ArrayList<Person> infectionList = new ArrayList<>();
	
	void inputInformation(ArrayList<Person> arr) {
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;
	
	
		while (!checkReservation) {
			System.out.println("�̸��� �Է����ּ���.");
			inputName = scanner.nextLine();
			
			System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
			inputPhoneNumber = scanner.nextLine();
			
			// ������ ����Ʈ�� �Է°��� ��
			boolean correct = false; 
			Person reservedPerson = null;
			
			for(Person person: arr) {
				
				String fullNum = person.phoneNum;
				String lastNum = fullNum.substring(9);
				
				if(inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) { 
					correct = true;
					reservedPerson = person;
					break;
				}	
			}
			
			if(correct) {
				checkReservation = true;
				randomTest(reservedPerson);
			} else {
				System.out.println("��ġ�ϴ� ������ �����ϴ�.");
			}
		} ;
		
		//scanner.close();
	}
	
	ArrayList<Person> randomTest(Person person) {
		
		System.out.println("Corona19 �˻縦 �����մϴ�.");

		Random random = new Random();
		person.confirmed = (random.nextInt(2)!= 0);
		
		if(person.confirmed) {
			infectionList.add(person);
			System.out.println("Corona19 �˻� ��� [�缺] �Դϴ�.");
		} else {
			System.out.println("Corona19 �˻� ��� [����] �Դϴ�.");
		}
		
		// infectionList ��� (name) - Ȯ�ο�
		for (Person p : infectionList) {
			System.out.println("infectionList: " + p.getName());
		}
		
		return infectionList;
	}
}

	
//Type 1 - �˻� �Ŀ��� �̸�/��ȣ ���� �ݺ�

//	public void inputInformation(ArrayList<Person> arr) { 
//		Scanner scanner = new Scanner(System.in);
//		boolean checkReservation = false;
//		
//		while (!checkReservation) {
//			System.out.println("�̸��� �Է����ּ���.");
//			inputName = scanner.nextLine();
//			
//			System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
//			inputPhoneNumber = scanner.nextLine();
//					
//			for(Person person: arr) {
//				
//				String fullNum = person.phoneNum;
//				String lastNum = fullNum.substring(7);
//				
//				if(inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) {
//					
//					System.out.println("Corona19 �˻縦 �����մϴ�.");
//					
//					Random random = new Random();
//					
//					person.confirmed = (random.nextInt(2)!= 0);
//					
//					if(person.confirmed) {
//						infectionList.add(person);
//						System.out.println("Corona19 �˻� ��� [�缺] �Դϴ�."); 
//						// infectionList ���
//						for (Person p : infectionList) {
//							System.out.println("������ �̸�: " + p.getName());
//						}
//					} else  {
//						System.out.println("Corona19 �˻� ��� [����] �Դϴ�.");
//					} 
//				} 
//			} 
//		}
//	}
//}