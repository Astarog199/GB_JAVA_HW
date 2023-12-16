package HomeWorkForSeminar_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class main {

    /**
     * Необходимо создать класс Account, описывающий банковский счет.
     * Он должен иметь 3 метода: пополнение(putAmount) и снятие(takeAmount) средств и отображение(getAmount) текущего баланса (геттер).
     * Первые два меняют баланс, последний просто возвращает его.
     * <p>
     * Далее, необходимо создать наследника - CreditAccount, описывающий кредитный счет.
     * Снятие средств с этого кредитного счета облагается комиссией в размере 1% от суммы снятия.
     * <p>
     * Далее, необходимо создать наследника - DepositAccount, описывающий депозитный счет.
     * Его особенность в том, что нельзя снимать средства в течение 1 месяца после пополнения.
     */

    public static void main(String[] args) {

        LocalDate today = LocalDate.of(2022, 12, 10);
        LocalDate now = LocalDate.now();
        long monthBetweenTodayAndNow = ChronoUnit.MONTHS.between(today, now); // количество месяцев между today и now


        Account account = new Account(today);
        account.putAmount(10000);
        account.takeAmount(1500);
        System.out.println(account);

        System.out.println();

        CreditAccount creditAccount= new CreditAccount(today);
        creditAccount.takeAmount(1500);
        System.out.println(creditAccount);

        System.out.println();

        DepositAccount depositAccount = new DepositAccount(today, monthBetweenTodayAndNow);
        depositAccount.putAmount(10000);
        depositAccount.takeAmount(1500);
        System.out.println(depositAccount);



        // Пример, как получить текущую дату
//        LocalDate today = LocalDate.now();

//        System.out.println(today);
//        System.out.println(now);

        // Проверка, что между today и now прошло больше 1 месяца:
//        long monthBetweenTodayAndNow = ChronoUnit.MONTHS.between(today, now); // количество месяцев между today и now
//        System.out.println(monthBetweenTodayAndNow);
    }
}
