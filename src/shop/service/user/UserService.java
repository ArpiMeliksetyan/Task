package shop.service.user;

import shop.exception.AccessDeniedException;
import shop.exception.InvalidParametersException;
import shop.model.user.User;

import java.io.IOException;

public interface UserService {

    User createUser() throws InvalidParametersException;

    boolean login(String username, String password) throws IOException, AccessDeniedException;

    boolean checkingDuplicateUsername(String username) throws IOException;

    User[] read(String path) throws IOException;

    void printInfo(User user);

    void write(User user) throws IOException;
}
