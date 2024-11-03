package com.example.Spliter.Expenses.Software.controller;


import com.example.Spliter.Expenses.Software.Entity.Members;
import com.example.Spliter.Expenses.Software.Service.MembersServiceInterface;
import com.example.Spliter.Expenses.Software.Service.impl.MembersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("members")
public class MembersController {

    @Autowired
    MembersServiceInterface membersService;

    @PostMapping("/add")
    public String addMember(@RequestBody Members member){
       return membersService.addMember(member);
    }

    @PostMapping("/add/{id}")
    public String addMemberAnsTrip(@RequestBody Members member, @PathVariable("id") Integer id){
        return membersService.addMember(member);
    }

    @PutMapping("/add/{gid}/to/{mid}")
    public String addMemToGroup(@PathVariable("mid") int mid,@PathVariable("gid") long gid){
        return membersService.addGroupToMem(gid,mid);
    }

    @GetMapping()
    public List<Members> getAll(){
        return membersService.getAll();
    }
}
