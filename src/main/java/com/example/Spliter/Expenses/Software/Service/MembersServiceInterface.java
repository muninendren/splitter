package com.example.Spliter.Expenses.Software.Service;

import com.example.Spliter.Expenses.Software.Entity.Members;

import java.util.List;

public interface MembersServiceInterface {

    public String addMember(Members member);

    String addGroupToMem(long gid, int mid);

    List<Members> getAll();
}
