package ex005_HomeWorkForSeminar_1;

import java.time.LocalDate;

public class CreditAccount extends Account{

    private double percent;

public CreditAccount(LocalDate OpeningDate, double amount, double percent){
    super(OpeningDate, amount);
    this.percent=percent;
}

public CreditAccount(LocalDate OpeningDate){

    this(OpeningDate ,10000, 1);
}

    @Override
    public void takeAmount(double sum) {
        double creditSum = sum+(sum * (percent/100));
        super.takeAmount(creditSum);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
