package my_diploma_work.repository;

import my_diploma_work.domain.toys.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

//    Toy findById(long id);

    List<Toy> findAllByManufacturer(String manufacturer);

    List<Toy> findByFormat(Format format);

    List<Toy> findByStatusToy(StatusToy statusToy);

    List<Toy> findByEstimation(Estimation estimation);

    List<Toy> findByPrice(BigDecimal price);

    @Query(value = "update Toy set name = ?1 where id = ?2")
    String updateToyByName(String name, long id);

    @Query(value = "update Toy set price = ?1 where id = ?2")
    BigDecimal updateToyByPrice(BigDecimal price, long id);

    @Query(value = "update Toy set description = ?1 where id = ?2")
    String updateToyByDescription(String description, long id);

    @Query(value = "update Toy set review = ?1 where id = ?2")
    String updateToyByReview(Review review, long id);

    void deleteById(long id);

    boolean existsToyById(long id);

    boolean existsByName(String name);

    boolean existsByManufacturer(String manufacturer);

    boolean existsToyByStatusToy(StatusToy statusToy);

    boolean existsToyByEstimation(Estimation estimation);

    boolean existsToyByPrice(BigDecimal price);

    boolean existsByFormat(Format format);

}
