package my_diploma_work.repository;


import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByLogin(String login);

    User findById(long id);

    List<User> findAllByRole(Role role);

    List<User> findAllByBirthDate(String birthDate);

    List<User> findAll();


//    User use(String login, long id);
//
//    String updateUserByPassword(String password, long id);
//
//    String updateUserByName(String name, long id);
//
//    String updateUserByEmail(String email, long id);
//
//    String updateUserByTelephone(String telephone, long id);
//
//    String updateUserByBirthDate(String birthDate, long id);
//
//    User checkUser(String login,String password);
//
    void deleteById(long id);



}
