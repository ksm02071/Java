package Constructor;

public class Human {
	String name = "";
	Animal animal;
	
	
	   
   public Human(String name, String animalName) {
      this.name = name;
      this.animal = new Animal(animalName);
   }
   
   public Human(String name ,String animalName, int legCnt , boolean isCheck) {
      this.name = name;
      this.animal = new Animal(animalName, legCnt, isCheck);
   }
   @Override
	public String toString() {
		return animal + " " + name;
	}
  
}
