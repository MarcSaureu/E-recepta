import static org.junit.jupiter.api.Assertions.*;
import pharmacy.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

class Dispensing_Test {
    private byte order = 20;
    private Dispensing dispensing = new Dispensing(order, new Date("2019/05/14"), new Date("2019/09/20"));

    @Test
    void getOrderTest(){
        assertEquals(order, dispensing.getnOrder());
    }
    @Test
    void getInitDateTest(){
        assertEquals(new Date("2019/05/14"), dispensing.getInitDate());
    }
    @Test
    void getEndDateTest(){
        assertEquals( new Date("2019/09/20"), dispensing.getFinalDate());
    }

}
