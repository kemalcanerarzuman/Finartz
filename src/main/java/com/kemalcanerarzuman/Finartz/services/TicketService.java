package com.kemalcanerarzuman.Finartz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kemalcanerarzuman.Finartz.entities.Ticket;
import com.kemalcanerarzuman.Finartz.repositories.TicketRepository;

@Service
public class TicketService implements TicketRepository {

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public List<Ticket> findAll() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	@Override
	public List<Ticket> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return ticketRepository.findAll(sort);
	}

	@Override
	public List<Ticket> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return ticketRepository.findAllById(ids);
	}

	@Override
	public <S extends Ticket> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return ticketRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		ticketRepository.flush();
	}

	@Override
	public <S extends Ticket> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return ticketRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Ticket> entities) {
		// TODO Auto-generated method stub
		ticketRepository.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		ticketRepository.deleteAllInBatch();
	}

	@Override
	public Ticket getOne(Integer id) {
		// TODO Auto-generated method stub
		return ticketRepository.getOne(id);
	}

	@Override
	public <S extends Ticket> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return ticketRepository.findAll(example);
	}

	@Override
	public <S extends Ticket> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return ticketRepository.findAll(example, sort);
	}

	@Override
	public Page<Ticket> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return ticketRepository.findAll(pageable);
	}

	@Override
	public <S extends Ticket> S save(S entity) {
		// TODO Auto-generated method stub
		return ticketRepository.save(entity);
	}

	@Override
	public Optional<Ticket> findById(Integer id) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(id);
	}

	@Override
	public Ticket findTicketByNumber(String number) {
		// TODO Auto-generated method stub
		return ticketRepository.findTicketByNumber(number);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return ticketRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return ticketRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(id);
	}

	@Override
	public void delete(Ticket entity) {
		// TODO Auto-generated method stub
		ticketRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Ticket> entities) {
		// TODO Auto-generated method stub
		ticketRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		ticketRepository.deleteAll();
	}

	@Override
	public <S extends Ticket> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return ticketRepository.findOne(example);
	}

	@Override
	public <S extends Ticket> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return ticketRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Ticket> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return ticketRepository.count();
	}

	@Override
	public <S extends Ticket> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return ticketRepository.exists(example);
	}

}