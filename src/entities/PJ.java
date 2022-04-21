package entities;

public class PJ extends Taxpayer {

    private Integer numberEmployees;

    //CONSTRUCTOR
    public PJ() {
        super();
    }

    //CONSTRUCTOR
    public PJ(Integer numberEmployees, String name, Double annualIncome) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public String showTax() {
        return "" 
                + getName()
                + ": $ "
                + calcTax();
    }

    double totalTax = 0;

    @Override
    public double calcTax() {
        if (numberEmployees > 10) {
            totalTax = getAnnualIncome() * 0.14;
        }else{
            totalTax = getAnnualIncome() * 0.14;
        }
        return totalTax;
    }

    //GET AND SET
    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

}
