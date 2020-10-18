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
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "quota")
	private int quota;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST })
	@JoinColumn(name = "route_id")
	private Route route;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST })
	@JoinColumn(name = "airline_id")
	private Airline airline;

	@JsonIgnore
	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	private List<Ticket> tickets;

	public Flight() {
	}

	public Flight(int quota) {
		this.quota = quota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		if (this.quota < quota && tickets != null) {
			final double increment = (double) (((int)(10 * ((double) quota / (double) this.quota))) / 10.0);
			tickets.forEach(ticket -> {
				ticket.setPrice(ticket.isSold() || ticket.isCancelled() ? ticket.getPrice() : ticket.getPrice() * increment);
				});
		}
		this.quota = quota;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public void addTicket(Ticket ticket) {
		if (tickets == null)
			tickets = new ArrayList<>();
		tickets.add(ticket);
	}
}