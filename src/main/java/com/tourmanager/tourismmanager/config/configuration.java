package com.tourmanager.tourismmanager.config;


import com.tourmanager.tourismmanager.services.TourismManagementServices;
import com.tourmanager.tourismmanager.services.imp.TourismManagementServicesImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class configuration {

    @Bean(name="tourismManagementServices")
    @RequestScope
    public TourismManagementServices getJobCardServices(){
        return new TourismManagementServicesImpl();
    }
}