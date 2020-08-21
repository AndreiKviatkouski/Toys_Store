package my_diploma_work.repository;

import my_diploma_work.domain.toys.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

    Toy findById(long id);

    List<Toy> findAllByManufacturer(String manufacturer);

    List<Toy> findByFormat(Format format);

    List<Toy> findByStatusToy(StatusToy statusToy);

    List<Toy> findByEstimation(Estimation estimation);

    List<Toy> findByPrice(BigDecimal price);

//    Toy updateToy(Toy toy, int id);
//
//    BigDecimal updateToyPrice(BigDecimal price, int id);
//
//    String updateDescription(String description, int id);
//
//    String updateReview(Review review, int id);

    void deleteById(int id);

//    void remove(Toy toy);
}
