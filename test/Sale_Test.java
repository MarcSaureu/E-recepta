import static org.junit.jupiter.api.Assertions.*;

import exceptions.SaleClosedException;
import org.junit.jupiter.api.Test;
import pharmacy.Sale;

import java.math.BigDecimal;
import java.util.Date;

public class Sale_Test {
    Sale sale = new Sale(1,new Date(),new BigDecimal(10));

    @Test
    public void saleCodeTest(){
        assertEquals(1,sale.getSaleCode());
    }
    @Test
    public void getAmountTest() throws SaleClosedException {
        assertEquals(new BigDecimal(10 + (10*0.21)),sale.getAmount());
    }
}
