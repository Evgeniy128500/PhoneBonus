public class PhoneBonus {
    public static void main(String[] args) {
        int balance = 100; // начальный счет
        int replenishment = 1100; // сумма пополнения
        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int amount = replenishment + balance + bonus; // сумма в конце
        System.out.println("сумма пополнения" + amount);
    }
}