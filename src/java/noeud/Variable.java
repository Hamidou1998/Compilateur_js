
public class Variable {
	
    private static int counter = 0;
    private String name;

    public Variable() {
        counter++;
    }

	public Variable(String name) {
		super();
		this.name = name;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Variable.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Variable [name=" + name + "]";
	}
	
    
}

