final class OrFilterTreeOperator implements FilterOperator {
    @Override
    public boolean eval(boolean left, boolean right) {
        return left || right;
    }
}