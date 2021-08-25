
import java.util.Scanner;

public class Patient2 {
	
	Scanner sc = new Scanner(System.in);
	Consult consult = new Consult();//상담
	Cure cure = new Cure();//치료
	Test test = new Test();
	
	public void methodAA() {consult.conusltMethod(sc);}
	public void methodBB() {test.inputInformation(Consult.coronatestList);}
	public void methodCC() {System.out.println("예약 실행 메소드 호출");}
	public void methodDD() {cure.cureMethod(sc);}
	
	public void patientStart() {
		Patient2 pp = new Patient2();	// 상담, 검사, 예약, 치료 객체 생성
		
		//Corona19 cc = new Corona19();

		while(true) {
		System.out.println("===============================");
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1.상담 2.검사 3.예약 4.치료 5.뒤로가기" );
		System.out.println("===============================");
		String userInput = sc.nextLine();
		
		switch (userInput) {
		case "1":
			pp.methodAA();
			break;
		case "2":
			pp.methodBB();
			break;
		case "3":
			//예약메소드
			break;
		case "4":
			pp.methodDD();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			break;
		}
		}
	}
	
	
}
