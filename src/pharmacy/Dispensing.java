package pharmacy;

import data.ProductID;
import exceptions.DispensingNotAvaiableException;

import java.util.Date;

public class Dispensing {
    private byte nOrder;
    private Date initDate, finalDate;
    private boolean isCompleted;
    private MedicineDispensingLine DispensingLine;

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
        this.DispensingLine = new MedicineDispensingLine(prodID);
        this.DispensingLine.setDispensed();
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

    public boolean isDispensed(){
        return this.DispensingLine.getDispensed();
    }

    public boolean isValidDate(){
        return new Date().after(this.initDate) && new Date().before(this.finalDate);
    }

    public String nOrderToString(){
        return  "" + nOrder;
    }

    public void setInitDate(Date date){
        this.initDate = date;
    }
    public void setFinalDate(Date date){
        this.finalDate = date;
    }
}
