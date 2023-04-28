import java.sql.Timestamp;

public class Bus extends Vehicle {
        private CarType type;
        private String carID;
        private Timestamp entryTime;
        private Timestamp leavingTime;

        public Bus(CarType type, String id, Timestamp timestamp) {
            super(CarType.Bus, id, timestamp);
        }
        @Override
        public int caculateFee() {
            // calculate Bus Fees
            return 100;
        }
}

