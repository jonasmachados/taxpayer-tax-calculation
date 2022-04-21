package entities;

public abstract class Taxpayer {

    private String name;
    private Double annualIncome;

    //CONSTRUCTOR
    public Taxpayer() {
    }

    //CONSTRUCTOR
    public Taxpayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }
    
    public abstract String showTax();
    
    public abstract double calcTax();

    //GET AND SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    

}
