package pharmacy;

import data.ProductID;

import java.util.Date;

public class Dispensing {
    private byte nOrder;
    private Date initDate, finalDate;
    private boolean isCompleted;

    public Dispensing(){

    }
    public boolean dispensingEnabled() throws DispensingNotAvaiableException{
       return false;
    }
    public void setProductAsDispensed(ProductID prodID){

    }
    public void setCompleted(boolean comp){
        this.isCompleted = comp;
    }
}
