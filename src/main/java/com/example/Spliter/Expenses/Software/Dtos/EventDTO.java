package com.example.Spliter.Expenses.Software.Dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class EventDTO {
    private String name;
    private String description;
    private LocalDate date;
    private int budget;
    private List<MemberDTO> members;
}
