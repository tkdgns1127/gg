import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	//검사 대상자 리스트 - > arr, Person 객체로부터 받는 핸폰 번호 -> phoneNumber 로 가정하고 작성했습니다. 
	
	String inputName;
	String inputPhoneNumber;
	
//	void inputInformation(ArrayList<Person> arr) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("이름을 입력해주세요.");
//		inputName = scanner.nextLine();
//		
//		System.out.println("전화번호 뒷자리를 입력해주세요.");
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
//					System.out.println("예약자 중에 일치하는 사람이 없습니다. 상담을 먼저 받고 오세요.");
//				}
//				
//			} else {
//				System.out.println("전화번호가 일치하지 않습니다. 다시 확인해주세요.");
//				inputInformation();
//			}	
//		}
//	}
	
	void inputInformation(ArrayList<Person> arr) { // 예약자 리스트를 매개변수로 받는다.
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;
		
		do {
			System.out.println("이름을 입력해주세요.");
			inputName = scanner.nextLine();
			
			System.out.println("전화번호 뒷자리를 입력해주세요.");
			inputPhoneNumber = scanner.nextLine();
			
			// 예약자 리스트와 입력값을 비교
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
				System.out.println("일치하는 정보가 없습니다. 다시 확인해주세요.");
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
