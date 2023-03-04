package com.driver.repository;
import com.driver.model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class TripBookingRepository implements JpaRepository<TripBooking, Integer> {

}
