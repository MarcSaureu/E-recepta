package pharmacy;

import data.ProductID;

import java.math.BigDecimal;

public class ProductSpecification {
    private ProductID UPCcode;
    private String description;
    private BigDecimal price;
    public ProductSpecification(ProductID pID){
        this.UPCcode = pID;
    }

    public String getDescription(){
        return this.description;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
}
