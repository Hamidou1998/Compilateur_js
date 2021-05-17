import java.util.ArrayList;
import java.util.List;


public class Expression {

    private Operation operation;
    private List<String> expressions = new ArrayList<>();
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public List<String> getExpressions() {
		return expressions;
	}
	public void setExpressions(List<String> expressions) {
		this.expressions = expressions;
	}
    
    
}