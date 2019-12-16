package pharmacy;

import data.PatientContr;
import data.ProductID;

import java.math.BigDecimal;

public class ProductSaleLine {
    private ProductID prodID;
    private BigDecimal price;
    private PatientContr contr;

    public ProductSaleLine(ProductID prod, BigDecimal pric, PatientContr cont){
        this.prodID = prod;
        this.price = pric;
        this.contr = cont;
    }

    public ProductID getProdID() {
        return this.prodID;
    }

    public PatientContr getContr() {
        return this.contr;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
