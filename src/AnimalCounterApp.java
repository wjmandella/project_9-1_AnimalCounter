
public class AnimalCounterApp {

	public static void main(String[] args) {
		
		System.out.println("Counting alligators...\n");
		Alligator a = new Alligator();
		count(a, 3);
		
		System.out.println("Counting sheep...\n");
		Sheep s1 = new Sheep("Blackie");
		count(s1, 2);
				
		Sheep s2 = null; //initialize second sheep (the clone)
		
		try {
			//clone a sheep
			s2 = (Sheep) s1.clone();         
        }
        catch (CloneNotSupportedException e) {
            System.out.println("A cloning error occurred. Expect deranged---possibly even deadly--sheep.");
        }
		
		s2.setName("Dolly");
		count(s2, 3);
		count(s1, 1);
			
	}
	
	public static void count(Countable c, int maxCount) {
		
		for (int i = 1; i <= maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());		
		}
			c.resetCount();
			System.out.println();	
	}
}

