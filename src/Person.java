
public class Person {

	String asd = "������ �׽�Ʈ";
	String name;
	int age;

	boolean check = false;			// �˻��� ����
	boolean confirmed = false;		// Ȯ�� ����
	boolean cure = false;			// ��ġ ����

	int month; 						// Ȯ�� ��
	String vaccine;					// ���(�����, ȭ����)
	int cure_count;					// ġ�� Ƚ��
	
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isCheck() {
		return check;
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	public boolean isConfirmed() {
		return confirmed;
	}
	
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	public boolean isCure() {
		return cure;
	}
	
	public void setCure(boolean cure) {
		this.cure = cure;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
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
	
	public void setCure_count(int cure_count) {
		this.cure_count = cure_count;
	}
	
	
	
	
	
	
}

