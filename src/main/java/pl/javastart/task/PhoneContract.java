package pl.javastart.task;

abstract class PhoneContract {
    abstract double getRemainingBalance();

    abstract double getCostPerSms();

    abstract double getCostPerMms();

    abstract double getCostPerMinute();

    abstract void deductBalance(double amount);
}
