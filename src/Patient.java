
import java.util.Scanner;

public class Patient {
	Consult consult = new Consult();
	Scanner sc = new Scanner(System.in);
	
	public void methodAA() {  consult.conusltMethod(sc);;}
	public void methodBB() {System.out.println("�˻� ���� �޼ҵ� ȣ��");}
	public void methodCC() {System.out.println("���� ���� �޼ҵ� ȣ��");}
	public void methodDD() {System.out.println("ġ�� ���� �޼ҵ� ȣ��");}
	
	public void patientStart() {
		Patient pp = new Patient();	// ���, �˻�, ����, ġ�� ��ü ����
		Corona19 cc = new Corona19();
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���!");
		System.out.println("1.��� 2.�˻� 3.���� 4.ġ�� 5.�ڷΰ���" );
		System.out.println("===============================");
		int num = sc.nextInt();
		if(num == 1) {
			pp.methodAA();
		}else if(num == 2) {
			pp.methodBB();
		}else if(num == 3){
			pp.methodCC();}
		else if(num ==4){
			pp.methodDD();
		}else{
			cc.coronaSystem();
		}
	}
	
	
	/*public static void main(String[] args) {
		Patient pp = new Patient();	// ���, �˻�, ����, ġ�� ��ü ����
		
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���!");
		System.out.println("1.��� 2.�˻� 3.���� 4.ġ�� 5.�ڷΰ���" );
		System.out.println("===============================");
		int num = sc.nextInt();
		if(num == 1) {
			pp.methodAA();
		}else if(num == 2) {
			pp.methodBB();
		}else if(num == 3){
			pp.methodCC();}
		else if(num ==4){
			pp.methodDD();
		}else{
			
		}
			
		
	}*/

}
