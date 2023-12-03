package Designpattern.Behavioral.Interpreter;

public class Expressions {
    public static void main(String[] args) {
        System.out.println();
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Jack is male? " + isMale.interpret("Jack"));
        System.out.println("Sara is a married woman? " + isMarriedWoman.interpret("Married Sara"));
    }

    public static Expression getMaleExpression() {
        // Rule: Jack & John are male
        Expression jack = new TerminalExpression("Jack");
        Expression john = new TerminalExpression("John");
        return new OrExpression(jack, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression sara = new TerminalExpression("Sara");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(sara, married);
    }
}

interface Expression {
    boolean interpret(String context);
}

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}

class AndExpression implements Expression {
    private Expression exp1 = null;
    private Expression exp2 = null;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}

class OrExpression implements Expression {
    private Expression exp1 = null;
    private Expression exp2 = null;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
