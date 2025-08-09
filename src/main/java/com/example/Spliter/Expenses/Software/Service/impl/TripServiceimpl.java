package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Event;
import com.example.Spliter.Expenses.Software.Repository.MembersRepository;
import com.example.Spliter.Expenses.Software.Repository.TripRepository;
import com.example.Spliter.Expenses.Software.Service.TripServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripServiceimpl implements TripServiceInterface {

    @Autowired
    TripRepository tripRepository;
    @Autowired
    MembersRepository membersRepository;


    @Override
    public void create(Event trip) {


    }

    @Override
    public String addMemberToTrip(int mid, long tid) {
        return null;

    }
}
