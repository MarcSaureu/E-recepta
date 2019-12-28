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

    public ProductID getUPCcode() {
        return this.UPCcode;
    }

    public String getDescription(){
        return this.description;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public void setDescription(String descriptio){
        this.description = descriptio;
    }
    public void setPrice(BigDecimal pric){
        this.price = pric;
    }
}
