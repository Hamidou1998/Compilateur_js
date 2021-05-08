import java.util.ArrayList;
import java.util.List;


public class Command implements Serializable {

    private Variable variable;
    private List<Expression> expression = new ArrayList<>();
    
    
	public Command(Variable variable, List<Expression> expression) {
		super();
		this.variable = variable;
		this.expression = expression;
	}
		
	public Command() {
		super();
	}

	public Variable getVariable() {
		return variable;
	}
	
	public void setVariable(Variable variable) {
		this.variable = variable;
	}
	
	public List<Expression> getExpression() {
		return expression;
	}
	
	public void setExpression(List<Expression> expression) {
		this.expression = expression;
	}

	public String toString() {
		return "Command [variable=" + variable + ", expression=" + expression + "]";
	} 
    
}