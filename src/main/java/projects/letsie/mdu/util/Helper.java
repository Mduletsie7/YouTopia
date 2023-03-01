package projects.letsie.mdu.util;


import org.apache.commons.validator.routines.EmailValidator;

import java.util.Random;
import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String generateAccountNumber() {
        Random rand = new Random();
        String card = "YT";
        String accountNumber = null;
        for (int i = 0; i < 8; i++) {
            int n = rand.nextInt(10) + 0;
            accountNumber = card+= Integer.toString(n);
        }
        for (int i = 0; i < 16; i++) {
            if (i % 4 == 0)
                System.out.print(" ");
        }
        return accountNumber;
    }

    public static String generateAccountPin() {
        Random rand = new Random();
        String accountPin = "";
        for (int i = 0; i < 4; i++) {
            int n = rand.nextInt(10) + 0;
            accountPin = accountPin+= Integer.toString(n);
        }
        for (int i = 0; i < 16; i++) {
            if (i % 4 == 0)
                System.out.print(" ");
        }

        // WILL HAVE TO HASH OUT THE OTHER PINS TO PROTECT PRIVACY OF USERS??
        return accountPin;
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static Boolean isValidEmail(String email) {
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(email);
    }
}
