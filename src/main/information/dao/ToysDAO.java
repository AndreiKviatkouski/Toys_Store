package my_diploma_work.dao;

import my_diploma_work.dao.rowMapper.ToysRowMapper;
import my_diploma_work.domain.toys.Review;
import my_diploma_work.domain.toys.Toy;
import my_diploma_work.service.DTO.ToysReviewDTO;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


@Repository
public class ToysDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private JdbcTemplate jdbcTemplate;

    public ToysDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate, JdbcTemplate jdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.jdbcTemplate = jdbcTemplate;
    }


    public KeyHolder saveTay(Toy toy) {
        final String INSERT_SQL = "INSERT INTO toyDB (name, format, manufacturer, price, statusToy, description) VALUES (?, ?, ?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[]{"id"});
                        ps.setString(1, toy.getName());
                        ps.setString(2, toy.getManufacturer());
                        ps.setObject(3, toy.getFormat());
                        ps.setObject(4, toy.getPrice());
                        ps.setObject(5, toy.getStatusToy());
                        ps.setString(6, toy.getDescription());
                        return ps;
                    }
                }, keyHolder);
        return keyHolder;
    }


    public int[] saveReview(Toy toy) {
        List<Review> review = toy.getReview();
        return jdbcTemplate.batchUpdate("INSERT INTO reviewDB (review, estimation, idUser,madeDate) VALUES (?, ?, ?, ?)",
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, review.get(i).getReview());
                        ps.setString(2, review.get(i).getEstimation().toString());
                        ps.setLong(3, review.get(i).getIdUser());
                        ps.setString(4, review.get(i).getDate().toString());
                    }

                    @Override
                    public int getBatchSize() {
                        return review.size();
                    }//размер партии
                });
    }

    public int[] saveToyReviewDB(List<ToysReviewDTO> toysReviewDTOList) {
        return jdbcTemplate.batchUpdate("INSERT INTO toyReviewDB (idToy, idReview) VALUES (?, ?)",
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setLong(1, toysReviewDTOList.get(i).getIdToy());
                        ps.setLong(2, toysReviewDTOList.get(i).getIdReview());
                    }

                    @Override
                    public int getBatchSize() {
                        return toysReviewDTOList.size();
                    }
                });
    }

    public Toy getToy(long id) {
        Toy toy = jdbcTemplate.queryForObject(
                "SELECT * FROM toyDB WHERE ID = ?",
                new Object[]{id}, new ToysRowMapper());
        return toy;
    }

    public KeyHolder saveToy(Toy toy) {
        return (KeyHolder) toy;// исправить метод
    }

}


