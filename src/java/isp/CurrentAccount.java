package isp;

public class CurrentAccount implements Creditcard,Debitcard,Netbanking{
    @Override
    public void creditCard() {
        System.out.println("Current Account Credit Card");
    }

    @Override
    public void debitcard() {
        System.out.println("Current Account Debit Card");
    }

    @Override
    public void netbanking() {
        System.out.println("Current account Netbanking");
    }
}
