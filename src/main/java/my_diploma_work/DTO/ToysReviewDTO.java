package my_diploma_work.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToysReviewDTO {

    @Id
    private Long idToy;

    private Long idReview;

}
