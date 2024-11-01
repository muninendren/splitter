package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Members;
import com.example.Spliter.Expenses.Software.Entity.Trip;
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
    public void create(Trip trip) {
//        Groups everyone=new Groups();
//
//        everyone.getMembers().addAll(membersRepository.findAllByTrip_TripId(1));
//        trip.getGroups().add(everyone);

        tripRepository.save(trip);
    }

    @Override
    public String addMemberToTrip(int mid, long tid) {
        Members member=membersRepository.findById(mid).get();
        Trip trip=tripRepository.findById(tid).get();
        trip.getMembers().add(member);
        tripRepository.save(trip);
        return "success";
    }
}
