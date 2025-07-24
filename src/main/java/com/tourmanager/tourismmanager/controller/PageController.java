package com.tourmanager.tourismmanager.controller;

import com.tourmanager.tourismmanager.model.TourismBookingModel;
import com.tourmanager.tourismmanager.services.TourismManagementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/tourism")
public class PageController {

    @Autowired
    TourismManagementServices tourismManagementServices;

    @GetMapping("/home")
    public String displayHomePage(Model model){
        model.addAttribute("tourismBooking", new TourismBookingModel());
        return "index.html";
    }


    @PostMapping("/createResult")
    public String showCreateResultPage(@Valid @ModelAttribute("tourismBooking") TourismBookingModel tourismBookingModel,
                                       BindingResult bindingResult,
                                       Model model) {
        if (bindingResult.hasErrors()) {
            return "index.html"; // return form with error messages
        }

        tourismManagementServices.add(tourismBookingModel);
        model.addAttribute("tourismBooking", new TourismBookingModel()); // Reset the form
        return "index.html";
    }

}
