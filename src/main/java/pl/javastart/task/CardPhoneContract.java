package pl.javastart.task;

public class CardPhoneContract extends PhoneContract {
    private double balance;
    private double costPerSms;
    private double costPerMms;
    private double costPerMinute;

    public CardPhoneContract(double balance, double costPerSms, double costPerMms, double costPerMinute) {
        this.balance = balance;
        this.costPerSms = costPerSms;
        this.costPerMms = costPerMms;
        this.costPerMinute = costPerMinute;
    }

    @Override
    double getRemainingBalance() {
        return balance;
    }

    @Override
    double getCostPerSms() {
        return costPerSms;
    }

    @Override
    double getCostPerMms() {
        return costPerMms;
    }

    @Override
    double getCostPerMinute() {
        return costPerMinute;
    }

    void deductBalance(double amount) {
        balance -= amount;
    }

}
