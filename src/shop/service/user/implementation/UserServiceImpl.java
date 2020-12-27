package shop.service.user.implementation;

import shop.exception.AccessDeniedException;
import shop.exception.InvalidParametersException;
import shop.model.user.User;
import shop.service.user.UserService;
import shop.service.user.validation.UserValidation;
import shop.util.md5Encoder.Md5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static shop.util.constants.Constants.*;


public class UserServiceImpl implements UserService {

    public User createUser() throws InvalidParametersException {

        System.out.println("Please enter your fullName");
        String fullName = UserValidation.fullName();

        System.out.println("Please enter your username");
        String username = UserValidation.username();

        System.out.println("Please enter your email");
        String email = UserValidation.email();

        System.out.println("Please enter your password");
        String password = UserValidation.password();

        return new User(fullName, username, email, password);

    }

    public boolean login(String username, String password) throws IOException, AccessDeniedException {

        boolean isUser = false;
        User[] users = read(DATABASE_FILE_PATH);
        Map<String, String> map = new HashMap<>();

        for (User user : users) {
            map.put(user.getUsername(), user.getPassword());
        }

        try {
            AccessDeniedException.check(map.get(username) == null, INVALID_PARAMETER);
        } catch (AccessDeniedException e) {
            e.printStackTrace();
            throw new AccessDeniedException(INVALID_LOGIN_PARAMETER);
        }

        if (map.get(username).equals(Md5.MD5(password))) {
            isUser = true;
        }
        return isUser;
    }

    public boolean checkingDuplicateUsername(String username) throws IOException {

        User[] users = read(DATABASE_FILE_PATH);
        Map<String, User> map = new HashMap<>();
        boolean isDuplicate = false;

        for (User user : users) {
            map.put(user.getUsername(), user);
        }

        if (map.keySet().contains(username)) {
            isDuplicate = true;
        }
        return isDuplicate;
    }

    public User[] read(String path) throws IOException {
        String[] data = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        User[] users = new User[data.length];

        for (int i = 0; i < data.length; i++) {

            String[] s = data[i].split(",");

            users[i] = new User(s[0], s[1], s[2], s[3]);

        }
        return users;

    }

    private String infoUser(User user) {

        return
                user.getFullName() + "," +
                        user.getUsername() + "," +
                        user.getEmail() + "," +
                        user.getPassword();

    }


    public void printInfo(User user) {

        System.out.println(
                "fullName= " + user.getFullName() +
                        ", username= " + user.getUsername() +
                        ", email= " + user.getEmail() +
                        ", password= " + user.getPassword());

    }



    public void write(User user) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter path name");
        String path = scanner.nextLine();
        String s = infoUser(user) + "\n";
        FileWriter myWriter = new FileWriter(path);
        myWriter.write(s);
        myWriter.close();

    }

}
