import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter first name:");
        String name=s.nextLine();

        String namePattern= "^[A-Z]{1}[A-Za-z]{3,}";
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher=pattern.matcher(name);
        System.out.println(matcher.matches());
        s.close();
    }
}
