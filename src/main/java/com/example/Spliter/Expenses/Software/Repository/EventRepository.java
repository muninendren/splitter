package com.example.Spliter.Expenses.Software.Repository;

import com.example.Spliter.Expenses.Software.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,String> {
}
