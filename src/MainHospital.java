import java.util.Scanner;

public class MainHospital {
	Hospital Seoul = new Hospital();
	Hospital Asan = new Hospital();
	Hospital Ewha = new Hospital();
	
	Scanner scanner = new Scanner(System.in);
	
	public void start() {
		
		String[] hospitallist = {"서울대병원", "아산병원", "이화여대병원"};
		Hospital[] hospitalarraylist = {Seoul, Asan, Ewha};

		//병원 선택
		System.out.println("============  2.병원    ================");
		System.out.println("현재 병원을 선택하세요!");
		System.out.println("1.서울대병원   2.아산병원   3.이화여대병원");
		System.out.println("=====================================");
		System.out.print("숫자를 입력하세요 : ");
		int chooseHospital = scanner.nextInt();
	
		System.out.println(hospitallist[chooseHospital-1] + "이 선택되었습니다.");
		
		//병원 메뉴선택
		System.out.println("============  " + hospitallist[chooseHospital-1] + "  ================");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.백신 조회     2.백신 요청     3.뒤로가기");
		System.out.println("=====================================");
		System.out.print("숫자를 입력하세요 : ");
		int choosemenu = scanner.nextInt();
		
		if(choosemenu == 1) {
			hospitalarraylist[chooseHospital].vaccinesearch();
		}else if(choosemenu == 2) {
			hospitalarraylist[chooseHospital].vaccinerequest();
		}else if(choosemenu == 3) {
			Corona19 corona19 = new Corona19();
			corona19.coronaSystem();
		}
		
		}
	
	
	public static void main(String[] args) {
		MainHospital mainhospital = new MainHospital();
		mainhospital.start();
	}
}