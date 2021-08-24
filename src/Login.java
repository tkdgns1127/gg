
import java.util.Scanner;


public class Login {

	public static void main(String[] args) {
		
		String id;
		String pw;
		boolean login = true;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("아이디 : ");
		id = sc.nextLine();
		
		
		System.out.println("비밀번호 : ");
		pw = sc.nextLine();
		
		System.out.println("비밀번호 : ");
	
		for (int i =0; i<Join.member.size(); i++) {
			if(id == Join.member.get(i).getId()) {
				if(pw == Join.member.get(i).getPw()) {
					login = true;
					System.out.println(Join.member.get(i).getName() + "님 환영합니다.");
					
				}
				System.out.println("비밀번호가 다릅니다.");
			} 
			System.out.println("로그인에 실패하셨습니다.");
		}
		
		
		if(login) {
			System.out.println("로그인에 실패하셨습니다.");
		}
	}

}
