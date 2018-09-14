package p2;

public class Hrivna extends Money {
    
    public Hrivna (double amount) {
        super (amount);
    }
    
    @Override
    public String getCurrencyName() {
        return "HRN";
    }
    
    
}