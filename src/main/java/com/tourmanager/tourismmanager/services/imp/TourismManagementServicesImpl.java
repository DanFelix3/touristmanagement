package com.tourmanager.tourismmanager.services.imp;

import com.tourmanager.tourismmanager.data.DbAccess;
import com.tourmanager.tourismmanager.model.TourismBookingModel;
import com.tourmanager.tourismmanager.services.TourismManagementServices;
import org.springframework.beans.factory.annotation.Autowired;

public class TourismManagementServicesImpl implements TourismManagementServices {


    @Autowired
    DbAccess dbAccess;

    @Override
    public TourismBookingModel add(TourismBookingModel tourismBookingModel){
        return dbAccess.save(tourismBookingModel);
    }

}
