package com.kemalcanerarzuman.Finartz.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne
	@JoinColumn(name = "departure_id")
	private Airway departure;

	@ManyToOne
	@JoinColumn(name = "arrival_id")
	private Airway arrival;

	@JsonIgnore
	@OneToMany(mappedBy = "route", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE})
	private List<Flight> flights;

	public Route() {
	}

	public Route(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
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

	public Airway getDeparture() {
		return departure;
	}

	public void setDeparture(Airway departure) {
		this.departure = departure;
	}

	public Airway getArrival() {
		return arrival;
	}

	public void setArrival(Airway arrival) {
		this.arrival = arrival;
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