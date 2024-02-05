package pl.javastart.task;

public class Phone {
    private int sentSms;
    private int sentMms;
    private int callDuration;
    private PhoneContract contract;

    public Phone(PhoneContract contract) {
        this.contract = contract;
    }

    public void sendSms() {
        if (contract.getRemainingBalance() >= contract.getCostPerSms()) {
            sentSms++;
            contract.deductBalance(contract.getCostPerSms());
            System.out.println("SMS wysłany");
        } else {
            System.out.println("Nie udało się wysłać SMSa");
        }
    }

    public void sendMms() {
        if (contract.getRemainingBalance() >= contract.getCostPerMms()) {
            sentMms++;
            contract.deductBalance(contract.getCostPerMms());
            System.out.println("MMS wysłany");
        } else {
            System.out.println("Nie udało się wysłać MMSa");
        }
    }

    public void call(int seconds) {
        double cost = seconds * contract.getCostPerMinute() / 60;
        if (contract.getRemainingBalance() >= cost) {
            callDuration += seconds;
            contract.deductBalance(cost);
            System.out.println("Rozmowa trwała " + seconds + " sekund");
        } else {
            System.out.println("Brak środków na koncie. Rozmowa przerwana.");
        }
    }

    public void printAccountState() {
        System.out.println("=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + sentSms);
        System.out.println("Wysłanych MMSów: " + sentMms);
        System.out.println("Liczba sekund rozmowy: " + callDuration);
        System.out.printf("Na koncie zostało %.2f zł\n", contract.getRemainingBalance());
    }
}
