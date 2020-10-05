package com.pankaj.flightservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pankaj.flightservice.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
