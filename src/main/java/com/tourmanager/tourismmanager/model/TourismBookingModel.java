package com.tourmanager.tourismmanager.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import java.sql.Date;

@NoArgsConstructor
@Data
@Getter
@Setter
public class TourismBookingModel {

    @NotNull(message = "Must not be Empty")
    private String firstName;

    @NotNull(message = "Must not be Empty")
    private String lastName;

    @NotNull(message = "Must not be Empty")
    private String email;

    @NotNull(message = "Must not be Empty")
    private Integer number;

    @NotNull(message = "Must not be Empty")
    private String packageSelect;

    @NotNull(message = "Must not be Empty")
    private String guestNo;

    @NotNull(message = "Must not be Empty")
    private Date date;

    @NotNull(message = "Must not be Empty")
    private String timeSlot;

    @NotNull(message = "Must not be Empty")
    private String requirement;

    public TourismBookingModel(String firstName, String lastName, String email,
                               Integer number, String packageSelect, String guestNo,
                               Date date, String timeSlot, String requirement){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
        this.packageSelect = packageSelect;
        this. guestNo = guestNo;
        this.date = date;
        this.timeSlot = timeSlot;
        this.requirement = requirement;

    }

}
