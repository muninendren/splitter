package com.example.Spliter.Expenses.Software.Repository;

import com.example.Spliter.Expenses.Software.Entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Groups,Long> {
}
