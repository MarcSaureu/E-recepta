import static org.junit.jupiter.api.Assertions.*;

import data.PatientContr;
import data.ProductID;
import exceptions.SaleClosedException;
import org.junit.jupiter.api.Test;
import pharmacy.Sale;

import java.math.BigDecimal;
import java.util.Date;

class Sale_Test {
    private Date dat = new Date("2020/9/20");
    private Sale sale = new Sale(1,dat,new BigDecimal(10));

    private void initializeSaleLine() throws SaleClosedException {
        sale.addLine(new ProductID("1"),new BigDecimal(2),new PatientContr(new BigDecimal(3)));
    }
    private void createnewSaleLine(ProductID prodID, BigDecimal price, PatientContr patientContr) throws SaleClosedException {
        sale.addLine(prodID,price,patientContr);
    }

    @Test
    void saleCodeTest(){
        assertEquals(1,sale.getSaleCode());
    }
    @Test
    void getAmountTestwithTax() throws SaleClosedException {
        BigDecimal big = new BigDecimal(12.1);
        assertEquals(big.floatValue(), sale.getAmount().floatValue());
    }
    @Test
    void getAmountTestWithoutTaxes(){
        BigDecimal big = new BigDecimal(10);
        assertEquals(big, sale.getAmountwithoutTaxes());
    }
    @Test
    void isClosedTest(){
        assertFalse(sale.isClosed());
    }

    @Test
    void SaleLineTest() throws SaleClosedException {
        initializeSaleLine();
        assertTrue(sale.existSaleLine());
    }
    @Test
    void CalculateAmountTest() throws SaleClosedException {
        initializeSaleLine();
        sale.CalculateFinalAmount();
        assertEquals(new BigDecimal(2),sale.getCurrentamount());
    }
    @Test
    void getDateTest(){
        assertEquals(dat,sale.getDate());
    }
}
