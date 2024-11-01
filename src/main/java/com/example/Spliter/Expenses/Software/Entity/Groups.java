package com.example.Spliter.Expenses.Software.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "group_table")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;


}
