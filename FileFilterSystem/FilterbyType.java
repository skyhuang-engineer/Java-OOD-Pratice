final class FilterbyType extends FileFilter {
    public FilterbyType(FilterParameter cur) {
        super(cur);
    }
    @Override
    public boolean filter(File file) {
        return file.getType().equals(this.getFilterParameter().getType());
    }
}
