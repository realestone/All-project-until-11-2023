package uzduotis;

import practice.Word;

import java.io.IOException;
import java.util.Collections;


public class EmployeeJunior extends Employee{

    @Override
    public void generateProductList() throws IOException {
        super.getProductsList(0);
        System.out.println("Jus aptarnauja jaunesnysis vadybininkas");
    }
}
