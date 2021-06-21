package Constructor;

public class Animal {
	String name = "";
	int	legCnt = 0;
	boolean isCheck = false;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name , int legCnt , boolean isCheck) {
		this.name = name;
		this.legCnt = legCnt;
		this.isCheck = isCheck;
	}
	
	@Override
	public String toString() {
		return name + " " + legCnt + " " + isCheck;
	}
}
