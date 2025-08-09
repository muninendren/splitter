package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Groups;
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
return null;
    }

    @Override
    public String addMemToGroup(int mid, long gid) {

return null;
    }

    @Override
    public String addSpentMoney(long gid, int money) {
        return null;

    }
}
