class FilterTreeNode {
    private final FileFilter fileFilter;
    private final FilterOperator operator;
    private final FilterTreeNode left;
    private final FilterTreeNode right;
    public FilterTreeNode(FileFilter fileFilter) {
        this.fileFilter = fileFilter;
        this.operator = null;
        this.left = null;
        this.right = null;
    }
    public FilterTreeNode(FilterOperator operator,
                          FilterTreeNode left, FilterTreeNode right) {
        this.fileFilter = null;
        this.operator = operator;
        this.left = left;
        this.right = right;
    }
    public boolean eval(File file) {
        if (this.fileFilter != null) {
            return this.fileFilter.filter(file);
        }
        boolean left = this.left.eval(file);
        boolean right = this.right.eval(file);
        return this.operator.eval(left, right);
    }
}
