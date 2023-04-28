import java.sql.Timestamp;

public abstract class Vehicle {
    private CarType type;
    private String carID;
    private Timestamp entryTime;
    private Timestamp leavingTime;


    public Vehicle(CarType type, String carID, Timestamp entryTime) {
        this.type = type;
        this.carID = carID;
        this.entryTime = entryTime;
    }

    public abstract int caculateFee();


    public CarType getType() {
        return this.type;
    }

}
