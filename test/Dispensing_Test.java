import static org.junit.jupiter.api.Assertions.*;

import data.ProductID;
import exceptions.DispensingNotAvaiableException;
import pharmacy.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

class Dispensing_Test {
    private byte order = 20;
    private Dispensing dispensing = new Dispensing(order, new Date("2019/05/14"), new Date("2020/09/20"));
    private ProductID PID = new ProductID("1");

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
        assertEquals( new Date("2020/09/20"), dispensing.getFinalDate());
    }
    @Test
    void isCompletedTest(){
        assertFalse(dispensing.isCompleted());
    }
    @Test
    void setCompletedTest(){
        dispensing.setCompleted(true);
        assertTrue(dispensing.isCompleted());
    }
    @Test
    void setProductAsDispensedTest(){
        dispensing.setProductAsDispensed(PID);
        assertTrue(dispensing.isDispensed());
    }
    @Test
    void isEnabledDispensedTest() throws DispensingNotAvaiableException {
        assertTrue(dispensing.dispensingEnabled());
    }
}
