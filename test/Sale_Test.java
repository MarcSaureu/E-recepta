import static org.junit.jupiter.api.Assertions.*;

import exceptions.SaleClosedException;
import org.junit.jupiter.api.Test;
import pharmacy.Sale;

import java.math.BigDecimal;
import java.util.Date;

class Sale_Test {
    private Sale sale = new Sale(1,new Date(),new BigDecimal(10));

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

}
