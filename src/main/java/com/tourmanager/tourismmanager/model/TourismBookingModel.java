package com.tourmanager.tourismmanager.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.sql.Date;

@NoArgsConstructor
@Data
@Getter
@Setter
public class TourismBookingModel {

    @NotNull(message = "Must not be Empty")
    private Integer id;

    @NotNull(message = "Must not be Empty")
    private String firstname;

    @NotNull(message = "Must not be Empty")
    private String lastname;

    @NotNull(message = "Must not be Empty")
    private String email;

    @NotNull(message = "Must not be Empty")
    private Integer phnumber;

    @NotNull(message = "Must not be Empty")
    private String packageselect;

    @NotNull(message = "Must not be Empty")
    private String guestno;

    @NotNull(message = "Must not be Empty")
    private Date bookingdate;

    @NotNull(message = "Must not be Empty")
    private String timeslot;

    @NotNull(message = "Must not be Empty")
    private String requirement;

    public TourismBookingModel(Integer id, String firstname, String lastname, String email,
                               Integer phnumber, String packageselect, String guestno,
                               Date bookingdate, String timeslot, String requirement){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phnumber = phnumber;
        this.packageselect = packageselect;
        this.guestno = guestno;
        this.bookingdate = bookingdate;
        this.timeslot = timeslot;
        this.requirement = requirement;

    }

}
