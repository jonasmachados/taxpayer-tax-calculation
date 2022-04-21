package entities;

public class PF extends Taxpayer {

    private Double healthExpenses;

    //COSNTRUCTOR
    public PF() {
        super();
    }

    //COSNTRUCTOR
    public PF(Double healthExpenses, String name, Double annualIncome) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    @Override
    public String showTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    double totalTax = 0;
    @Override
    public double calcTax() {

        if (getAnnualIncome() < 20000) {
            if (healthExpenses == 0) {
                totalTax = getAnnualIncome() * 0.15;
            }
            if (healthExpenses > 0) {
                totalTax = (getAnnualIncome() * 0.15) - (healthExpenses * 0.5);

            }
        }
        if (getAnnualIncome() > 20000) {
            if (healthExpenses == 0) {
                totalTax = getAnnualIncome() * 0.15;
            }
            if (healthExpenses > 0) {
                totalTax = (getAnnualIncome() * 0.15) - (healthExpenses * 0.5);

            }
        }
        return totalTax;
    }

    //GET AND SET
    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }
    
    

}
