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
        if (contract.getAvailableSms() > 0 || contract.getRemainingBalance() >= contract.getCostPerSms()) {
            sentSms++;
            contract.useSms();
            System.out.println("SMS wysłany");
        } else {
            System.out.println("Nie udało się wysłać SMSa");
        }
    }

    public void sendMms() {
        if (contract.getAvailableMms() > 0 || contract.getRemainingBalance() >= contract.getCostPerMms()) {
            sentMms++;
            contract.useMms();
            System.out.println("MMS wysłany");
        } else {
            System.out.println("Nie udało się wysłać MMSa");
        }
    }

    public void call(int seconds) {
        double costPerMinute = contract.getCostPerMinute();
        double cost = seconds * costPerMinute / 60;
        if (contract.getAvailableMinutes() > 0 || contract.getRemainingBalance() >= cost) {
            callDuration += seconds;
            contract.useMinutes(cost);
            System.out.println("Rozmowa trwała " + seconds + " sekund");
        } else {
            contract.useMinutes(contract.getRemainingBalance());
            System.out.println("Brak środków na koncie lub brak dostępnych minut. Rozmowa przerwana.");
        }

    }

    public void printAccountState() {
        System.out.println("=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + sentSms);
        System.out.println("Wysłanych MMSów: " + sentMms);
        System.out.println("Liczba sekund rozmowy: " + callDuration);

        String contractType = contract.getContractType();
        if ("Na kartę".equals(contractType)) {
            System.out.printf("Na koncie zostało %.2f zł\n", ((CardPhoneContract) contract).getRemainingBalance());
        } else if ("Abonament".equals(contractType)) {
            System.out.printf("Abonament NO LIMIT - brak limitów. Abonament %.2f zł\n", ((AbonnementPhoneContract) contract).getMonthlyFee());
        } else if ("Mix".equals(contractType)) {
            MixPhoneContract mixContract = (MixPhoneContract) contract;
            System.out.println("Pozostałe SMSy: " + mixContract.getAvailableSms());
            System.out.println("Pozostałe MMSy: " + mixContract.getAvailableMms());
            System.out.println("Pozostałe minuty: " + mixContract.getAvailableMinutes());
            System.out.println("Stan konta: " + mixContract.getRemainingBalance() + " zł\n");
        }
    }
}
