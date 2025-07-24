package com.tourmanager.tourismmanager.data.imp;

import com.tourmanager.tourismmanager.data.DbAccess;
import com.tourmanager.tourismmanager.model.TourismBookingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DbAccesImpl implements DbAccess {

    @Autowired
    JdbcTemplate restTemplate;

    @Override
    public TourismBookingModel save(TourismBookingModel tourismBookingModel){
        tourismBookingModel.setId(null);
        int res1 = restTemplate.update("INSERT INTO BOOKTABLE( FIRSTNAME, LASTNAME, EMAIL, PHNUMBER, PACKAGESELECT, GUESTNO, BOOKINGDATE, TIMESLOT, REQUIREMENT) VALUES( ?,?,?,?,?,?,?,?,?)",
                tourismBookingModel.getFirstname(), tourismBookingModel.getLastname(),
                tourismBookingModel.getEmail(), tourismBookingModel.getPhnumber(),
                tourismBookingModel.getPackageselect(), tourismBookingModel.getGuestno(),
                tourismBookingModel.getBookingdate(),tourismBookingModel.getTimeslot(),
                tourismBookingModel.getRequirement());
        if(res1>0){
            return tourismBookingModel;
        }else{
            return null;
        }

    }
}
