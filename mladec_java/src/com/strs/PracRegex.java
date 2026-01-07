package com.strs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PracRegex {

    // Custom Exceptions
    static class UsernameFormatException extends Exception {
        public UsernameFormatException(String msg) {
            super(msg);
        }
    }

    static class PasswordFormatException extends Exception {
        public PasswordFormatException(String msg) {
            super(msg);
        }
    }

    // Regex constants
    private static final String USERNAME_REGEX =
            "^(?=.{5,}$)[A-Za-z]+(\\s[A-Za-z]+)?$";

    private static final String PASSWORD_REGEX =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" +
            "(?=.*[!@#$%^&*()\\-+_])(?=\\S+$).{8,20}$";

    private static final Pattern USERNAME_PATTERN =
            Pattern.compile(USERNAME_REGEX);

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile(PASSWORD_REGEX);

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Username (min 5 chars, one or two words): ");
            String usernameInput = normalizeInput(scanner.nextLine());

            try {
                checkUsername(usernameInput);
                System.out.println("✔ Username accepted");
            } catch (UsernameFormatException e) {
                System.out.println("✖ Username invalid: " + e.getMessage());
                return;
            }

            System.out.print("Password (8–20 chars, strong, no spaces): ");
            String passwordInput = scanner.nextLine();

            try {
                checkPassword(passwordInput);
                System.out.println("✔ Password accepted");
            } catch (PasswordFormatException e) {
                System.out.println("✖ Password invalid: " + e.getMessage());
            }
        }
    }

    private static String normalizeInput(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    private static void checkUsername(String username)
            throws UsernameFormatException {

        if (!USERNAME_PATTERN.matcher(username).matches()) {
            throw new UsernameFormatException(
                "Only letters allowed. One or two words with a single space. " +
                "Minimum length: 5 characters."
            );
        }
    }

    private static void checkPassword(String password)
            throws PasswordFormatException {

        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new PasswordFormatException(
                "Must contain uppercase, lowercase, digit, special character, " +
                "no whitespace, and length between 8 and 20."
            );
        }
    }
}
