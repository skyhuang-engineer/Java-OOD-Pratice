public class FilterParameter {
    private Integer size;
    private String name;
    private String type;

    private String creator;
    private FilterParameter(Integer size, String name, String type, String creator) { // private constructor but public static buidler
        this.size = size;
        this.name = name;
        this.type = type;
        this.creator = creator;
    }
    public static FilterParameter createFromSize(int size) {
        return new FilterParameter(size, null, null, null);
    }
    public static FilterParameter createFromName(String name) {
        return new FilterParameter(null, name, null, null);
    }
    public static FilterParameter createFromType(String type) {
        return new FilterParameter(null, null, type, null);
    }
    public static FilterParameter createFromCreator(String creator) {
        return new FilterParameter(null, null, null, creator);
    }
    public Integer getSize() {
        return this.size;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public String getCreator() {
        return this.creator;
    }
}
