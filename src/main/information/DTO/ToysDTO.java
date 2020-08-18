package my_diploma_work.service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my_diploma_work.domain.toys.Format;
import my_diploma_work.domain.toys.Review;
import my_diploma_work.domain.toys.StatusToy;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToysDTO {

    private long id;

    private String name;
    private Format format;
    private String manufacturer;
    private BigDecimal price;

    private List<Review> review;

    private StatusToy statusToy;
    private String description;

}
