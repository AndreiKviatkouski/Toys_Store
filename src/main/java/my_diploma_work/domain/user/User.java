package my_diploma_work.domain.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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

    public User(Role role) {
        this.role = role;
    }

    public User(String firstName, String lastName, String password, String email, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
    }
}
