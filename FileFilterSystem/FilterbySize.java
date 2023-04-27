final class FilterbySize extends FileFilter {
    public FilterbySize(FilterParameter cur) {
        super(cur);
    }
    @Override
    public boolean filter(File file) {
        return file.getSize() == this.getFilterParameter().getSize();
    }
}

