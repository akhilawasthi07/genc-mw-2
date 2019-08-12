package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.mapping.License;

public interface LicenseRepository extends CrudRepository<License, Integer>{

}
