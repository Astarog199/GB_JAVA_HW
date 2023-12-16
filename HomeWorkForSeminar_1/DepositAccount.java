package HomeWorkForSeminar_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account {
    private long monthBetweenTodayAndNow;

    public DepositAccount(LocalDate OpeningDate, long monthBetweenTodayAndNow, double amount) {
        super(OpeningDate, amount);
        this.monthBetweenTodayAndNow = monthBetweenTodayAndNow;
    }

    public DepositAccount(LocalDate OpeningDate, long monthBetweenTodayAndNow) {
        this(OpeningDate, monthBetweenTodayAndNow, 0);
    }

    @Override
    public void takeAmount(double sum) {
        if (monthBetweenTodayAndNow>1) {
            super.takeAmount(sum);
        } else {
            System.out.println("Приходите через месяц");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
