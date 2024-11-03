package com.example.Spliter.Expenses.Software.Service;

import com.example.Spliter.Expenses.Software.Entity.Groups;

public interface GroupServiceInterface {

    String addGroup(Groups groups,long Tid);

    String addMemToGroup(int mid, long gid);

    String addSpentMoney(long gid, int money);
}
