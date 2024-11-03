package com.example.Spliter.Expenses.Software.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

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
    private int budget;
    private int count=0;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="Groups_people",
            joinColumns = {@JoinColumn(name="Customer_id_fk")},
            inverseJoinColumns={@JoinColumn(name="Member_id_fk")}
    )
    Set<Members> membersSet;

    public void addMember(Members mem){
        membersSet.add(mem);
    }


}
