package com.ocono.repository;

import com.ocono.entity.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CityAutoCompleteRepository extends ElasticsearchRepository<City, String> {
    List<City> findByName(String name);
}

