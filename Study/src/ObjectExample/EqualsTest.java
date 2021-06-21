package ObjectExample;

class Fruit {
	String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Fruit fruit = (Fruit) obj;
		//name  : String ObjectExample.Fruit.name
		//fruit : Fruit fruit - ObjectExample.Fruit.equals(Object)
		// return name.equals(fruit.name);
		
		return name == fruit.name;
	}
}

public class EqualsTest {
	
	public static void main(String[] args) {
		
		Fruit f1 = new Fruit("수박");
		Fruit f2 = new Fruit("수박");
		
		if(f1.equals(f2)) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
		
	}
}
