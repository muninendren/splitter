package com.example.Spliter.Expenses.Software.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "group_table")
@Builder
public class Groups {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    @Column(name = "group_name", nullable = false)
    private String name;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "group_members",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<Members> members = new HashSet<>();

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<PaymentToSend> paymentsToSend;


    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<PaymentToReceive> paymentsToReceive;

    @ManyToMany(mappedBy = "groups")
    private Set<Event> events = new HashSet<>();

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString();
        }
    }



}
