package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Groups;
import com.example.Spliter.Expenses.Software.Entity.Members;
import com.example.Spliter.Expenses.Software.Entity.Trip;
import com.example.Spliter.Expenses.Software.Repository.MembersRepository;
import com.example.Spliter.Expenses.Software.Repository.TripRepository;
import com.example.Spliter.Expenses.Software.Service.TripServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@Service
public class TripServiceimpl implements TripServiceInterface {

    @Autowired
    TripRepository tripRepository;
    @Autowired
    MembersRepository membersRepository;


    @Override
    public void create(Trip trip) {
        Groups common=new Groups();
        common.setName("Common");
        common.setBudget(0);
        trip.setGroups(new ArrayList<Groups>(Arrays.asList(common)));
        tripRepository.save(trip);
    }

    @Override
    public String addMemberToTrip(int mid, long tid) {

        Members member=membersRepository.findById(mid).get();
        Trip trip=tripRepository.findById(tid).get();
        trip.getMembers().add(member);
        trip.getGroups().get(0).setMembersSet(new HashSet<>(Arrays.asList(member)));
        trip.getGroups().get(0).setCount(trip.getGroups().get(0).getCount()+1);
        trip.setCount(trip.getCount()+1);
        tripRepository.save(trip);
        return "success";
    }
}
