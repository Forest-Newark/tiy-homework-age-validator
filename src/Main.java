import java.util.Scanner;

/**
 * Created by forestnewark on 3/20/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Please enter your age: ");

            if (Validator.validateAge(sc.next())) {
                System.out.println("Age Accepted");
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Terminating Program");
        }


    }
}
