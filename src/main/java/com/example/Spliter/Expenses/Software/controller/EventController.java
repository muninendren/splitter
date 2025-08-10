package com.example.Spliter.Expenses.Software.controller;


import com.example.Spliter.Expenses.Software.Dtos.EventDTO;
import com.example.Spliter.Expenses.Software.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Events")
public class EventController {

    @Autowired
    EventsService eventsService;

    @PostMapping("/create")
    public void createOne(@RequestBody EventDTO eventDTO){
        eventsService.createEvent(eventDTO);

    }

}
