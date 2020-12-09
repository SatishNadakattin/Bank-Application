package com.app.bankapplication.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.bankapplication.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer>{

}
