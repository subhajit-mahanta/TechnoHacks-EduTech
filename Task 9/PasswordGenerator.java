import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        int length = 12;

        String password = generateRandomPassword(length);
        System.out.println("Generated Password: " + password);
    }

    public static String generateRandomPassword(int length) {
        String characters = CHAR_UPPER + CHAR_LOWER + DIGITS + SPECIAL_CHARS;
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
