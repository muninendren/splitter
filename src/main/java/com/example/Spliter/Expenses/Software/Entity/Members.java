package com.example.Spliter.Expenses.Software.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;


    @ManyToOne
    @JoinColumn(name = "trip_id", insertable = false, updatable = false)  // References the foreign key from Trip
    private Trip trip;

//    private Long trip_id;
}
