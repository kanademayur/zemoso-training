package lsp;

public class LiskovSubstitution {
    public static void main (String[] args) {
        //BankingWithdrawalService withdrawalService= new BankingWithdrawalService();
        CurrentAccount currentAccount= new CurrentAccount();
        SavingAccount savingAccount= new SavingAccount();
        BankingWithdrawalService withdrawalService= new SavingAccount();
        //CurrentAccount currentAccount= new BankingWithdrawalService();

        savingAccount.deposit();
        withdrawalService.withdraw();
        withdrawalService.deposit();
        currentAccount.online();

    }
}
