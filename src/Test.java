import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	//검사 대상자 리스트 - > arr, Person 객체로부터 받는 핸폰 번호 -> phoneNumber 로 가정하고 작성했습니다. 
	ArrayList<Person> arr = new ArrayList<>();
	
	
	String getName;
	String getPhoneNumber;
	Person Person;

	void inputInformation() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		getName = scanner.nextLine();
		
		System.out.println("전화번호 뒷자리를 입력해주세요.");
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
					System.out.println("예약자 중에 일치하는 사람이 없습니다. 상담을 먼저 받고 오세요.");
				}
				
			} else {
				System.out.println("전화번호가 일치하지 않습니다. 다시 확인해주세요.");
				inputInformation();
			}	
		}
	}
	
	void randomTest() {
		
			for(int i = 0; i < arr.size(); i++) {
				
				Random random = new Random();
				
				arr.get(i).confirmed = (random.nextInt(2)!= 0);
				
				if(arr.get(i).confirmed) {
					
					ArrayList<Person> infectionPersonList = new ArrayList<>();	//확진자 리스트
					
					infectionPersonList.add(arr.get(i));
				}	
			}
		}
	}


