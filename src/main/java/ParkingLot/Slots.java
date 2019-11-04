package ParkingLot;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Shubham Gupta on 20/06/19.
 */
public class Slots {

    private static Set<Integer> slot;

    public Slots(int size) {
        this.slot = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            slot.add(i);
        }
    }

    public int getAndUpdateSlot() throws Exception {
        Iterator<Integer> slotIterator = slot.iterator();
        if (!slotIterator.hasNext()){
            System.out.println("Paring full");
            throw new Exception();
        }
        Integer nextSlot = slotIterator.next();
        slot.remove(nextSlot);
        return nextSlot;
    }

    public void releaseSlot(int releasedSlot){
        slot.add(releasedSlot);
    }

    public Set<Integer> getAvailableSlots(){
        return slot;
    }

}
