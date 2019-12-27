import static org.junit.jupiter.api.Assertions.*;
import pharmacy.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

class Dispensing_Test {
    private byte order = 20;
    private pharmacy.Dispensing dispensing = new Dispensing(order,new Date(), new Date());

    @Test
    void getOrderTest() {
        assertEquals(order, dispensing.getnOrder());
    }

}
