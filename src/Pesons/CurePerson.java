package Pesons;


public class CurePerson extends Person{
	
	private String vaccine;					// ���(�����, ȭ����)
	private int cure_count = 0;					// ġ�� Ƚ��
	private boolean cure = false;			// ��ġ����
	
	CurePerson(){
		System.out.println("ġ�Ό���� ����");
	}
	
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public int getCure_count() {
		return cure_count;
	}
	public void setCure_countUp(int cure_count) {
		this.cure_count = cure_count + 1;
	}
	public boolean isCure() {
		return cure;
	}
	public void setCure(boolean cure) {
		this.cure = cure;
	}
	
	
}
