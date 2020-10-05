package com.pankaj.flightservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pankaj.flightservice.entities.Flight;
import com.pankaj.flightservice.repos.FlightRepository;

@RestController
@CrossOrigin
@RequestMapping("/flightapi")
public class FlightController {

	@Autowired
	FlightRepository repo;

	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return repo.findAll();
	}
}
