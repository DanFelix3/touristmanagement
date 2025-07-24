package com.tourmanager.tourismmanager.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DbMapper implements RowMapper<TourismBookingModel>{

    @Override
    public TourismBookingModel mapRow(ResultSet rs, int rowNum) throws SQLException {

        TourismBookingModel tbm = new TourismBookingModel(rs.getString("firstname"),
                rs.getString("lastname"), rs.getString("email"),
                rs.getInt("number"), rs.getString("package"),
                rs.getString("guestno"), rs.getDate("date"),
                rs.getString("time"), rs.getString("requirement"));
        return tbm;
    }
}
