package uzduotis1;

public class Banker {

    double calcuteTotalLoan(double loan){
        return loan >= 1000 ? loan * 1.05 : 0;
    }

}
