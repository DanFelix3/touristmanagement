package com.tourmanager.tourismmanager.data.imp;

import com.tourmanager.tourismmanager.data.DbAccess;
import com.tourmanager.tourismmanager.model.TourismBookingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class DbAccesImpl implements DbAccess {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate restTemplate;

    @Override
    public TourismBookingModel save(TourismBookingModel tourismBookingModel){
        int res1 = restTemplate.update("INSERT INTO BOOKTABLE(firstname, lastname, email, phnumber, packageselect, guestno, bookingdate, timeslot, requirements) VALUES (?,?,?,?,?,?,?,?,?);",
                tourismBookingModel.getFirstname(), tourismBookingModel.getLastname(),
                tourismBookingModel.getEmail(), tourismBookingModel.getPhnumber(),
                tourismBookingModel.getPackageselect(), tourismBookingModel.getGuestno(),
                tourismBookingModel.getBookingdate(),tourismBookingModel.getTimeslot(),
                tourismBookingModel.getRequirements());
        if(res1>0){
            return tourismBookingModel;
        }else{
            return null;
        }

    }
}
