package my_diploma_work.repository;

import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User getByLogin(String login);

    User getById(long id);

    User getAllByAddress(String address);

    User getAllByRoll(Role role);

    List<User> getAllByBirthDat(String birthDate);

    List<User> getAll();

    User updateUser(User user, int id);

    String updateUserByLogin(String login, int id);

    String updateUserByPassword(String password, int id);

    String updateUserByName(String name, int id);

    String updateUserByEmail(String email, int id);

    String updateUserByTelephone(String telephone, int id);

    String updateUserByBirthDate(String birthDate, int id);

    User checkUser(String login,String password);

    void remove(int id);

    void remove(User user);

}
