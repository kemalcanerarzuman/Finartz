package com.kemalcanerarzuman.Finartz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kemalcanerarzuman.Finartz.entities.Route;
import com.kemalcanerarzuman.Finartz.repositories.RouteRepository;

@Service
public class RouteService implements RouteRepository {

	@Autowired
	private RouteRepository routeRepository;

	@Override
	public List<Route> findAll() {
		// TODO Auto-generated method stub
		return routeRepository.findAll();
	}

	@Override
	public List<Route> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return routeRepository.findAll(sort);
	}

	@Override
	public List<Route> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return routeRepository.findAllById(ids);
	}

	@Override
	public <S extends Route> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return routeRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		routeRepository.flush();
	}

	@Override
	public <S extends Route> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return routeRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Route> entities) {
		// TODO Auto-generated method stub
		routeRepository.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		routeRepository.deleteAllInBatch();
	}

	@Override
	public Route getOne(Integer id) {
		// TODO Auto-generated method stub
		return routeRepository.getOne(id);
	}

	@Override
	public <S extends Route> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return routeRepository.findAll(example);
	}

	@Override
	public <S extends Route> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return routeRepository.findAll(example, sort);
	}

	@Override
	public Page<Route> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return routeRepository.findAll(pageable);
	}

	@Override
	public <S extends Route> S save(S entity) {
		// TODO Auto-generated method stub
		return routeRepository.save(entity);
	}

	@Override
	public Optional<Route> findById(Integer id) {
		// TODO Auto-generated method stub
		return routeRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return routeRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return routeRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		routeRepository.deleteById(id);
	}

	@Override
	public void delete(Route entity) {
		// TODO Auto-generated method stub
		routeRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Route> entities) {
		// TODO Auto-generated method stub
		routeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		routeRepository.deleteAll();
	}

	@Override
	public <S extends Route> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return routeRepository.findOne(example);
	}

	@Override
	public <S extends Route> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return routeRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Route> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return routeRepository.count();
	}

	@Override
	public <S extends Route> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return routeRepository.exists(example);
	}

}