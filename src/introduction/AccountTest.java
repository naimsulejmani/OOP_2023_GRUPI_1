package introduction;

public class AccountTest {
    public static void main(String[] args) {
        Account edisoniAccounts = new Account();
        edisoniAccounts.name = "Edisoni";
        edisoniAccounts.setPassword("123456");
        edisoniAccounts.setBalance(5_000_000);

        edisoniAccounts.name = "Naimit";

    }
}
