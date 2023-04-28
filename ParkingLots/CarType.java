public enum CarType {
    Motor("Motor", 1),
    Car("Car", 2),
    Bus("Bus", 3);

    private final int size;
    private final String typeName;
    private CarType(String typeName, int size) {
        this.typeName = typeName;
        this.size = size;
    }
    public int getSize() {
        return size;
    }

}
