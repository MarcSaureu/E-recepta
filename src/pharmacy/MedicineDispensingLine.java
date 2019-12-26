package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {
    private ProductID prodID;
    private boolean dispensed;

    public MedicineDispensingLine(ProductID prodId){
        this.prodID = prodId;
    }
    public void setDispensed(){
        this.dispensed = true;
    }
    public ProductID getProdID(){
        return this.prodID;
    }
    public boolean getdispensed(){
        return this.dispensed;
    }
}
