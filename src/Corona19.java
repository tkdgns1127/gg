
import java.util.Scanner;

public class Corona19 {
	

	public void methodA() {
		Patient pp = new Patient();
		pp.patientStart();
		};
	public void methodB() {
		MainHospital mainhospital = new MainHospital();
		mainhospital.start();
		};
	public void methodC() {
		MainSearch mainsearch = new MainSearch();
		mainsearch.start();
	};
	
	
	public void coronaSystem() {
		
		Corona19 corona = new Corona19();// 환자 클래스, 병원 클래스, 조회 클래스 객체 생성
		
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("메뉴를 선택하세요! ");
		System.out.println("1.환자 2.병원 3.조회");
		System.out.println("===============================");
		System.out.print("숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		if(num == 1) {
			methodA();
		}else if(num == 2) {
			methodB();
		}else {
			methodC();
		}
	}
	
	
	public static void main(String[] args) {
		
		Corona19 corona = new Corona19();// 환자 클래스, 병원 클래스, 조회 클래스 객체 생성
		corona.coronaSystem();
		
		
	}

}
