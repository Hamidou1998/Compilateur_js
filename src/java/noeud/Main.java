import utils.Token;

public class Main {

    private static final Program program = new Program();
    private static Command lastCommand;

    private static final StringBuilder stringBuilder = new StringBuilder();
    private static int line = 1;

    public static void addExpression(Token token) {
        lastCommand.getExpression().get(lastCommand.getExpression().size() - 1).
                getExpressions().add(token.image);
    }
    public static void newStatement() {

    }

    public static void setExpression(Token token) {
        Expression expression = lastCommand.getExpression().size() == 0 ? null : lastCommand.getExpression().get(lastCommand.getExpression().size() - 1);
        if (expression == null) {
            expression = new Expression();
            lastCommand.getExpression().add(expression);
        }
        addExpression(token);
    }
}