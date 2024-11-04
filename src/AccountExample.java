import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private final String CRTERIA = "^[_a-z0-9]{6,}$";
    public AccountExample() {}
    public boolean validateAccount(String account) {
        Pattern pattern = Pattern.compile(CRTERIA);
        Matcher  matcher = pattern.matcher(CRTERIA);
        return matcher.matches();
    }
}
