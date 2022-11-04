package isp;

public class SavingAccount implements Debitcard,Netbanking {

    @Override
    public void debitcard() {
        System.out.println("Saving Account Debit Card");
    }

    @Override
    public void netbanking() {
        System.out.println("Saving Account Netbanking");

    }
}
