package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        //Phone phone1 = new Phone(new CardPhoneContract(10.00, .5, 1, 0.5));
        //phone1.call(60);
        //phone1.printAccountState();
        //phone1.sendSms();
        //phone1.printAccountState();
        //phone1.call(100);
        //phone1.printAccountState();
        //System.out.println("_".repeat(30));
        //Phone phone2 = new Phone(new AbonnementPhoneContract(50));
        //phone2.printAccountState();
        //phone2.call(6000);
        //phone2.sendSms();
        //phone2.sendMms();
        //phone2.printAccountState();
        System.out.println("_".repeat(30));
        Phone phone3 = new Phone(new MixPhoneContract(50, 100, 50, 120, 0.02, 0.5, 0.3));
        phone3.printAccountState();
        phone3.sendMms();
        phone3.printAccountState();
        phone3.sendSms();
        phone3.call(600);
        phone3.printAccountState();
    }
}
