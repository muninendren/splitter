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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Members {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "mobile_number", nullable = false, unique = true, length = 15)
    private String mobileNumber;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private List<PaymentToSend> paymentsToSend;

    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL)
    private List<PaymentToReceive> paymentsToReceive;

    @ManyToMany(mappedBy = "members")
    private Set<Groups> group=new HashSet<>();

    @ManyToMany(mappedBy = "members")
    private Set<Event> Events = new HashSet<>();

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString();
        }
    }

}

