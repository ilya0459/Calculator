public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        var result = target.newFormula()
                .addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        var result = target.newFormula()
                .addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) result;
    }

    @Override
    public int pow(int a, int b) {
        var result = target.newFormula()
                .addOperand(a).addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int)result;
    }

    @Override
    public int sub(int arg0, int arg1) {
        var subResult = target.newFormula()
                .addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
        return (int) subResult;
    }

    @Override
    public int div(int a, int b) {
        var divResult = target.newFormula()
                .addOperand(a).addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
        return (int) divResult;
    }
}