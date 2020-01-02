import static org.junit.jupiter.api.Assertions.*;

import data.ProductID;
import org.junit.jupiter.api.Test;
import pharmacy.MedicineDispensingLine;

class MedicineDispensingLine_Test {
    private ProductID prodID = new ProductID("1");
    private MedicineDispensingLine MedicineDispensingLine = new MedicineDispensingLine(prodID);
    @Test
    void getProdIDTest(){
        assertEquals(prodID,MedicineDispensingLine.getProdID());
    }
    @Test
    void getDispensedTest(){
        assertFalse(MedicineDispensingLine.getDispensed());
    }
    @Test
    void setDispensedTest(){
        MedicineDispensingLine.setDispensed();
        assertTrue(MedicineDispensingLine.getDispensed());
    }
}
