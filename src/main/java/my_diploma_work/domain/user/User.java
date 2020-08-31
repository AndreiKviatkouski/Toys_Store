package my_diploma_work.domain.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String telephone;

    @Enumerated(value = EnumType.STRING)
    private Role role = Role.USER;

    public User(String firstName, String lastName, String password, String email, String telephone, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.role = role;
    }

    public User(long id,String firstName, String lastName, String password, String email, String telephone) {
       this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
    }

    public User() {
    }
}
