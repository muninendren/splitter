package com.example.Spliter.Expenses.Software.Entity;

import com.example.Spliter.Expenses.Software.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PaymentToReceive {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private Members receiver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Groups group;

    @Column(nullable = false)
    private int amount;

    @Column(name = "payment_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus=PaymentStatus.PENDING;

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString();
        }
    }

}



