package shop.service.user.validation;

import shop.exception.DuplicateDataException;
import shop.exception.InvalidParametersException;
import shop.service.user.implementation.UserServiceImpl;
import shop.util.md5Encoder.Md5;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.*;

public class UserValidation {

    static UserServiceImpl userService = new UserServiceImpl();

    public static String fullName() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();

        try {
            InvalidParametersException.check(!(fullName.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+$")), INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_FULLNAME_PARAMETER);

        }

        return fullName;
    }

    public static String email() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        try {
            InvalidParametersException.check(!(email.matches("^(.+)@(.+)$")), INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_EMAIL_PARAMETER);

        }
        return email;
    }

    public static String password() throws InvalidParametersException {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        try {
            InvalidParametersException.check(!(password.matches("^.*(?=.{9,})(?=(.*[^A-Z]){2})(?=(.*\\d){3}).+")), INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_PASSWORD_PARAMETER);

        }
        return Md5.MD5(password);
    }

    public static String username() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        try {
            InvalidParametersException.check(username.length() < 10, INVALID_PARAMETER);
            DuplicateDataException.check(userService.checkingDuplicateUsername(username), INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_USERNAME_PARAMETER);
        } catch (DuplicateDataException e) {
            e.printStackTrace();
            throw new InvalidParametersException(DUPLICATE_PARAMETER);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return username;

    }
}
