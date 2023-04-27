public class AndFilterTreeOperator implements FilterOperator {
    public boolean eval(boolean left, boolean right) {
        return left && right;
    }
}
