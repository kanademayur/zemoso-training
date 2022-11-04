package lsp;

public class NotObeyLsp {


    public static void main (String[] args) {
        CurrentAccount currentAccount= new CurrentAccount();
        SavingAccount savingAccount= new SavingAccount();
        BankingWithdrawalService withdrawalService= new CurrentAccount();
        //CurrentAccount currentAccount= new BankingWithdrawalService();

        savingAccount.deposit();
        withdrawalService.withdraw();
        withdrawalService.deposit();
        currentAccount.online();


    }

}
