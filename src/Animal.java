
public abstract class Animal implements Countable {
	
	public int count;

	public Animal() {
		
	}
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		count = 0;
	}	
	
	public void incrementCount() {
		count++;
	}
	
	public String getCountString() {
		return null;
		
	}
}


