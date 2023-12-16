package HomeWorkForSeminar_1;

import java.time.LocalDate;

public class Account {

    private final LocalDate OpeningDate;
    private double amount;
    double sum;



    public Account(LocalDate OpeningDate){
        this (OpeningDate, 0);
    }

    public Account(LocalDate OpeningDate, double sum){
        this.OpeningDate = OpeningDate;
        putAmount(sum);

    }


    /**
     * Метод возвращает объём средств на счёте
     * @return кол-во средств
     */
    public double getAmount(){
        return amount;
    }

    /**
     * Метод пополнения счёта
     */
    public void putAmount(double sum) {
        if(sum>=0.0){
            this.amount += sum;
        }else {
            System.out.println("ошибка");
        }
    }

    /**
     * Метод снятия счёта
     */
    public void takeAmount(double sum){
        if(amount > sum) {
            this.amount -= sum;
        }else{
            System.out.println("Error: на вашем счёте недостаточно средств");
        }
    }

    @Override
    public String toString() {
        return String.format("дата открытия счёта: %s\nколичество средств на счёте %s",OpeningDate, getAmount());
    }
}
