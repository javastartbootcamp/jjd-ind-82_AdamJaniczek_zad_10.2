package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(new CardPhoneContract(10.0, 0.1, 0.2, 0.5));
        phone.call(60);
        phone.printAccountState();
    }
}
