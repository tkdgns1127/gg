import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	//�˻� ����� ����Ʈ - > arr, Person ��ü�κ��� �޴� ���� ��ȣ -> phoneNumber �� �����ϰ� �ۼ��߽��ϴ�. 
	ArrayList<Person> arr = new ArrayList<>();
	
	
	String getName;
	String getPhoneNumber;
	Person Person;

	void inputInformation() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���.");
		getName = scanner.nextLine();
		
		System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
		getPhoneNumber = scanner.nextLine();
	
		scanner.close();
		
		iformationCheck();
	}
	
	/*inputInformation()
	iformationCheck()
	randomTest()
	*/
	void iformationCheck() {
		
		for(Person person: arr) {
			
			if(getName == person.name) {
				
				if(person.phoneNum.contains(getPhoneNumber)) {
					randomTest();
				} else {
					System.out.println("������ �߿� ��ġ�ϴ� ����� �����ϴ�. ����� ���� �ް� ������.");
				}
				
			} else {
				System.out.println("��ȭ��ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� Ȯ�����ּ���.");
				inputInformation();
			}	
		}
	}
	
	void randomTest() {
		
			for(int i = 0; i < arr.size(); i++) {
				
				Random random = new Random();
				
				arr.get(i).confirmed = (random.nextInt(2)!= 0);
				
				if(arr.get(i).confirmed) {
					
					ArrayList<Person> infectionPersonList = new ArrayList<>();	//Ȯ���� ����Ʈ
					
					infectionPersonList.add(arr.get(i));
				}	
			}
		}
	}


