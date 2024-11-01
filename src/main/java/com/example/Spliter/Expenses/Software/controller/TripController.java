package com.example.Spliter.Expenses.Software.controller;

import com.example.Spliter.Expenses.Software.Entity.Trip;
import com.example.Spliter.Expenses.Software.Service.TripServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trip")
public class TripController {

    @Autowired
    TripServiceInterface tripService;

    @PostMapping("/create")
    public void createTrip(@RequestBody Trip trip){

        tripService.create(trip);

    }

    @PostMapping("/add/{mid}/to/{tid}")
    public String addMemberToTrip(@PathVariable("mid") int mid,@PathVariable("tid") long tid){
        return tripService.addMemberToTrip(mid,tid);
    }




}
