package com.example.Spliter.Expenses.Software.Dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberDTO {
    private String name;

    private String mobileNum;
}
