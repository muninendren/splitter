package com.example.Spliter.Expenses.Software.Service.impl;

import com.example.Spliter.Expenses.Software.Dtos.EventDTO;
import com.example.Spliter.Expenses.Software.Dtos.MemberDTO;
import com.example.Spliter.Expenses.Software.Entity.Event;
import com.example.Spliter.Expenses.Software.Entity.Members;
import com.example.Spliter.Expenses.Software.Repository.EventRepository;
import com.example.Spliter.Expenses.Software.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EventsServiceImpl implements EventsService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public void createEvent(EventDTO eventDTO){

        try{
            Set<Members> membersSet=new HashSet<>();

            for(MemberDTO member:eventDTO.getMembers()){
                membersSet.add(Members.builder()
                        .name(member.getName())
                        .mobileNumber(member.getMobileNum())
                        .build());
            }

            Event event=Event.builder()
                    .date(eventDTO.getDate())
                    .description(eventDTO.getDescription())
                    .totalAmount(eventDTO.getBudget())
                    .members(membersSet)
                    .name(eventDTO.getName())
                    .build();

            eventRepository.save(event);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }



    }
}
