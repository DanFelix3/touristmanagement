package com.tourmanager.tourismmanager.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DbMapper implements RowMapper<TourismBookingModel>{

    @Override
    public TourismBookingModel mapRow(ResultSet rs, int rowNum) throws SQLException {

        TourismBookingModel tbm = new TourismBookingModel(rs.getString("firstname"),
                rs.getString("lastname"), rs.getString("email"),
                rs.getInt("phnumber"), rs.getString("packageselect"),
                rs.getString("guestno"), rs.getDate("bookingdate"),
                rs.getString("timeslot"), rs.getString("requirement"));
        return tbm;
    }
}
