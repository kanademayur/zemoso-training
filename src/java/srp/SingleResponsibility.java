package srp;

public class SingleResponsibility {
    public static void main (String[] args) {
        AccountService service=new AccountService();
        service.openAccount();
    }
}
