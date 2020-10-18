package com.kemalcanerarzuman.Finartz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kemalcanerarzuman.Finartz.entities.Airway;
import com.kemalcanerarzuman.Finartz.repositories.AirwayRepository;

@Service
public class AirwayService implements AirwayRepository {

	@Autowired
	private AirwayRepository airwayRepository;

	@Override
	public List<Airway> findAll() {
		// TODO Auto-generated method stub
		return airwayRepository.findAll();
	}

	@Override
	public List<Airway> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return airwayRepository.findAll(sort);
	}

	@Override
	public List<Airway> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return airwayRepository.findAllById(ids);
	}

	@Override
	public <S extends Airway> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return airwayRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		airwayRepository.flush();
	}

	@Override
	public <S extends Airway> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return airwayRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Airway> entities) {
		// TODO Auto-generated method stub
		airwayRepository.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		airwayRepository.deleteAllInBatch();
	}

	@Override
	public Airway getOne(Integer id) {
		// TODO Auto-generated method stub
		return airwayRepository.getOne(id);
	}

	@Override
	public <S extends Airway> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return airwayRepository.findAll(example);
	}

	@Override
	public <S extends Airway> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return airwayRepository.findAll(example, sort);
	}

	@Override
	public Page<Airway> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return airwayRepository.findAll(pageable);
	}

	@Override
	public <S extends Airway> S save(S entity) {
		// TODO Auto-generated method stub
		return airwayRepository.save(entity);
	}

	@Override
	public Optional<Airway> findById(Integer id) {
		// TODO Auto-generated method stub
		return airwayRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return airwayRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return airwayRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		airwayRepository.deleteById(id);
	}

	@Override
	public void delete(Airway entity) {
		// TODO Auto-generated method stub
		airwayRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Airway> entities) {
		// TODO Auto-generated method stub
		airwayRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		airwayRepository.deleteAll();
	}

	@Override
	public <S extends Airway> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return airwayRepository.findOne(example);
	}

	@Override
	public <S extends Airway> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return airwayRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Airway> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return airwayRepository.count();
	}

	@Override
	public <S extends Airway> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return airwayRepository.exists(example);
	}

}