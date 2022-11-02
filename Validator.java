import java.util.regex.Pattern;

public class Validator<T> {
    
    private final Pattern pattern;

    public Validator(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public boolean isValid(String value) {
        return pattern.matcher(value).matches();
    }
}
