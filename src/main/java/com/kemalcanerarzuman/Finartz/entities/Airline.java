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
@Table(name = "airline")
public class Airline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy = "airline", cascade = CascadeType.ALL)
	private List<Flight> flights;

	public Airline() {
	}

	public Airline(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		flights.add(flight);
		flight.setAirline(this);
	}
}