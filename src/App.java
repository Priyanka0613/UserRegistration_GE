import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstname=s.nextLine();
        System.out.println("Enter last name:");
        String lastname=s.nextLine();

        //firstname
        String firstnamePattern= "^[A-Z]{1}[A-Za-z]{3,}";
        Pattern firstpattern = Pattern.compile(firstnamePattern);
        Matcher firstnamematcher=firstpattern.matcher(firstname);
        System.out.println(firstnamematcher.matches());

        //lastname
        String lastnamePattern= "^[A-Z]{1}[A-Za-z]{3,}";
        Pattern lastpattern = Pattern.compile(lastnamePattern);
        Matcher lastnamematcher=lastpattern.matcher(lastname);
        System.out.println(lastnamematcher.matches());

        s.close();
    }
}
