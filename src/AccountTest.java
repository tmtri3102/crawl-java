public class AccountTest {
    private static final String[] validAcc = {"123abc_", "_abc123", "______", "123456", "abcdefgh"};

    private static final String[] invalidAcc = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample example = new AccountExample();
        for (String acc : validAcc) {
            boolean isValid = example.validateAccount(acc);
            System.out.println("Account is " + acc + " isValid = " + isValid);
        }
        for (String acc : invalidAcc) {
            boolean isValid = example.validateAccount(acc);
            System.out.println("Account is " + acc + " isValid = " + isValid);
        }
    }
}
