package entities;

public class JuridicalPerson extends  Person {

    private int numberOfEmployee;


    public JuridicalPerson(String name, Double anualIncome, int numberOfEmployee) {
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfImployee) {
        numberOfEmployee = numberOfImployee;
    }

    @Override
    public final double totalTax() {
        if(numberOfEmployee <= 10) {
            return anualIncome * 0.16;
        } else {
            return anualIncome * 0.14;
        }
    }

}
