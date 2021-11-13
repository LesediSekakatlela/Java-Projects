package Lesedi;

public class Main {

    public static void main(String[] args) {
        ITelephone leesPhone;
        leesPhone = new DeskPhone(123456);
        leesPhone.powerOn();
        leesPhone.callPhone(123456);
        leesPhone.answer();

        leesPhone = new MobilePhone(24565);
        leesPhone.powerOn();
        leesPhone.callPhone(24565);
        leesPhone.answer();
    }
}
