
import java.util.ArrayList;
import java.util.Scanner;

import HospitalReserve.Hospital;

public class Cure {
		ArrayList<Person> treatmentCompletedList = new ArrayList<>();
		ArrayList<Person> antibodyList = new ArrayList<>();
		ArrayList<Person> deathList = new ArrayList<>();
		
		
	public void cureMethod(Scanner scanner){
		System.out.println("������ ������ �Է��ϼ���.");
		String hospitalreserved = scanner.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scanner.nextLine();
		System.out.println("�ڵ��� ���ڸ��� �Է��ϼ���.");
		String phoneNum4 = scanner.nextLine();
		
		Hospital hospital = new Hospital();
		 
		//[�̸��� �޹�ȣ�� �ش� ����(����뺴��) ���ฮ��Ʈ�� ����]
		//**�ش纴������Ʈ�� �����ͼ�  ���ؾ���
		ArrayList<Person> reserveList = new ArrayList<>();
		for (Person person : reserveList) {
			if(person.getName().equals(name) && person.getPhoneNum().substring(9).equals(phoneNum4)) {
				//ġ�������.
				System.out.println("ġ�Ḧ �����ϰڽ��ϴ�.");
				System.out.println("����� �����ϼ���.");
					/*
				  		�ش纴���� ��� ������ �ҷ��;���.?
				  		(1. �����[1��], 2. ȭ����[2��])
					 */
				String vaccinselect = scanner.nextLine();
				
				//������� ������ ���
				if(vaccinselect.equals("1")) {
					/*
				 		����� �����ϸ鼭 �ش纴���� ��� ��������.?
					 */
					//ġ��Ƚ�� ����
					person.setCure_countUp();
					//� ����� �¾Ҵ��� ����
					person.setVaccine("�����");
					
				}else if(vaccinselect.equals("2")) {
					/*
			 		����� �����ϸ鼭 �ش纴���� ��� ��������.?
					 */
					//ġ��Ƚ�� ����
					person.setCure_countUp();
					//� ����� �¾Ҵ��� ����
					person.setVaccine("ȭ����");
				
				}else {
					System.out.println("���ڸ� �߸� �����Ͽ����ϴ�.");
					break;
				}
				
				
				System.out.println("�ǻ簡 ġ�����Դϴ�.");
				
				//ġ�����
				int randomNum = (int)(Math.random()*100+1);
				if(randomNum<=10) {
					System.out.println("���ݴ� ���Ѻ��� �� �� �����ϴ�.");
				}else if(randomNum<=90) {
					//Ȯ������ ���
					if(person.confirmed = true) {
						System.out.println("��ġ�Ǿ����ϴ�.");
						person.cure = true;
							//��ġ�ڸ���Ʈ�� �߰�?
						treatmentCompletedList.add(person);
					}else {
						//��Ȯ�����ǰ��
						System.out.println("��ü�� �����Ǿ����ϴ�.");
						 	//��ü���� ����Ʈ�� �߰�?
						antibodyList.add(person);
					}
				}else {
					System.out.println("������ ���� ���ϴ�.");
						//����ڸ���Ʈ�� �߰�?
					deathList.add(person);
				}
				
			}else {//���ฮ��Ʈ�� �������
				System.out.println("�����ڸ�ܿ� �������� �ʽ��ϴ�.");
			}
			
		}
		
	}
	

}
