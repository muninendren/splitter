package com.example.Spliter.Expenses.Software.controller;

import com.example.Spliter.Expenses.Software.Entity.Groups;
import com.example.Spliter.Expenses.Software.Service.GroupServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("groups")
public class GroupsController {
    @Autowired
    GroupServiceInterface groupServiceInterface;


  //  groups/addgroup/
    @PostMapping("/addgroup/{Tid}")
    public String addGroup(@RequestBody Groups groups,@PathVariable("Tid") long tid){
        return groupServiceInterface.addGroup(groups,tid);
    }

    //groups/add//to/
    @PutMapping("/add/{mid}/to/{gid}")
    public String addMemToGroup(@PathVariable("mid") int mid, @PathVariable("gid") long gid) {
        return groupServiceInterface.addMemToGroup(mid, gid);
    }

    //groups/spent//
    @PutMapping("/spent/{gid}/{money}")
    public String addSpentAmount(@PathVariable("gid") long gid,int money){
        return groupServiceInterface.addSpentMoney(gid,money);
    }
}
