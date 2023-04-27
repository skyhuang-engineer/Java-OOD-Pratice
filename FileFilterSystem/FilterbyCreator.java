final class FilterbyCreator extends FileFilter {
    public FilterbyCreator(FilterParameter cur) {
        super(cur);
    }
    @Override
    public boolean filter(File file) {
        return file.getCreator().equals(this.getFilterParameter().getType());
    }
}

