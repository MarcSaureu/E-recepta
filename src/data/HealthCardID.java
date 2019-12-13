package data;

public final class HealthCardID {

    private final String PersonalID;

    public HealthCardID(String code) {
        this.PersonalID = code;
    }

    public String getPersonalID() throws NullPointerException {
        return PersonalID;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        HealthCardID hcardID = (HealthCardID) o;
        return PersonalID.equals(hcardID.PersonalID);
    }

    @Override
    public int hashCode(){
        return PersonalID.hashCode();
    }
    @Override
    public String toString(){
        return "HealthCardID{ " + "personal code='" + PersonalID + '\''+ '}';
    }
}
