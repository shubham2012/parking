package ParkingLot;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Shubham Gupta on 20/06/19.
 */
public class ParkingController {

    private Slots slots;
    private Allocation allocation;

    public ParkingController(int size) {
        this.slots = new Slots(size);
        this.allocation = new Allocation();
    }

    public int allocateParking(String regNumber, Color color) throws Exception {
        int slot = slots.getAndUpdateSlot();
        AllocationEntry entry = new AllocationEntry(regNumber, color);
        allocation.allocate(slot, entry);
        return slot;
    }

    public void releaseParking(int slot){
        allocation.releaseAllocation(slot);
        slots.releaseSlot(slot);
    }

    public void printOccupiedSlots(){
        System.out.println(allocation.getAllocationMap());
        System.out.println(slots.getAvailableSlots());
    }

    public void getAllSlotsHavingColor(Color color){
        Map<Integer, AllocationEntry> result = allocation.getAllocationMap().entrySet().stream()
                .filter(x -> x.getValue().getColor().equals(color))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(result);
    }

}
