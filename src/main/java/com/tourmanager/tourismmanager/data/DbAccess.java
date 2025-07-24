package com.tourmanager.tourismmanager.data;

import com.tourmanager.tourismmanager.model.TourismBookingModel;

public interface DbAccess {

    public TourismBookingModel save(TourismBookingModel tourismBookingModel);
}
