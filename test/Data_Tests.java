import static org.junit.jupiter.api.Assertions.*;
import data.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class Data_Tests {
    private HealthCardID HealthCard = new HealthCardID("1234");
    private PatientContr PatientContr =  new PatientContr(new BigDecimal(1234));
    private ProductID Product = new ProductID("1234");
    @Test
    void getHealthCardIDTest(){
        assertEquals("1234",HealthCard.getPersonalID());
    }
    @Test
    void getPatientContrTest(){
        assertEquals(new BigDecimal(1234),PatientContr.getPatientAport());
    }
    @Test
    void getProductIDTest(){
        assertEquals("1234",Product.getUPC());
    }
    @Test
    void HealthCardIdEquals(){
        assertTrue(HealthCard.equals(HealthCard));
    }
    @Test
    void PatientContrEquals(){
        assertTrue(PatientContr.equals(PatientContr));
    }
    @Test
    void ProductIDEquals(){
        assertTrue(Product.equals(Product));
    }
    @Test
    void HealthCardHashCode(){
        assertEquals("1234".hashCode(),HealthCard.hashCode());
    }
    @Test
    void PatientContrHashCode(){
        assertEquals(new BigDecimal(1234).hashCode(),PatientContr.hashCode());
    }
    @Test
    void ProdcutHashCode(){
        assertEquals("1234".hashCode(),Product.hashCode());
    }
    @Test
    void HealthCardToString(){
        assertEquals("HealthCardID{ " + "personal code='" + "1234" + '\''+ '}',HealthCard.toString());
    }
    @Test
    void PatientContrToString(){
        assertEquals("PatientContr{ " + "PatientAportation code='" + "1234" + '\''+ '}', PatientContr.toString());
    }
    @Test
    void ProductIDToString(){
        assertEquals("ProductID{ " + "product code='" + "1234" + '\''+ '}',Product.toString());
    }
}
