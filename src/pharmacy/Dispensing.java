package pharmacy;

import data.ProductID;
import exceptions.DispensingNotAvaiableException;

import java.util.Date;

public class Dispensing {
    private byte nOrder;
    private Date initDate, finalDate;
    private boolean isCompleted;

    public Dispensing(byte order, Date initD, Date finalD){
        this.nOrder = order;
        this.initDate = initD;
        this.finalDate = finalD;
    }
    public boolean dispensingEnabled() throws DispensingNotAvaiableException {
       if(new Date().after(this.initDate) && new Date().before(this.finalDate)){
           return true;
       }else{
           throw new DispensingNotAvaiableException("Dispensacio no disponible");
       }
    }
    public void setProductAsDispensed(ProductID prodID){
        MedicineDispensingLine DispensingLine = new MedicineDispensingLine(prodID);
        DispensingLine.setDispensed();
    }
    public void setCompleted(boolean comp){
        this.isCompleted = comp;
    }

    public byte getnOrder() {
        return this.nOrder;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public Date getFinalDate() {
        return this.finalDate;
    }

    public Date getInitDate() {
        return this.initDate;
    }
}
