package pl.javastart.task;

class MixPhoneContract implements PhoneContract {
    private double balance;
    private int availableSms;
    private int availableMms;
    private int availableMinutes;
    private double costPerSms;
    private double costPerMms;
    private double costPerMinute;

    public MixPhoneContract(double balance, int availableSms, int availableMms, int availableMinutes,
                            double costPerSms, double costPerMms, double costPerMinute) {
        this.balance = balance;
        this.availableSms = availableSms;
        this.availableMms = availableMms;
        this.availableMinutes = availableMinutes;
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
        return availableSms;
    }

    @Override
    public int getAvailableMms() {
        return availableMms;
    }

    @Override
    public int getAvailableMinutes() {
        return availableMinutes;
    }

    @Override
    public void useSms() {
        if (availableSms > 0) {
            availableSms--;
        } else {
            balance -= costPerSms;
        }
    }

    @Override
    public void useMms() {
        if (availableMms > 0) {
            availableMms--;
        } else {
            balance -= costPerMms;
        }
    }

    @Override
    public void useMinutes(double cost) {
        if (availableMinutes > 0) {
            availableMinutes -= cost;
        } else {
            balance -= cost;
        }
    }

    @Override
    public String getContractType() {
        return "Mix";
    }
}
