package com.example.Spliter.Expenses.Software.Service;


import com.example.Spliter.Expenses.Software.Entity.Event;

public interface TripServiceInterface {
    public void create(Event trip);

    String addMemberToTrip(int mid, long tid);
}
