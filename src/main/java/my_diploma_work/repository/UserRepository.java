package my_diploma_work.repository;


import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long > {

    User getByLogin(String login);

    User getById(long id);

    List<User> getAllByRole(Role role);

    List<User> getAllByBirthDate(String birthDate);

    List<User> getAll();

    User updateUser(User user, long id);

    User updateUserByLogin(String login, long id);

    String updateUserByPassword(String password, long id);

    String updateUserByName(String name, long id);

    String updateUserByEmail(String email, long id);

    String updateUserByTelephone(String telephone, long id);

    String updateUserByBirthDate(String birthDate, long id);

    User checkUser(String login,String password);

    void remove(long id);

    void remove(User user);

}
