package shop.service.user.menu;

import shop.exception.AccessDeniedException;
import shop.exception.InvalidParametersException;
import shop.model.user.User;
import shop.service.user.implementation.UserServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class UserMenu {

    public static boolean userMenu() {
        System.out.println("Welcome in SHOP PROGRAM dear user \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. If you don't have account please sign up");
        System.out.println("2. If you already have account please enter your username and password");
        System.out.println("3. If you want to exit from SHOP PROGRAM press 0");


        Scanner scanner = new Scanner(System.in);
        UserServiceImpl userService = new UserServiceImpl();

        boolean t = true;
        boolean isLogin = false;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    try {
                        User user = userService.createUser();
                        userService.write(user);
                        isLogin = true;
                        System.out.println("You are successfully signed up");
                        System.out.println();
                    } catch (InvalidParametersException | IOException e) {
                        e.printStackTrace();
                    }
                    t = false;
                    break;

                case 2:
                    try {
                        System.out.println("Please enter your username");
                        String username = scanner.next();
                        scanner.nextLine();
                        System.out.println("Please enter your password");
                        String password = scanner.nextLine();
                        isLogin = userService.login(username, password);
                        System.out.println(username + " you successfully logged in program \n");
                    } catch (AccessDeniedException | IOException e) {
                        e.printStackTrace();
                    }
                    t = false;
                    break;

                case 0:
                    System.out.println("You are exiting from SHOP PROGRAM \n");

                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }

        }
        return isLogin;
    }
}
