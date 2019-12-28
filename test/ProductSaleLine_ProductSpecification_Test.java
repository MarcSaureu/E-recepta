import data.PatientContr;
import data.ProductID;
import org.junit.jupiter.api.Test;
import pharmacy.ProductSaleLine;
import pharmacy.ProductSpecification;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductSaleLine_ProductSpecification_Test {
    private ProductID PID = new ProductID("1");
    private ProductSpecification Specification = new ProductSpecification(PID);
    private String Description = "Hola";
    private BigDecimal price = new BigDecimal("10");
    private BigDecimal Cont = new BigDecimal("20");
    private PatientContr Contr = new PatientContr(Cont);
    private ProductSaleLine SaleLine = new ProductSaleLine(PID,price,Contr);

    @Test
    void ProductSpecification_GetUPCCodeTest(){
        assertEquals(PID,Specification.getUPCcode());
    }
    @Test
    void ProductSpecification_GetDescriptionTest(){
        Specification.setDescription(Description);
        assertEquals(Description,Specification.getDescription());
    }
    @Test
    void ProductSpecification_GetPriceTest(){
        Specification.setPrice(price);
        assertEquals(price,Specification.getPrice());
    }
    @Test
    void ProductSaleLine_GetProdIDTest(){
        assertEquals(PID,SaleLine.getProdID());
    }
    @Test
    void ProductSaleLine_GetPriceTest(){
        assertEquals(price,SaleLine.getPrice());
    }
    @Test
    void ProductSaleLine_GetContrTest(){
        assertEquals(Contr,SaleLine.getContr());
    }
}
