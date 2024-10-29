package com.example.Spliter.Expenses.Software.controller;

import com.example.Spliter.Expenses.Software.Entity.Trip;
import com.example.Spliter.Expenses.Software.Service.impl.TripServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trip")
public class TripController {

    @Autowired
    TripServiceimpl tripService;

    @PostMapping("/create")
    public void createTrip(@RequestBody Trip trip){
        tripService.create(trip);

    }




}
