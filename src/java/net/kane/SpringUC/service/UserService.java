package net.kane.SpringUC.service;

import net.kane.SpringUC.model.User;

/**
 * Service class for {@link net.kane.SpringUC.model.User}
 * @author Eugene Kane
 * @version 1.0
 *
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);

}
