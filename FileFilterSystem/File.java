public class File {
    private int size;
    private String name;
    private String type;
    private String creator;
    public File(int size, String name, String type, String creator) {
        this.size = size;
        this.name = name;
        this.type = type;
        this.creator = creator;
    }
    public int getSize() {
        return this.size;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public String getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return this.size + ", " + this.name + ", " + this.type + ", " + this.creator;
    }
}