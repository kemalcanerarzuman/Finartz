package com.kemalcanerarzuman.Finartz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kemalcanerarzuman.Finartz.entities.Flight;
import com.kemalcanerarzuman.Finartz.repositories.FlightRepository;

@Service
public class FlightService implements FlightRepository {

	@Autowired
	private FlightRepository flightRepository;

	@Override
	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}

	@Override
	public List<Flight> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return flightRepository.findAll(sort);
	}

	@Override
	public List<Flight> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return flightRepository.findAllById(ids);
	}

	@Override
	public <S extends Flight> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return flightRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		flightRepository.flush();
	}

	@Override
	public <S extends Flight> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return flightRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Flight> entities) {
		// TODO Auto-generated method stub
		flightRepository.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		flightRepository.deleteAllInBatch();
	}

	@Override
	public Flight getOne(Integer id) {
		// TODO Auto-generated method stub
		return flightRepository.getOne(id);
	}

	@Override
	public <S extends Flight> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return flightRepository.findAll(example);
	}

	@Override
	public <S extends Flight> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return flightRepository.findAll(example, sort);
	}

	@Override
	public Page<Flight> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return flightRepository.findAll(pageable);
	}

	@Override
	public <S extends Flight> S save(S entity) {
		// TODO Auto-generated method stub
		return flightRepository.save(entity);
	}

	@Override
	public Optional<Flight> findById(Integer id) {
		// TODO Auto-generated method stub
		return flightRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return flightRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return flightRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		flightRepository.deleteById(id);
	}

	@Override
	public void delete(Flight entity) {
		// TODO Auto-generated method stub
		flightRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Flight> entities) {
		// TODO Auto-generated method stub
		flightRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		flightRepository.deleteAll();
	}

	@Override
	public <S extends Flight> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return flightRepository.findOne(example);
	}

	@Override
	public <S extends Flight> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return flightRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Flight> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return flightRepository.count();
	}

	@Override
	public <S extends Flight> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return flightRepository.exists(example);
	}

}