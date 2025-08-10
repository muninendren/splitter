package com.example.Spliter.Expenses.Software.Repository;

import com.example.Spliter.Expenses.Software.Entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembersRepository extends JpaRepository<Members,String> {

//    @Query("Select m from Members m where m.trip.trip_id= :tripId")@Param("tripId")
//    public List<Members> findAllByTrip_TripId(Integer id);

}
