final class FilterbyName extends FileFilter {
    public FilterbyName(FilterParameter cur) {
        super(cur);
    }
    @Override
    public boolean filter(File file) {
        return file.getName().equals(this.getFilterParameter().getName());
    }
}
