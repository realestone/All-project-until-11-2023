package uzduotis;

import java.io.IOException;

public class EmployeeSenior extends Employee{

    @Override
    public void generateProductList() throws IOException {
        super.getProductsList(1);
        System.out.println("Jus aptarnauja vyr.vadybininkas");
    }
}
