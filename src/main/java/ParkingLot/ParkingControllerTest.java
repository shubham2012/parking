package ParkingLot;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shubham Gupta on 21/06/19.
 */
public class ParkingControllerTest {

    @Test
    void testAllocationAndDeallocation() throws Exception {
        ParkingController controller = new ParkingController(10);
        List<Integer> list = new ArrayList<>();
        list.add(controller.allocateParking("KA 01 ML 1190", Color.BLACK));
        list.add(controller.allocateParking("KA 01 ML 1191", Color.WHITE));
        list.add(controller.allocateParking("KA 01 ML 1192", Color.BLACK));
        list.add(controller.allocateParking("KA 01 ML 1193", Color.BLUE));
        System.out.println(list);
        controller.printOccupiedSlots();
        controller.releaseParking(list.get(1));
        list.remove(1);
        System.out.println(list);
        controller.printOccupiedSlots();
        controller.getAllSlotsHavingColor(Color.BLACK);
    }
}