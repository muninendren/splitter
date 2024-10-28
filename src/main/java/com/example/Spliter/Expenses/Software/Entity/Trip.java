package com.example.Spliter.Expenses.Software.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trip {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tripId;
    private Date date;
    private String name;
}
