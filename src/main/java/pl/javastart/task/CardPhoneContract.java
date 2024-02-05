package pl.javastart.task;

class CardPhoneContract implements PhoneContract {
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
    public double getRemainingBalance() {
        return balance;
    }

    @Override
    public double getCostPerSms() {
        return costPerSms;
    }

    @Override
    public double getCostPerMms() {
        return costPerMms;
    }

    @Override
    public double getCostPerMinute() {
        return costPerMinute;
    }

    @Override
    public int getAvailableSms() {
        return 0;
    }

    @Override
    public int getAvailableMms() {
        return 0;
    }

    @Override
    public int getAvailableMinutes() {
        return 0;
    }

    @Override
    public void useSms() {
        balance -= costPerSms;
    }

    @Override
    public void useMms() {
        balance -= costPerMms;
    }

    @Override
    public void useMinutes(double cost) {
        balance -= cost;
    }

    @Override
    public String getContractType() {
        return "Na kartę";
    }

}
