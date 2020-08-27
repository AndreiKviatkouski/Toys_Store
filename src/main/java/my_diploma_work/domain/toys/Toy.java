package my_diploma_work.domain.toys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
@Entity
@Data
@AllArgsConstructor

public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @Enumerated(value = EnumType.STRING)
    private Format format;
    @Enumerated(value = EnumType.STRING)
    private StatusToy statusToy;
    @Enumerated(value = EnumType.STRING)
    private Estimation estimation;
    private String manufacturer;
    private BigDecimal price;

    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Review> review;

    private String description;

    public Toy() {
    }

    public Toy(long id,String name, Format format, StatusToy statusToy, String manufacturer, BigDecimal price, String description) {
        this.name = name;
        this.format = format;
        this.statusToy = statusToy;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }
}

