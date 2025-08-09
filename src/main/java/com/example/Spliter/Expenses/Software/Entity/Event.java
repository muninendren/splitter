package com.example.Spliter.Expenses.Software.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "event_name")
    private String name;

    @Column(name = "total_amount")
    private int totalAmount;

    @ManyToMany
    @JoinTable(
            name = "event_members",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private Set<Members> members = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "event_groups",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<Groups> groups = new HashSet<>();

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString();
        }
    }




}



