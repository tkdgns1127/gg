package Pesons;


public class ReservePerson extends Person {
	
	private int dayNum; // ��¥
	private int Seattype; // �ڸ�Ÿ��
	
	
	ReservePerson(){
		System.out.println("������ ����");
	}
	
	public int getDayNum() {
		return dayNum;
	}
	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
	public int getSeattype() {
		return Seattype;
	}
	public void setSeattype(int seattype) {
		Seattype = seattype;
	}
	
	
	
	
}
