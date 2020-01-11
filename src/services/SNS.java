package services;

import data.HealthCardID;
import data.PatientContr;
import data.ProductID;
import exceptions.HealthCardException;
import exceptions.NotValiedPrescriptionException;
import exceptions.ProductIDException;
import pharmacy.Dispensing;
import pharmacy.ProductSpecification;

import java.math.BigDecimal;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SNS implements NationalHealthService {
    private boolean isConnected = false;
    private Dispensing disp;
    @Override
    public Dispensing getePrenscription(HealthCardID hcID) throws HealthCardException, NotValiedPrescriptionException, ConnectException {
        if(hcID.getPersonalID() == null){
            throw new HealthCardException("Error");
        }
        if(!isConnected()){
            throw new ConnectException("Error");
        }
        byte order = (byte) hcID.hashCode();
        Dispensing dispensing = new Dispensing(order,new Date(),new Date());
        if(!dispensing.isValidDate()){
            throw new NotValiedPrescriptionException("Error");
        }
        this.disp = dispensing;
        return dispensing;
    }

    @Override
    public PatientContr getPatientContr(HealthCardID hcID) throws ConnectException {
        if(!isConnected()){
            throw new ConnectException("Error");
        }
        return new PatientContr(new BigDecimal(hcID.getPersonalID()));
    }

    @Override
    public ProductSpecification getProductSpecific(ProductID pID) throws ProductIDException, ConnectException {
        if(pID.getUPC() == null){
            throw new ProductIDException("Error");
        }
        if(!isConnected()){
            throw new ConnectException("Error");
        }
        return new ProductSpecification(pID);
    }

    @Override
    public List<Dispensing> updatePrescription(HealthCardID hcID, Dispensing disp) throws ConnectException {
        if(!isConnected()){
            throw new ConnectException("Error");
        }
        List<Dispensing> list = new ArrayList<>();
        list.add(disp);
        return list;
    }
    public void setConnected(){
        this.isConnected = true;
    }
    private boolean isConnected(){
        return this.isConnected;
    }

    public HealthCardID getHealthCardID() throws HealthCardException{
        if(this.disp.getnOrder() == 0){
            throw new HealthCardException("Error");
        }
        return new HealthCardID(disp.nOrderToString());
    }
}
