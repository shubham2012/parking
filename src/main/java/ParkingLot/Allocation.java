package ParkingLot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shubham Gupta on 21/06/19.
 */
public class Allocation {

    private static Map<Integer, AllocationEntry> allocationMap;

    public Allocation() {
        this.allocationMap = new HashMap<>();
    }

    public void releaseAllocation(int slot){
        allocationMap.remove(slot);
    }

    public void allocate(int slot, AllocationEntry allocationEntry){
        allocationMap.put(slot, allocationEntry);
    }

    public static Map<Integer, AllocationEntry> getAllocationMap() {
        return allocationMap;
    }
}
