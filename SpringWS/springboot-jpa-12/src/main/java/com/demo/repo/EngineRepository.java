package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.mapping.Engine;

public interface EngineRepository extends CrudRepository<Engine, Integer>{

}
