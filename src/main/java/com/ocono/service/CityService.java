package com.ocono.service;


import com.ocono.entity.City;
import com.ocono.repository.CityAutoCompleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private CityAutoCompleteRepository cityRepository;

    @Autowired
    public void setCityRepository(CityAutoCompleteRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> suggestCitiesWithName(String city) {
        return cityRepository.findByName(city);
    }
}
