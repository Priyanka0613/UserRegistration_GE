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
        System.out.println("Enter email:");
        String emailname=s.nextLine();
        System.out.println("Enter phone number:");
        String phonenum=s.nextLine();
        System.out.println("Enter password:");
        String password=s.nextLine();

        //firstname
        String firstnamePattern= "^[A-Z]{1}[A-Za-z]{3,}$";
        Pattern firstpattern = Pattern.compile(firstnamePattern);
        Matcher firstnamematcher=firstpattern.matcher(firstname);
        System.out.println("name: "+firstname+" "+firstnamematcher.matches());

        //lastname
        String lastnamePattern= "^[A-Z]{1}[A-Za-z]{3,}$";
        Pattern lastpattern = Pattern.compile(lastnamePattern);
        Matcher lastnamematcher=lastpattern.matcher(lastname);
        System.out.println("last name: "+lastname+" "+lastnamematcher.matches());

        //email
        String emailPattern= "^[a-zA-Z0-9]+(\\.|\\_|\\-|\\+)?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.+[a-zA-Z]{1,}.[a-zA-Z]*$"; //abc.@gmail.com true
        Pattern emailpattern = Pattern.compile(emailPattern);
        Matcher emailmatcher=emailpattern.matcher(emailname);
        System.out.println("email name: "+emailname+" "+emailmatcher.matches());

        //phonenumber
        String phnPattern= "^[0-9]{2}\\s[1-9]{1}[0-9]{9}$";
        Pattern phnpattern = Pattern.compile(phnPattern);
        Matcher phnmatcher=phnpattern.matcher(phonenum);
        System.out.println("phone num: "+phonenum+" "+phnmatcher.matches());

        //password rule1
        String passPattern= "^[a-zA-Z0-9]{8,}$";
        Pattern passpattern = Pattern.compile(passPattern);
        Matcher passmatcher=passpattern.matcher(password);
        System.out.println("phone num: "+password+" "+passmatcher.matches());

        s.close();
    }
}
