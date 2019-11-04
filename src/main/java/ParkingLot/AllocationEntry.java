package ParkingLot;

import lombok.Data;

/**
 * Created by Shubham Gupta on 21/06/19.
 */
@Data
public class AllocationEntry {
    private String registrationNumber;
    private Color color;

    public AllocationEntry(String registrationNumber, Color color) {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }
}
