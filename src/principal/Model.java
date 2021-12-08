package principal;
import interfaces.Payable;

import java.util.ArrayList;
import java.util.List;

public class Model {
    public static List<Payable> payables= new ArrayList<>();

    public static void agregar(Payable p){
        payables.add(p);
    }

}
