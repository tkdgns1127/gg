

import java.util.ArrayList;
import java.util.Scanner;

public class PatientSearch{
	Scanner scanner = new Scanner(System.in);
	
	
	PatientSearch() {
		System.out.println("**ȯ�� �˻� �޴��� ���Խ��ϴ�**");
		search();
	}
	
	public void personSearch(String name) {
		//Test.infectionList.add(new Person("������", 23));
		//Test.infectionList.add(new Person("�ڻ���", 25));
		
		for(Person person : Test.infectionList) {
			if(name.equals(person.getName())) {
				System.out.println("�̸� : " + person.getName());
				System.out.println("���� : " + person.getAge());
				System.out.println("��ȣ : " + person.getPhoneNum());	
			}
		}
	}
	
	public void search() {
		String searchname = null;
		System.out.print("�̸��� �Է��ϼ���. : ");
		searchname = scanner.nextLine();
		
		System.out.println(searchname + "���� �˻���...");
		
		//Ȯ���� ����Ʈ ��ȸ
		personSearch(searchname);
		
		//ġ���� ����Ʈ ��ȸ
		
	}
	

}
