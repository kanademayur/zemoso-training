package srp;

public class AccountService {
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();
    public void openAccount() {
        //1.
        System.out.println("fill account details");
        //2.
        //System.out.println("store account object in database");
        //3.
        //System.out.println("send out welcome message");
        repository.create();

        notificationService.sendNotification();
    }
}
