package com.tourmanager.tourismmanager.model;

import lombok.*;

import jakarta.validation.constraints.NotNull;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourismBookingModel {

    @NotNull(message = "Must not be Empty")
    private String firstname;

    @NotNull(message = "Must not be Empty")
    private String lastname;

    @NotNull(message = "Must not be Empty")
    private String email;

    @NotNull(message = "Must not be Empty")
    private String phnumber;

    @NotNull(message = "Must not be Empty")
    private String packageselect;

    @NotNull(message = "Must not be Empty")
    private String guestno;

    @NotNull(message = "Must not be Empty")
    private Date bookingdate;

    @NotNull(message = "Must not be Empty")
    private String timeslot;

    private String requirements;

}
