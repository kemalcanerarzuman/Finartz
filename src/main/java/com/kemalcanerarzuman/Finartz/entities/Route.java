package com.kemalcanerarzuman.Finartz.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "route")
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "time_in_minutes")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int timeInMinutes;

	@Column(name = "departure_id")
	private int departureId;

	@Column(name = "arrival_id")
	private int arrivalId;

	@JsonIgnore
	@OneToMany(mappedBy = "route", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE})
	private List<Flight> flights;

	public Route() {
	}

	public Route(int timeInMinutes, int departureId, int arrivalId) {
		this.timeInMinutes = timeInMinutes;
		this.departureId = departureId;
		this.arrivalId = arrivalId;
	}

	public Route(int timeInMinutes, int departureId, int arrivalId, List<Flight> flights) {
		this.timeInMinutes = timeInMinutes;
		this.departureId = departureId;
		this.arrivalId = arrivalId;
		this.flights = flights;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}

	public int getDepartureId() {
		return departureId;
	}

	public void setDepartureId(int departureId) {
		this.departureId = departureId;
	}

	public int getArrivalId() {
		return arrivalId;
	}

	public void setArrivalId(int arrivalId) {
		this.arrivalId = arrivalId;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public void addFlight(Flight flight) {
		if (flights == null)
			flights = new ArrayList<Flight>();
		flight.setRoute(this);
		flights.add(flight);
	}
}