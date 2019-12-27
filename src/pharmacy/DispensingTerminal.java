package pharmacy;

import data.ProductID;

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
    public void enterProduct(ProductID pID){
        dispensing.setProductAsDispensed(pID);
    }
    public void finalizeSale(){
        this.Sale.FinalizeSale();
    }
    public void realizePayment(BigDecimal quantity){

    }
    public void realizePayment(){

    }
    public void printNextDispensingSheet(){

    }
    private void addSaleID(){
        this.SaleID++;
    }
}
