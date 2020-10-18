package com.kemalcanerarzuman.Finartz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kemalcanerarzuman.Finartz.entities.Airline;
import com.kemalcanerarzuman.Finartz.repositories.AirlineRepository;

@Service
public class AirlineService implements AirlineRepository {

	@Autowired
	private AirlineRepository airlineRepository;

	@Override
	public List<Airline> findAll() {
		// TODO Auto-generated method stub
		return airlineRepository.findAll();
	}

	@Override
	public List<Airline> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return airlineRepository.findAll(sort);
	}

	@Override
	public List<Airline> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return airlineRepository.findAllById(ids);
	}

	@Override
	public <S extends Airline> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return airlineRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		airlineRepository.flush();
	}

	@Override
	public <S extends Airline> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return airlineRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Airline> entities) {
		// TODO Auto-generated method stub
		airlineRepository.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		airlineRepository.deleteAllInBatch();
	}

	@Override
	public Airline getOne(Integer id) {
		// TODO Auto-generated method stub
		return airlineRepository.getOne(id);
	}

	@Override
	public <S extends Airline> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return airlineRepository.findAll(example);
	}

	@Override
	public <S extends Airline> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return airlineRepository.findAll(example, sort);
	}

	@Override
	public Page<Airline> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return airlineRepository.findAll(pageable);
	}

	@Override
	public <S extends Airline> S save(S entity) {
		// TODO Auto-generated method stub
		return airlineRepository.save(entity);
	}

	@Override
	public Optional<Airline> findById(Integer id) {
		// TODO Auto-generated method stub
		return airlineRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return airlineRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return airlineRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		airlineRepository.deleteById(id);
	}

	@Override
	public void delete(Airline entity) {
		// TODO Auto-generated method stub
		airlineRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Airline> entities) {
		// TODO Auto-generated method stub
		airlineRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		airlineRepository.deleteAll();
	}

	@Override
	public <S extends Airline> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return airlineRepository.findOne(example);
	}

	@Override
	public <S extends Airline> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return airlineRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Airline> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return airlineRepository.count();
	}

	@Override
	public <S extends Airline> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return airlineRepository.exists(example);
	}

}