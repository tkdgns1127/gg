
public class Hospital {
	int Modernacount;//모더나 개수
	int Pfizercount;//화이자 개수
	
	
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

	public void vaccinesearch() {//백신 조회
		System.out.println("병원의 현재 백신 갯수");
		System.out.println("화이자 : " + getPfizercount());
		System.out.println("모더나 : " + getModernacount());
			
	}
	
	public void vaccinerequest() {
		//백신요청
	}
}
