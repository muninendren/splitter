package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Groups;
import com.example.Spliter.Expenses.Software.Repository.GroupRepository;
import com.example.Spliter.Expenses.Software.Service.GroupServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupServiceInterface {

    @Autowired
    GroupRepository groupRepository;
    @Override
    public String addGroup(Groups groups) {
        try{
            groupRepository.save(groups);
            return "sucesss";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
