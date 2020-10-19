package com.kemalcanerarzuman.Finartz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kemalcanerarzuman.Finartz.entities.Airline;
import com.kemalcanerarzuman.Finartz.entities.Airway;
import com.kemalcanerarzuman.Finartz.entities.Flight;
import com.kemalcanerarzuman.Finartz.entities.Route;
import com.kemalcanerarzuman.Finartz.entities.Ticket;
import com.kemalcanerarzuman.Finartz.services.AirlineService;
import com.kemalcanerarzuman.Finartz.services.AirwayService;
import com.kemalcanerarzuman.Finartz.services.FlightService;
import com.kemalcanerarzuman.Finartz.services.RouteService;
import com.kemalcanerarzuman.Finartz.services.TicketService;

@RestController
public class RestAPIController {

	@Autowired
	AirwayService airwayService;

	@Autowired
	AirlineService airlineService;

	@Autowired
	RouteService routeService;

	@Autowired
	FlightService flightService;

	@Autowired
	TicketService ticketService;

	@GetMapping("/airway")
	public String airway() {
		return String.format("Welcome to Airway Page");
	}

	@GetMapping("/airway/{id}")
	public Airway getAirway(@PathVariable int id) {
		return airwayService.findById(id).get();
	}

	@PostMapping("/airway")
	public Airway postAirway(@RequestBody Airway airway) {
		Airway airway3 = airwayService.save(airway);
		return airway3;
	}

	@GetMapping("/airline")
	public String airline() {
		return String.format("Welcome to Airline Page");
	}

	@GetMapping("/airline/{id}")
	public Airline getAirline(@PathVariable int id) {
		return airlineService.findById(id).get();
	}

	@PostMapping("/airline")
	public Airline postAirline(@RequestBody Airline airline) {
		Airline airline2 = airlineService.save(airline);
		return airline2;
	}

	@GetMapping("/airline/setflight")
	public Airline setFlight(@RequestParam(value = "id", required = true) int id, 
			@RequestBody Flight flight) {
		Flight flight2 = flightService.findById(flight.getId()).get();
		Airline airline = airlineService.findById(id).get();
		airline.addFlight(flight2 == null ? flight : flight2);
		flightService.save(flight2);
		Airline airline2 = airlineService.save(airline);
		return airline2;
	}

	@GetMapping("/route")
	public String route() {
		return "Welcome to Route Page";
	}

	@GetMapping("/route/{id}")
	public Route getRoute(@PathVariable int id) {
		return routeService.findById(id).get();
	}

	@PostMapping("/route")
	public Route postRoute(@RequestBody Route route) {
		Airway departure = airwayService.findById(route.getDeparture().getId()).get();
		Airway arrival = airwayService.findById(route.getArrival().getId()).get();
		if (departure == null)
			departure = airwayService.save(route.getDeparture());
		if (arrival == null)
			arrival = airwayService.save(route.getArrival());
		route.setDeparture(departure);
		route.setArrival(arrival);
		Route route2 = routeService.save(route);
		return route2;
	}

	@GetMapping("/flight")
	public String flight() {
		return "Welcome to Flight Page";
	}

	@GetMapping("/flight/{id}")
	public Flight getFlight(@PathVariable int id) {
		return flightService.findById(id).get();
	}

	@GetMapping("/flight/updatequota")
	public Flight updateQuota(
			@RequestParam(value = "id", required = true) int id, 
			@RequestParam(value = "quota", required = true) int quota) {
		Flight flight = flightService.findById(id).get();
		if (flight != null) {
			flight.setQuota(quota);
		}
		return flightService.save(flight);
	}

	@PostMapping("/flight")
	public Flight postFlight(@RequestBody Flight flight) {
		Flight flight2 = flightService.save(flight);
		return flight2;
	}

	@GetMapping("/ticket")
	public String ticket() {
		return String.format("Welcome to Ticket Page");
	}

	@GetMapping("/ticket/{id}")
	public Ticket getTicket(@PathVariable int id) {
		return ticketService.findById(id).get();
	}

	@PostMapping("/ticket")
	public Ticket postTicket(@RequestBody Ticket ticket) {
		Ticket ticket2 = ticketService.save(ticket);
		return ticket2;
	}

	@GetMapping("/ticket/search")
	public Ticket getTicket(@RequestParam(value = "number", required = true) String number) {
		return ticketService.findTicketByNumber(number);
	}

	@GetMapping("/ticket/buyticket")
	public Ticket buyTicket(@RequestParam(value = "number", required = true) String number,
			@RequestParam(value = "creditCard", required = true) String creditCard) {
		Ticket ticket = ticketService.findTicketByNumber(number);
		ticket.setSold(true);
		ticket.setCreditCard(creditCard);
		ticketService.save(ticket);
		return ticket;
	}

	@GetMapping("/ticket/cancel")
	public Ticket cancelTicket(@RequestParam(value = "number", required = true) String number) {
		Ticket ticket = ticketService.findTicketByNumber(number); 
		ticket.setCancelled(true);
		ticketService.save(ticket);
		return ticket;
	}
}