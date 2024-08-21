package currencycal;

import java.text.DecimalFormat;

public class Converter{
    
    double amount;
    double exchnageAmount;
    DecimalFormat df = new DecimalFormat(".00");
    
    public Converter (){
        amount = 0;
        exchnageAmount = 0;
    }
    
    public Converter (double a, double b){
        amount = a;
        exchnageAmount = b;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public double getExchnageAmount(){
        return exchnageAmount;
    }
    
    public void setAmount(double a){
        amount = a;
    }
    
    public void setExchnageAmount(double e){
        exchnageAmount = e;
    }
    
    public double Convert(){
        double finalAmount = amount * exchnageAmount;
        return finalAmount;
    }
    
    public String toString(){
        double finalAmount = amount * exchnageAmount;
        return df.format(amount) + " USD is " + df.format(finalAmount);
    }
    

   
}// end of Converter Class
