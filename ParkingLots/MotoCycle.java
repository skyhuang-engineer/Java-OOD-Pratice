import java.sql.Timestamp;

public class MotoCycle extends Vehicle {
    private CarType type;
    private String carID;
    private Timestamp entryTime;
    private Timestamp leavingTime;

    public MotoCycle(CarType type, String id, Timestamp timestamp) {
        super(CarType.Motor, id, timestamp);
    }

    @Override
    public int caculateFee() {
        // calculate MotoCycle Fees
        return 0;
    }
}
