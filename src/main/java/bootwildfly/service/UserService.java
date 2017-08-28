package bootwildfly.service;

/**
 * Created by simonjohansson on 2017-08-28.
 */
import java.util.List;

import bootwildfly.model.User;

public interface UserService {

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    boolean isUserExist(User user);

}
