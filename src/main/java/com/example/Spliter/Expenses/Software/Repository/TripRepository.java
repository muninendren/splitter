package com.example.Spliter.Expenses.Software.Repository;

import com.example.Spliter.Expenses.Software.Entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip,Long> {
}
