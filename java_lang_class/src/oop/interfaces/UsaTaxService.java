package oop.interfaces;

public class UsaTaxService implements TaxService{

    @Override
    public double taxCalculator(double value) {
        if (value > 120){
            return value * 0.15;
        }
        return value * 0.1;
    }
}
