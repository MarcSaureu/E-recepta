package data;

import java.math.BigDecimal;

public final class PatientContr {
    private final BigDecimal PatientAport;

    public PatientContr(BigDecimal Contribution) {
        PatientAport = Contribution;
    }

    public BigDecimal getPatientAport() {
        return PatientAport;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        PatientContr patientCont = (PatientContr) o;
        return PatientAport.equals(patientCont.PatientAport);
    }

    @Override
    public int hashCode(){
        return PatientAport.hashCode();
    }
    @Override
    public String toString(){
        return "PatientContr{ " + "PatientAportation code='" + PatientAport + '\''+ '}';
    }

}
