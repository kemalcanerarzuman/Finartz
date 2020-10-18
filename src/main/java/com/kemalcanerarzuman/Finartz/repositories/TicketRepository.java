package com.kemalcanerarzuman.Finartz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kemalcanerarzuman.Finartz.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

	@Query(value = "SELECT t FROM Ticket t WHERE t.number = :number")
	public Ticket findTicketByNumber(@Param("number")String number);
}
