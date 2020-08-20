package my_diploma_work.domain.toys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Format format;
    private StatusToy statusToy;
    private Estimation estimation;
    private String manufacturer;
    private BigDecimal price;
    @OneToMany
    private List<Review> review;

    private String description;

    public Toy(Format format) {
        this.format = format;
    }

    public Toy(StatusToy statusToy) {
        this.statusToy = statusToy;
    }

    public Toy(Estimation estimation) {
        this.estimation = estimation;
    }
}

