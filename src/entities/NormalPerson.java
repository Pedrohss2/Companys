package entities;

public class NormalPerson extends Person {

    private Double healthExpenditures;

    public NormalPerson(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double totalTax() {
        if(anualIncome < 20000.0) {
            return (getAnualIncome() * 0.15) - (healthExpenditures * 0.50 );
        }
        else {
            return (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
        }
    }

}
