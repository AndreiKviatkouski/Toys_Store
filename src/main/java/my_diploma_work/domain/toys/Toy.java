package my_diploma_work.domain.toys;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;
@Data//Аннотация, которая добавляет в ваш проект Getters/Setters, Equals, ToString, HashCode
@Entity
@AllArgsConstructor//Конструктор, содержащий все глобальные переменные, записанные в данном классе


public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Size(max = 15, min = 2)
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Format format;
    @Enumerated(value = EnumType.STRING)
    private StatusToy statusToy;
    @Enumerated(value = EnumType.STRING)
    private Estimation estimation;
    @NotBlank
    @Size(max = 40, min = 2)
    private String manufacturer;
    private BigDecimal price;

    @OneToMany
    private List<Review> review;

    private String description;

    private String url;

    public Toy(String name, Format format, StatusToy statusToy, String manufacturer, BigDecimal price, String description, String url) {
        this.name = name;
        this.format = format;
        this.statusToy = statusToy;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
        this.url = url;
    }

    public Toy() {
    }
}

