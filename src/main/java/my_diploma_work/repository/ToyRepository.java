package my_diploma_work.repository;

import my_diploma_work.domain.toys.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

    Toy getById(long id);

    List<Toy> getAllByManufacturer(String manufacturer);

    List<Toy> getByFormat(Format format);

    List<Toy> getByStatusToy(StatusToy statusToy);

    List<Toy> getByEstimation(Estimation estimation);

    List<Toy> getByPrice(BigDecimal price);

    List<Toy> getAll();

    Toy updateToy(Toy toy, int id);

    BigDecimal updateToyPrice(BigDecimal price, int id);

    String updateDescription(String description, int id);

    String updateReview(Review review, int id);

    void remove(int id);

    void remove(Toy toy);


}
