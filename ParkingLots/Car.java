import java.sql.Timestamp;

public class Car extends Vehicle {
    private CarType type;
    private String carID;
    private Timestamp entryTime;
    private Timestamp leavingTime;

    public Car(CarType type, String id, Timestamp timestamp) {
        super(CarType.Car, id, timestamp);
    }

    @Override
    public int caculateFee() {
        // calculate MotoCycle Fees
        return 0;
    }
}
