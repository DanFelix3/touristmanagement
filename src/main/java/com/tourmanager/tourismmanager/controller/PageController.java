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

import jakarta.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/tourism")
public class PageController {

    @Autowired
    TourismManagementServices tourismManagementServices;

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/tourism/home";
    }

    @GetMapping("/home")
    public String displayHomePage(Model model){
        model.addAttribute("tourismBooking", new TourismBookingModel());
        return "index.html";
    }


    @PostMapping("/result")
    public String showCreateResultPage(@Valid TourismBookingModel tourismBookingModel,
                                       BindingResult bindingResult,
                                       Model model) {
        tourismManagementServices.add(tourismBookingModel);
        return "result";
    }

}
