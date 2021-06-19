package CMExample;

public class Dog extends Animal {
	
	public void sleep() {
		System.out.print("  Zzz.." + "\n");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("부모클래스의 setName() 메소드 호출 \n");
		System.out.print(dog.name);
		dog.sleep();
	}
}
