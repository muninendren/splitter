package com.example.Spliter.Expenses.Software.controller;


import com.example.Spliter.Expenses.Software.Entity.Members;
import com.example.Spliter.Expenses.Software.Service.impl.MembersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("members")
public class MembersController {

    @Autowired
    MembersServiceImpl membersService;

    @PostMapping("/add")
    public String addMember(@RequestBody Members member){
       return membersService.addMember(member);
    }

    @PostMapping("/add/{id}")
    public String addMemberAnsTrip(@RequestBody Members member, @PathVariable("id") Integer id){
        return membersService.addMember(member);
    }
}
