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

    public static void newVariableToInitialize(Token token) {
        lastCommand = new Command();
        program.getCommands().add(lastCommand);
        Variable variable = new Variable();
        variable.setName(token.image);
        lastCommand.setVariable(variable);
    }

    public static void setOperation(Operation minus) {
        if (lastCommand.getExpression().get(lastCommand.getExpression().size() - 1).getOperation() != null)
            lastCommand.getExpression().add(new Expression());
        lastCommand.getExpression().get(lastCommand.getExpression().size() - 1).setOperation(minus);
    }

    public static void codeMachine() {
        program.getCommands().parallelStream().forEachOrdered(
                command -> {
                    command.getExpression().parallelStream().forEachOrdered(
                            expression -> {
                                if (expression.getOperation() != null) {
                                    switch (expression.getOperation()) {
                                        case PLUS:
                                            setExpressions(expression);
                                            stringBuilder.append("AddiRe");
                                            printLine();
                                            break;
                                        case MINUS:
                                            setExpressions(expression);
                                            stringBuilder.append("SubsRe");
                                            printLine();
                                            break;
                                        case DIV:
                                            setExpressions(expression);
                                            stringBuilder.append("DiviRe");
                                            printLine();
                                            break;
                                        case MULT:
                                            setExpressions(expression);
                                            stringBuilder.append("MultRe");
                                            printLine();
                                            break;
                                        case EQUAL:
                                            setExpressions(expression);
                                            stringBuilder.append("Equal");
                                            printLine();
                                            break;
                                        case TERN:
                                            setExpressionsTernaire(expression);
                                            break;
                                    }
                                } else {
                                    setExpressions(expression);
                                }
                            }
                    );
                    if (command.getVariable().getName() != null) {
                        stringBuilder.append("SetVar").append("\t").append(command.getVariable().getName());
                        printLine();
                    }
                }
        );
        System.out.println(stringBuilder.toString());
    }
    
}
