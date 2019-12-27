package pharmacy;

import data.PatientContr;
import data.ProductID;
import exceptions.QuantityMinorThanImportException;
import exceptions.SaleClosedException;

import java.math.BigDecimal;
import java.util.Date;

public class DispensingTerminal {
    private Sale Sale;
    private int SaleID = 0;
    private Dispensing dispensing;

    public DispensingTerminal(){

    }
    public void getePrenscription(char option){

    }
    public void initNewSale(){
        this.Sale = new Sale(SaleID,new Date(),new BigDecimal(0));
        addSaleID();
    }
    public void enterProduct(ProductID pID) throws SaleClosedException {
        ProductSpecification Specification = new ProductSpecification(pID);
        this.Sale.addLine(pID,Specification.getPrice(), new PatientContr(Specification.getPrice()));
        dispensing.setProductAsDispensed(pID);
    }
    public void finalizeSale() throws SaleClosedException, QuantityMinorThanImportException {
        this.Sale.FinalizeSale();
        realizePayment(this.Sale.getCurrentamount());
    }
    public void realizePayment(BigDecimal quantity) throws SaleClosedException, QuantityMinorThanImportException {
        if(quantity.compareTo(Sale.getAmount()) < 0){
            throw new QuantityMinorThanImportException("Quantity minor than Import");
        }

    }
    public void realizePayment(){
        throw new UnsupportedOperationException("Not Implemented");
    }
    public void printNextDispensingSheet(){
        throw new UnsupportedOperationException("Not Implemented");
    }
    private void addSaleID(){
        this.SaleID++;
    }
}
