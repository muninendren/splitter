package com.example.Spliter.Expenses.Software.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id")  // Foreign key column in the Members table
    private List<Members> members;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "trip_id")
//    private List<Members> members;
}
