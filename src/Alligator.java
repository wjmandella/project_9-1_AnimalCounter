
public class Alligator extends Animal {
	
	public Alligator() {
		super();
	}
	
	@Override
	public String getCountString() {
		return getCount() + " alligator";
	}
	
	@Override
	public void incrementCount() {
		count++;
	}
	
	@Override
	public void resetCount() {
		count = 0;	
	}
	
	@Override
	public int getCount() {
		return count;
	}
	
}
