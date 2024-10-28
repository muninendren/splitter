package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Trip;
import com.example.Spliter.Expenses.Software.Repository.TripRepository;
import com.example.Spliter.Expenses.Software.Service.TripServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripServiceimpl implements TripServiceInterface {

    @Autowired
    TripRepository tripRepository;


    @Override
    public void create(Trip trip) {
        tripRepository.save(trip);
    }
}
