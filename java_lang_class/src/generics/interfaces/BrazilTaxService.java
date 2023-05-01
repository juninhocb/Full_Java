package generics.interfaces;

public class BrazilTaxService implements TaxService{
    @Override
    public double taxCalculator(double value) {
        System.out.println("This is myString: " + myString);
        if (value >= 100.00){
            return value * 0.2;
        }
        return value * 0.15;
    }
}
