package CMExample;

public class Dog extends Animal {
	
	public void sleep() {
		System.out.print("  Zzz.." + "\n");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("�θ�Ŭ������ setName() �޼ҵ� ȣ�� \n");
		System.out.print(dog.name);
		dog.sleep();
	}
}
