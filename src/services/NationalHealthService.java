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

public interface NationalHealthService {

    Dispensing getePrenscription(HealthCardID hcID) throws HealthCardException, NotValiedPrescriptionException, ConnectException;

    PatientContr getPatientContr(HealthCardID hcID) throws ConnectException;

    ProductSpecification getProductSpecific(ProductID pID) throws ProductIDException, ConnectException;

    List<Dispensing> updatePrescription(HealthCardID hcID, Dispensing disp) throws ConnectException;
}
