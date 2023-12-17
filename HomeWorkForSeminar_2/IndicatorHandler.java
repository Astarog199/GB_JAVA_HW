package HomeWorkForSeminar_2;

public class IndicatorHandler {

    public void handle (Object object){
        if(object instanceof HasHealth hasHealth){
            handle(hasHealth);
        }
        if(object instanceof HasEnergy hasEnergy){
            handle(hasEnergy);
        }
    }
    public void handle(HasEnergy hasEnergy){
        System.out.println("Unit max health: " + hasEnergy.maxEnergy() + ", current health = " + hasEnergy.currentEnergy());
    }

    public void handle(HasHealth hasHealth){
        System.out.println("Bulding max health: " + hasHealth.maxHealth() + ", current health = " + hasHealth.currentHealth());
    }
}
