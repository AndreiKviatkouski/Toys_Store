package my_diploma_work.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my_diploma_work.domain.toys.Format;
import my_diploma_work.domain.toys.Review;
import my_diploma_work.domain.toys.StatusToy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToysDTO {
    @Id
    private long id;

    private String name;
    private Format format;
    private String manufacturer;
    private BigDecimal price;
    @OneToMany
    private List<Review> review;

    private StatusToy statusToy;
    private String description;

}
