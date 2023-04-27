abstract class FileFilter {
    private FilterParameter curparameter;
    public FileFilter(FilterParameter cur) {
        this.curparameter = cur;
    }
    abstract boolean filter(File file);
    public FilterParameter getFilterParameter() {
        return this.curparameter;
    }
}