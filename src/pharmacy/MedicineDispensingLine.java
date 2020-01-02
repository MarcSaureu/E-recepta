package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {
    private ProductID prodID;
    private boolean Dispensed = false;

    public MedicineDispensingLine(ProductID prodId){
        this.prodID = prodId;
    }
    public void setDispensed(){
        this.Dispensed = true;
    }
    public ProductID getProdID(){
        return this.prodID;
    }
    public boolean getDispensed(){
        return this.Dispensed;
    }
}
