package com.tourmanager.tourismmanager.data.imp;

import com.tourmanager.tourismmanager.data.DbAccess;
import com.tourmanager.tourismmanager.model.TourismBookingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DbAccesImpl implements DbAccess {

    @Autowired
    JdbcTemplate restTemplate;

    @Override
    public TourismBookingModel save(TourismBookingModel tourismBookingModel){
        int res1 = restTemplate.update("INSERT INTO BOOKTABLE( FIRSTNAME, LASTNAME, EMAIL, " +
                "NUMBER, PACKAGE, GUESTNO, DATE, TIME, REQUIREMENT) VALUES( ?,?,?,?,?,?,?,?,?)",
                tourismBookingModel.getFirstName(), tourismBookingModel.getLastName(),
                tourismBookingModel.getEmail(), tourismBookingModel.getNumber(),
                tourismBookingModel.getPackageSelect(), tourismBookingModel.getGuestNo(),
                tourismBookingModel.getDate(),tourismBookingModel.getTimeSlot(),
                tourismBookingModel.getRequirement());
        if(res1>0){
            return tourismBookingModel;
        }else{
            return null;
        }

    }
}
