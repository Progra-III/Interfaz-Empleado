package payroll;
import interfaces.Payable;

import java.util.Objects;

public abstract class Employee implements Payable {

    //-----ATTRIBUTES-----
    private String firstName;
    private String secondName;
    private String socialSecurityName;
    public abstract double earnings();

    //-----METHODS-----
    public double getPaymentAmount() { return earnings(); }

    public Employee(String firstName, String secondName, String socialSecurityName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityName = socialSecurityName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSocialSecurityName() {
        return socialSecurityName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSocialSecurityName(String socialSecurityName) {
        this.socialSecurityName = socialSecurityName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", socialSecurityName='" + socialSecurityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getSecondName(), employee.getSecondName()) && Objects.equals(getSocialSecurityName(), employee.getSocialSecurityName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName(), getSocialSecurityName());
    }
}
