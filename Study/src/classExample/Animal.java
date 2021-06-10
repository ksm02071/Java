package classExample;

public class Animal {
	
	String name;
	
	public void  setName(String name) {
		this.name = name;
	}
   
   public static void main(String[] args) {
	   
	   Animal dog = new Animal();
	   dog.setName("Puppy");
	   
	   Animal cat = new Animal();
	   cat.setName("Cat");
	   
	   System.out.println(dog.name);
	   System.out.println(cat.name);
   }
}