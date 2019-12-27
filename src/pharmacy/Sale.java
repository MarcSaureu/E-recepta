package pharmacy;

import data.PatientContr;
import data.ProductID;
import exceptions.SaleClosedException;

import java.math.BigDecimal;
import java.util.Date;

public class Sale {
    private int saleCode;
    private Date date;
    private BigDecimal amount;
    private boolean isClosed;
    private ProductSaleLine SaleLine;
    private BigDecimal currentamount = new BigDecimal(0);

    public Sale(int sale, Date dat, BigDecimal big){
        this.saleCode = sale;
        this.date = dat;
        this.amount = big;
    }
    public void addLine(ProductID prodID, BigDecimal price, PatientContr contr) throws SaleClosedException{
        if(isClosed()){
            throw new SaleClosedException("Error");
        }
        this.SaleLine = new ProductSaleLine(prodID,price,contr);
        calculateAmount();
    }
    private void calculateAmount(){
        this.currentamount = this.currentamount.add(this.SaleLine.getPrice());
    }
    private void addTaxes() throws SaleClosedException {
        if(isClosed()){
            throw new SaleClosedException("Error");
        }
        this.amount = (this.amount.add((this.amount.multiply(new BigDecimal(0.21)))));
    }
    public void CalculateFinalAmount() throws SaleClosedException{
        if(isClosed()){
            throw new SaleClosedException("Error");
        }
        this.amount = this.currentamount;
    }
    public BigDecimal getAmount() throws SaleClosedException {
        if(isClosed()){
            throw new SaleClosedException("Error");
        }
        addTaxes();
        return this.amount;
    }
    private void setClosed(){
        this.isClosed = true;
    }
    public boolean isClosed(){
        return this.isClosed;
    }

    public int getSaleCode() {
        return this.saleCode;
    }

    public Date getDate() {
        return this.date;
    }
    public BigDecimal getAmountwithoutTaxes(){
        return this.amount;
    }
    public boolean existSaleLine(){
        return this.SaleLine.getProdID() != null && this.SaleLine.getPrice() != null && this.SaleLine.getContr() != null;
    }
    public BigDecimal getCurrentamount(){
        return this.currentamount;
    }
    public void FinalizeSale(){
        setClosed();
    }
}
