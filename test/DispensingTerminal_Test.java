import static org.junit.jupiter.api.Assertions.*;

import data.ProductID;
import exceptions.SaleClosedException;
import org.junit.jupiter.api.Test;
import pharmacy.Dispensing;
import pharmacy.DispensingTerminal;



import java.util.Date;

class DispensingTerminal_Test {
    private byte order = 20;
    private ProductID PID = new ProductID("1");
    private Dispensing disp = new Dispensing(order, new Date(), new Date());
    private DispensingTerminal DispensingTerminal = new DispensingTerminal(disp);

    @Test
    void CreationSaleTest(){
        DispensingTerminal.initNewSale();
        assertEquals(1,DispensingTerminal.getSaleID());
    }
    @Test
    void FinalizeSaleTest(){
        DispensingTerminal.initNewSale();
        DispensingTerminal.finalizeSale();
        assertTrue(DispensingTerminal.isSaleClosed());
    }
    @Test
    void EnterProductIDTest() throws SaleClosedException {
        DispensingTerminal.initNewSale();
        DispensingTerminal.enterProduct(PID);
        assertTrue(DispensingTerminal.EnteredProduct());
    }
}
