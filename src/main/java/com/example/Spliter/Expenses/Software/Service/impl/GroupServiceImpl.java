package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Groups;
import com.example.Spliter.Expenses.Software.Entity.Members;
import com.example.Spliter.Expenses.Software.Entity.Trip;
import com.example.Spliter.Expenses.Software.Repository.GroupRepository;
import com.example.Spliter.Expenses.Software.Repository.MembersRepository;
import com.example.Spliter.Expenses.Software.Repository.TripRepository;
import com.example.Spliter.Expenses.Software.Service.GroupServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupServiceInterface {

    @Autowired
    GroupRepository groupRepository;
    @Autowired
    MembersRepository membersRepository;
    @Autowired
    TripRepository tripRepository;
    @Override
    public String addGroup(Groups groups,long Tid) {
        try{
            Trip trip=tripRepository.findById(Tid).get();
            groups.setBudget(0);
            trip.addGroup(groups);
//            groupRepository.save(groups);/
            tripRepository.save(trip);
            return "sucesss";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String addMemToGroup(int mid, long gid) {

        try{
            Groups group=groupRepository.findById(gid).get();
            Members member=membersRepository.findById(mid).get();
            group.addMember(member);
            groupRepository.save(group);
            return "Success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String addSpentMoney(long gid, int money) {
        try {
            Groups group=groupRepository.findById(gid).get();
            group.setBudget(+money);

            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
