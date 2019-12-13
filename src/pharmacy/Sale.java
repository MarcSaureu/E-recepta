package pharmacy;

import data.PatientContr;
import data.ProductID;

import java.math.BigDecimal;
import java.util.Date;

public class Sale {
    private int saleCode;
    private Date date;
    private BigDecimal amount;
    private boolean isClosed;

    public Sale(int sale, Date dat, BigDecimal big){
        this.saleCode = sale;
        this.date = dat;
        this.amount = big;
    }
    public void addLine(ProductID prodID, BigDecimal price, PatientContr contr) throws SaleClosedException{

    }
    private void calculateAmount(){

    }
    private void addTaxes() throws SaleClosedException{
        BigDecimal amount = this.amount;
        amount.multiply(new BigDecimal(0.21));
        this.amount.add(amount);
    }
    public void CalculateFinalAmount() throws SaleClosedException{

    }
    public BigDecimal getAmount(){
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
}
