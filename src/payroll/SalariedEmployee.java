package payroll;

public class SalariedEmployee extends Employee {

    private double weekSalary;

    public SalariedEmployee(String firstName, String secondName, String socialSecurityName, double weekSalary) {
        super(firstName, secondName, socialSecurityName);
        this.weekSalary = weekSalary;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
       if(weekSalary >= 0){
           this.weekSalary=weekSalary;
       }else{
           throw new IllegalArgumentException("Weekly salary must be >=0");
       }
    }

    @Override
    public double earnings() {
        return getWeekSalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weekSalary=" + weekSalary +
                '}';
    }

}
