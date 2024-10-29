package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Entity.Members;
import com.example.Spliter.Expenses.Software.Repository.MembersRepository;
import com.example.Spliter.Expenses.Software.Service.MembersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersServiceImpl implements MembersServiceInterface {

    @Autowired
    MembersRepository membersRepository;

    @Override
    public String addMember(Members member) {
        membersRepository.save(member);
        return "Success";
    }
}
