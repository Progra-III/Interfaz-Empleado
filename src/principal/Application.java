package principal;
import interfaces.Payable;
import payroll.SalariedEmployee;
import payroll.HourlyEmployee;

public class Application {
    public static void main(String[] args) {
        Payable p;

        p= new HourlyEmployee("Juan", "Perez", "111", 5,100);
        Model.agregar(p);

        p= new Invoice("01234", "seat", 2, 375);
        Model.agregar(p);

        p= new SalariedEmployee("Pablo", "Marmol", "444", 400);
        Model.agregar(p);

        Listing l=new Listing(Model.payables);
        l.list();


    }
}
