package isp;

public class InterfaceSegregation {
    public static void main (String[] args) {
        SavingAccount savingAccount= new SavingAccount();
        CurrentAccount currentAccount= new CurrentAccount();

        savingAccount.debitcard();
        savingAccount.netbanking();

        currentAccount.creditCard();
        currentAccount.debitcard();
        currentAccount.netbanking();

    }
}
