import java.util.Scanner;

public class IfElse_Authorization {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "myPassword";

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Login:");

        String userLogin = input.next(); // Считываем строку до первого пробела

        if (userLogin.equals(login)){
            System.out.println("Please Enter Password:");
            String userPassword = input.next();

            if (userPassword.equals(password)){
                System.out.println("Hello, " + userLogin + " you entered successfully");
            } else {
                System.out.println("The password is incorrect");
            }

        } else {
            System.out.println("No user " + userLogin);
        }

    }
}
