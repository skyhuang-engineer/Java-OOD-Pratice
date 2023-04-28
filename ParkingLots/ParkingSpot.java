public class ParkingSpot {
    private int id;
    private int size;
    private boolean canPark;
    private final ParkingLevel parkingLevel;
    public ParkingSpot(int id, int size, ParkingLevel parkingLevel) {
        this.id = id;
        this.size = size;
        this.canPark = true;
        this.parkingLevel = parkingLevel;
    }
    public boolean getcanPark() {
        return this.canPark;
    }
    public int getSize() {
        return this.size;
    }

    public void setCanPark(boolean canPark) {
        this.canPark = canPark;
    }

    public synchronized boolean park(Vehicle vehicle) {
        if (this.getcanPark() && this.getSize() >= vehicle.getType().getSize()) {
            this.setCanPark(false);
            // manipulate current level availability for this type
            if (this.size == 1) {
                this.parkingLevel.parkInMotor();
            }
            // ...
        }
        return false;
    }
    public synchronized void leave() {
        this.setCanPark(true);
        if (this.size == 1) {
            this.parkingLevel.leaveMotor();
        }
    }
}
