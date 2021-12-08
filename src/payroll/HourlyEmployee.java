package payroll;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;


    public HourlyEmployee(String firstName, String secondName, String socialSecurityName, double wage, double hours) {
        super(firstName, secondName, socialSecurityName);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earnings() {
       if(getHours() <=40){
           return getWage()+getHours();
       }else{
           return 40 * getWage() + (getHours()-40) *getWage() * 1.5;
       }
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
