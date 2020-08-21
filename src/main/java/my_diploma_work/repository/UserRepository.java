package my_diploma_work.repository;


import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByEmail(String email);

    User findById(long id);

    List<User> findAllByRole(Role role);

    List<User> findAll();

    @Query(value = "update User set email = ?1 where id = ?2")
    String updateUserByLogin(String login, long id);

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

    boolean existsUserByEmail(String email);
//
    void deleteById(long id);




}
