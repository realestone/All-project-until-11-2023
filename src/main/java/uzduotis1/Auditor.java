package uzduotis1;

public class Auditor {

    boolean isTotalLoanCorrect(){
        Banker banker = new Banker();
        return (banker.calcuteTotalLoan(10) == 0) && (banker.calcuteTotalLoan(1000) == 1050);
    }

}
