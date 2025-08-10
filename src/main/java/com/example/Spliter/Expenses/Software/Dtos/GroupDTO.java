package com.example.Spliter.Expenses.Software.Dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class GroupDTO {
    private String name;
    private List<MemberDTO> members;
}
