import java.util.ArrayList;
import java.util.List;

public class Program implements Serializable {

    private List<Command> commands = new ArrayList<>();

	public Program(List<Command> commands) {
		super();
		this.commands = commands;
	}

	public List<Command> getCommands() {
		return commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	@Override
	public String toString() {
		return "Program [commands=" + commands + "]";
	}
	
    
}
