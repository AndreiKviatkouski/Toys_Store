package my_diploma_work.dao.rowMapper;


import my_diploma_work.DTO.ToysReviewDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ToysReviewRowMapper implements RowMapper<ToysReviewDTO> {
    @Override
    public ToysReviewDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        ToysReviewDTO toysReviewDTO = new ToysReviewDTO();
        toysReviewDTO.setIdToy(rs.getLong("IdToy"));
        toysReviewDTO.setIdReview(rs.getLong("IdReview"));
        return toysReviewDTO;
    }
}
