package my_diploma_work.dao.rowMapper;


import my_diploma_work.domain.toys.Format;
import my_diploma_work.domain.toys.StatusToy;
import my_diploma_work.domain.toys.Toy;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ToysRowMapper implements RowMapper<Toy> {

    @Override
    public Toy mapRow(ResultSet rs, int rowNum) throws SQLException {
        Toy toy = new Toy();
        toy.setId(rs.getLong("ID"));
        toy.setName(rs.getString("NAME"));
        toy.setManufacturer(rs.getString("MANUFACTURER"));
        toy.setFormat(Format.valueOf(rs.getString("FORMAT")));
        toy.setPrice(rs.getBigDecimal("PRICE"));
        toy.setStatusToy(StatusToy.valueOf(rs.getString("StatusTOY")));
        toy.setDescription(rs.getString("DESCRIPTION"));
        return toy;
    }
}


