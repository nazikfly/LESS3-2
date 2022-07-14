public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Вы не можете снять, так как запращивамая сумма больше чем ваш чек", amount);
        } else {
            amount -= sum;
        }
    }
}
