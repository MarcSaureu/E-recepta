package services;

import data.HealthCardID;
import data.PatientContr;
import data.ProductID;
import exceptions.HealthCardException;
import exceptions.NotValiedPrescriptionException;
import exceptions.ProductIDException;
import pharmacy.Dispensing;
import pharmacy.ProductSpecification;

import java.net.ConnectException;
import java.util.List;

public class SNS implements NationalHealthService {
    @Override
    public Dispensing getePrenscription(HealthCardID hcID) throws HealthCardException, NotValiedPrescriptionException, ConnectException {
        if(hcID.getPersonalID() == null){
            throw new HealthCardException("Error");
        }
        return null;
    }

    @Override
    public PatientContr getPatientContr(HealthCardID hcID) throws ConnectException {
        return null;
    }

    @Override
    public ProductSpecification getProductSpecific(ProductID pID) throws ProductIDException, ConnectException {
        if(pID.getUPC() == null){
            throw new ProductIDException("Error");
        }
        return new ProductSpecification(pID);
    }

    @Override
    public List<Dispensing> updatePrescription(HealthCardID hcID, Dispensing disp) throws ConnectException {
        return null;
    }
}
