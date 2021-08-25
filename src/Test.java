import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


	//Test瑜� �쐞�븳 arr �깮�꽦
//class A {
//	
//	
//	public static void main(String[] args) {
//		
//		ArrayList<Person> arr = new ArrayList<Person>();
//			
//			arr.add(new Person("�엫�쁽寃�", "01055552222"));
//			arr.add(new Person("�솉湲몃룞", "01022223333"));
//			arr.add(new Person("源�源�源�", "01022224444"));
//			
//			Test test = new Test();
//				
//			test.inputInformation(arr);
//	}
//} 

public class Test {
	
// Type 1 - 寃��궗 �썑 醫낅즺
	String inputName;
	String inputPhoneNumber;
	static ArrayList<Person> infectionList = new ArrayList<>();
	
	void inputInformation(ArrayList<Person> arr) {
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;
	
	
		while (!checkReservation) {
			System.out.println("�씠由꾩쓣 �엯�젰�빐二쇱꽭�슂.");
			inputName = scanner.nextLine();
			
			System.out.println("�쟾�솕踰덊샇 �뮮�옄由щ�� �엯�젰�빐二쇱꽭�슂.");
			inputPhoneNumber = scanner.nextLine();
			
			// �삁�빟�옄 由ъ뒪�듃�� �엯�젰媛믪쓣 鍮꾧탳
			boolean correct = false; 
			Person reservedPerson = null;
			
			for(Person person: arr) {
				
				String fullNum = person.phoneNum;
				String lastNum = fullNum.substring(7);
				
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
				System.out.println("�씪移섑븯�뒗 �젙蹂닿� �뾾�뒿�땲�떎.");
			}
		} ;
		
		scanner.close();
	}
	
	ArrayList<Person> randomTest(Person person) {
		
		System.out.println("Corona19 寃��궗瑜� �떆�옉�빀�땲�떎.");

		Random random = new Random();
		person.confirmed = (random.nextInt(2)!= 0);
		
		if(person.confirmed) {
			infectionList.add(person);
			System.out.println("Corona19 寃��궗 寃곌낵 [�뼇�꽦] �엯�땲�떎.");
		} else {
			System.out.println("Corona19 寃��궗 寃곌낵 [�쓬�꽦] �엯�땲�떎.");
		}
		
		// infectionList 異쒕젰 (name) - �솗�씤�슜
		for (Person p : infectionList) {
			System.out.println("infectionList: " + p.getName());
		}
		
		return infectionList;
	}
}

	
//Type 1 - 寃��궗 �썑�뿉�룄 �씠由�/踰덊샇 臾댄븳 諛섎났

//	public void inputInformation(ArrayList<Person> arr) { 
//		Scanner scanner = new Scanner(System.in);
//		boolean checkReservation = false;
//		
//		while (!checkReservation) {
//			System.out.println("�씠由꾩쓣 �엯�젰�빐二쇱꽭�슂.");
//			inputName = scanner.nextLine();
//			
//			System.out.println("�쟾�솕踰덊샇 �뮮�옄由щ�� �엯�젰�빐二쇱꽭�슂.");
//			inputPhoneNumber = scanner.nextLine();
//					
//			for(Person person: arr) {
//				
//				String fullNum = person.phoneNum;
//				String lastNum = fullNum.substring(7);
//				
//				if(inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) {
//					
//					System.out.println("Corona19 寃��궗瑜� �떆�옉�빀�땲�떎.");
//					
//					Random random = new Random();
//					
//					person.confirmed = (random.nextInt(2)!= 0);
//					
//					if(person.confirmed) {
//						infectionList.add(person);
//						System.out.println("Corona19 寃��궗 寃곌낵 [�뼇�꽦] �엯�땲�떎."); 
//						// infectionList 異쒕젰
//						for (Person p : infectionList) {
//							System.out.println("媛먯뿼�옄 �씠由�: " + p.getName());
//						}
//					} else  {
//						System.out.println("Corona19 寃��궗 寃곌낵 [�쓬�꽦] �엯�땲�떎.");
//					} 
//				} 
//			} 
//		}
//	}
//}	
