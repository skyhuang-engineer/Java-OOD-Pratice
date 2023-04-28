import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
    private ParkingSpot[] motorSpots;
    private ParkingSpot[] carSpots;
    private ParkingSpot[] busSpots;
    private int emptyMotor;
    private int emptyCar;
    private int emptyBus;
    private int level;
    private final ParkingGarage parkingGarage;
    private final int size;
    public ParkingLevel(int level, int motorAmt, int carAmt, int busAmt, ParkingGarage parkingGarage) {
        this.motorSpots = new ParkingSpot[motorAmt];
        this.carSpots = new ParkingSpot[carAmt];
        this.busSpots = new ParkingSpot[busAmt];
        this.level = level;
        this.parkingGarage = parkingGarage;
        this.size = motorAmt + carAmt + busAmt;
        this.emptyBus = busAmt;
        this.emptyCar = carAmt;
        this.emptyMotor = motorAmt;
    }

    public int avaliableMotor() {
        return this.emptyMotor;
    }

    public void parkInMotor() {
        this.emptyMotor--;
    }
    public void leaveMotor() {
        this.emptyMotor++;
    }

    public int getTotalAvaliable() {
        return this.emptyBus + this.emptyMotor + this.emptyCar;
    }


}
