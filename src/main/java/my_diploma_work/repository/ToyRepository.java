package my_diploma_work.repository;

import my_diploma_work.domain.toys.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

    Toy findById(long id);

    List<Toy> findAllByManufacturer(String manufacturer);

    List<Toy> findByFormat(Format format);

    List<Toy> findByStatusToy(StatusToy statusToy);

    List<Toy> findByEstimation(Estimation estimation);

    List<Toy> findByPrice(BigDecimal price);

//    @Query(value = "update Toy set Toy = ?1 where id = ?2")
//    Toy updateToy(long id);
//    Toy toy existsToyById(Toy toy, long id);

    @Query(value = "update Toy set price = ?1 where id = ?2")
    BigDecimal updateToyPrice(BigDecimal price, long id);

    @Query(value = "update Toy set description = ?1 where id = ?2")
    String updateDescription(String description, long id);

    @Query(value = "update Toy set review = ?1 where id = ?2")
    String updateReview(Review review, long id);

    void deleteById(long id);
    void delete(Toy toy);

}
