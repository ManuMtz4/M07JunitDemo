package m07junitdemo2;

/**
 * @author manuel y angel
 */
public class Calc {

    private double op1;
    private double op2;
    private char opType;

    public Calc(double op1, char opType, double op2) {
        this.opType = opType;
        this.op1 = op1;
        this.op2 = op2;
    }

    public double calcula() {
        double result = 0;
        switch (opType) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                result = op1 / op2;
                break;
            case '%':
                result = op1 % op2;
                break;
        }
        return result;
    }

    public char getOpType() {
        return opType;
    }

    public static void main(String[] args) {
        //TODO
    }
}
