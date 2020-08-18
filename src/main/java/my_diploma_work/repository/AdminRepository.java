package my_diploma_work.repository;

import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AdminRepository extends JpaRepository<User, Role> {

}
