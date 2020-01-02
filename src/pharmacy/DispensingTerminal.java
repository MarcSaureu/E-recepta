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

    public DispensingTerminal(Dispensing disp){
        this.dispensing = disp;
    }
    public void getePrenscription(char option){

    }
    public void initNewSale(){
        this.Sale = new Sale(SaleID,new Date(),new BigDecimal(0));
        addSaleID();
    }
    public void enterProduct(ProductID pID) throws SaleClosedException {
        ProductSpecification Specification = new ProductSpecification(pID);
        Specification.setPrice(new BigDecimal(1));
        this.Sale.addLine(pID,Specification.getPrice(), new PatientContr(new BigDecimal(0)));
        this.dispensing.setProductAsDispensed(pID);
    }
    public void finalizeSale(){
        this.Sale.FinalizeSale();
    }
    public void realizePayment(BigDecimal quantity) throws SaleClosedException, QuantityMinorThanImportException {
        if(quantity.compareTo(this.Sale.getAmount()) < 0){
            throw new QuantityMinorThanImportException("Quantity minor than Import");
        }
        if(this.Sale.isClosed()){
            throw new SaleClosedException("Sale is Closed");
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
    public int getSaleID(){
        return this.SaleID;
    }
    public boolean isSaleClosed(){
        return this.Sale.isClosed();
    }
    public boolean EnteredProduct(){
        return this.dispensing.isDispensed();
    }
}
