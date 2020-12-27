package shop.service.customer.validation;

import shop.exception.InvalidParametersException;
import java.util.Scanner;

import static shop.util.constants.Constants.*;



public class GeneralValidation {

    public static String id() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        try {
            InvalidParametersException.check(id.length() != 9, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_ID_PARAMETER);

        }

        return id;
    }

    public static String cardId() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        try {
            InvalidParametersException.check(id.length() != 6, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_CARD_ID_PARAMETER);

        }

        return id;
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

    public static double bonus() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        try {
            InvalidParametersException.check(price < 0, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_BONUS_PARAMETER);

        }

        return price;
    }




}
