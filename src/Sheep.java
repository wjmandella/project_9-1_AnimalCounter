
public class Sheep extends Animal implements Cloneable {
	
	private String name;
	
	public Sheep(String n) {
		super();
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getCountString() {	
		return getCount() + " " + getName();
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
	
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	
}
