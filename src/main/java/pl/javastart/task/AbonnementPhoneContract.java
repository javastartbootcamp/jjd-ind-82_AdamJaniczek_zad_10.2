package pl.javastart.task;

class AbonnementPhoneContract implements PhoneContract {
    private double monthlyFee;
    private int availableSms;
    private int availableMms;
    private int availableMinutes;

    public AbonnementPhoneContract(double monthlyFee) {
        this.monthlyFee = monthlyFee;
        this.availableSms = Integer.MAX_VALUE;
        this.availableMms = Integer.MAX_VALUE;
        this.availableMinutes = Integer.MAX_VALUE;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    @Override
    public double getRemainingBalance() {
        return Double.MAX_VALUE;
    }

    @Override
    public double getCostPerSms() {
        return 0;
    }

    @Override
    public double getCostPerMms() {
        return 0;
    }

    @Override
    public double getCostPerMinute() {
        return 0;
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
        // NO LIMIT
    }

    @Override
    public void useMms() {
        // NO LIMIT
    }

    @Override
    public void useMinutes(double cost) {
        //
    }

    @Override
    public String getContractType() {
        return "Abonament";
    }
}
