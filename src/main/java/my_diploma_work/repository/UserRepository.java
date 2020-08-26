package my_diploma_work.repository;


import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByEmail(String email);

    User findById(long id);

    List<User> findAllByRole(Role role);


    @Query(value = "update User set email = ?1 where id = ?2")
    String updateUserByEmail(String email, long id);

    @Query(value = "update User set telephone = ?1 where id = ?2")
    String updateUserByTelephone(String telephone, long id);

    @Query(value = "update User set firstName = ?1 where id = ?2")
    String updateUserByFirstName(String firstName, long id);

    @Query(value = "update User set lastName = ?1 where id = ?2")
    String updateUserByLastName(String lastName, long id);


    boolean existsUserById(long id);

    boolean existsByEmailAndTelephone(String email,String telephone);


    void deleteById(long id);



}
