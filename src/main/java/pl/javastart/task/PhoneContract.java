package pl.javastart.task;

interface PhoneContract {
    double getRemainingBalance();

    double getCostPerSms();

    double getCostPerMms();

    double getCostPerMinute();

    int getAvailableSms();

    int getAvailableMms();

    int getAvailableMinutes();

    void useSms();

    void useMms();

    void useMinutes(double cost);

    String getContractType();
}
