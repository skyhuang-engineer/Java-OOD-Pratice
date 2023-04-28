import java.util.List;

public class ParkingGarage {
    List<ParkingLevel> allLevel;
    private final int totalLevel;
    public ParkingGarage(List<ParkingLevel> allLevel) {
        this.allLevel = allLevel;
        this.totalLevel = allLevel.size();
    }

    public int getTotal() {
        int cnt = 0;
        for (ParkingLevel each : allLevel) {
            cnt += each.getTotalAvaliable();
        }
        return cnt;
    }
    // getAll Avaliable;
}
