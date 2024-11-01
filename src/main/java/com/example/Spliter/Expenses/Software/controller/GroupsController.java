package com.example.Spliter.Expenses.Software.controller;

import com.example.Spliter.Expenses.Software.Entity.Groups;
import com.example.Spliter.Expenses.Software.Service.GroupServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("groups")
public class GroupsController {
    @Autowired
    GroupServiceInterface groupServiceInterface;


  //  groups/addgroup
    @PostMapping("/addgroup")
    public String addGroup(@RequestBody Groups groups){
        return groupServiceInterface.addGroup(groups);
    }
}
