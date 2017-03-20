/**
 * Created by forestnewark on 3/20/17.
 */
public class Validator {


    public static boolean validateAge(String str) throws Exception {
        double i;
        int x;
        try {
            i = Double.parseDouble(str);
            try {
                x = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Age must be an integer");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Age must be a number.");
            return false;
        }

        if (x > 115) {
            throw new Exception("You appear to be lying about your age.");

        }
        if (x < 18) {
            throw new Exception("You must be over 18.");
        }

        return true;

    }


}
