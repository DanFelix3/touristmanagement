package com.tourmanager.tourismmanager.controller;

import com.tourmanager.tourismmanager.model.TourismBookingModel;
import com.tourmanager.tourismmanager.services.TourismManagementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String displayHomePage(){
        return "homePage.html";
    }


    @PostMapping("/createResult")
    public String showCreateResultPage(@Valid TourismBookingModel tourismBookingModel, BindingResult bindingResul, Model model){
        tourismManagementServices.add(tourismBookingModel);
        model.addAttribute("title","Job Cards Updated");
        return "";
    }
}
