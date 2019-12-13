import static org.junit.jupiter.api.Assertions.*;
import data.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class Data_Tests {
    private data.HealthCardID HealthCard = new HealthCardID("1234");
    private data.PatientContr PatientContr =  new PatientContr(new BigDecimal(1234));
    private data.ProductID Product = new ProductID("1234");
    @Test
    void HealthCardIDTest(){
        assertEquals("1234",HealthCard.getPersonalID());
    }
    @Test
    void PatientContrTest(){
        assertEquals(new BigDecimal(1234),PatientContr.getPatientAport());
    }
    @Test
    void ProductIDTest(){
        assertEquals("1234",Product.getUPC());
    }
}
