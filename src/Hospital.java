
public class Hospital {
	int Modernacount;//����� ����
	int Pfizercount;//ȭ���� ����
	
	
	public int getModernacount() {
		return Modernacount;
	}

	public void setModernacount(int modernacount) {
		Modernacount = modernacount;
	}

	public int getPfizercount() {
		return Pfizercount;
	}

	public void setPfizercount(int pfizercount) {
		Pfizercount = pfizercount;
	}

	public void vaccinesearch() {//��� ��ȸ
		System.out.println("������ ���� ��� ����");
		System.out.println("ȭ���� : " + getPfizercount());
		System.out.println("����� : " + getModernacount());
			
	}
	
	public void vaccinerequest() {
		//��ſ�û
	}
}
