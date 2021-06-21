package Constructor;

public class AniamlHospital {
	
	public static void main(String[] args) {
		Animal ani1 = new Animal("Áøµ¾°³",4,true);
		Animal ani2 = new Animal("°í¾çÀÌ",4,true);
		Animal ani3 = new Animal("¾Ç¾î",4,false);
		System.out.print(ani1 + "\n");
		System.out.print(ani2 + "\n");
		System.out.print(ani3 + "\n");
		
		 Human a = new Human("¿¬¼­","ÂÉ·ÕÀÌ",2,true);
		 System.out.print(a);
	}
}
