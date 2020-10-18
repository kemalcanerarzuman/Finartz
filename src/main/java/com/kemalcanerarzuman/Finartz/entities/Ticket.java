package com.kemalcanerarzuman.Finartz.entities;

import java.util.regex.Pattern;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column
	private String number;

	@Column(name = "credit_card")
	private String creditCard;

	@Column(name = "price")
	private double price;

	@Column(name = "sold")
	private boolean sold;

	@Column(name = "cancelled")
	private boolean cancelled;

	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "flight_id")
	private Flight flight;

	public Ticket() {}

	public Ticket(String number, double price) {
		this(number, price, null, false, false);
	}

	public Ticket(String number,double price, String creditCard, boolean sold, boolean cancelled) {
		this.number = number;
		this.price = price;
		this.creditCard = creditCard;
		this.sold = sold;
		this.cancelled = cancelled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCreditCard() {
		if (creditCard == null)
			return null;
		String creditCardTmp = "";
		for (int i = 0; i < creditCard.length(); i++) {
			creditCardTmp += i >= 6 && i <= 11 ? "*" : creditCard.charAt(i);
		}
		return creditCardTmp;
	}

	public void setCreditCard(String creditCard) {
		if (creditCard == null) {
			this.creditCard = null;
			return;
		}
		String creditCardTmp = "";
		for (int i = 0; i < creditCard.length(); i++) {
			if (Pattern.matches("[0-9]", String.valueOf(creditCard.charAt(i)))) {
				creditCardTmp += creditCard.charAt(i);
			}
		}
		this.creditCard = creditCardTmp.substring(0, Math.min(16, creditCardTmp.length()));
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}