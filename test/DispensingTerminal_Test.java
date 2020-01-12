import static org.junit.jupiter.api.Assertions.*;

import data.HealthCardID;
import data.ProductID;
import exceptions.HealthCardException;
import exceptions.NotValiedPrescriptionException;
import exceptions.ProductIDException;
import exceptions.SaleClosedException;
import org.junit.jupiter.api.Test;
import pharmacy.Dispensing;
import pharmacy.DispensingTerminal;
import services.SNS;
import services.SNSInt;


import java.net.ConnectException;
import java.util.Date;

class DispensingTerminal_Test {
    private byte order = 20;
    private ProductID PID = new ProductID("1");
    private Dispensing disp = new Dispensing(order, new Date(), new Date());
    private DispensingTerminal DispensingTerminal = new DispensingTerminal(disp);

    void SNSInit() throws HealthCardException, NotValiedPrescriptionException, ConnectException {
        DispensingTerminal.SNSInit();
    }
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
    void EnterProductIDTest() throws SaleClosedException, ProductIDException, ConnectException, HealthCardException, NotValiedPrescriptionException {
        SNSInit();
        DispensingTerminal.initNewSale();
        DispensingTerminal.enterProduct(PID);
        assertTrue(DispensingTerminal.EnteredProduct());
    }
    @Test
    void SNSDobleTest(){
        SNSDoble SNS = new SNSDoble();
        SNS.setConnected();
        assertTrue(SNS.isConnected);
    }
    @Test
    void getEPrenscriptionTest() throws HealthCardException, NotValiedPrescriptionException, ConnectException {
        DispensingTerminal Disp = new DispensingTerminal(null);
        Disp.SNSInit();
        HealthCardID hcID =  new HealthCardID("1");
        SNS sns = Disp.getSns();
        Dispensing dispensing = sns.getePrenscription(hcID);
        Disp.getePrenscription();
        assertTrue(sns.isConnected());
    }

    private static class SNSDoble implements SNSInt {
        private boolean isConnected = false;
        @Override
        public void setConnected() {
            this.isConnected = true;
        }

        @Override
        public boolean isConnected() {
            return this.isConnected;
        }
    }
}
