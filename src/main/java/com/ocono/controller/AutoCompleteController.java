package com.ocono.controller;

import com.ocono.entity.City;
import com.ocono.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
class AutoCompleteController {
    @Autowired
    private CityService cityService;

    @RequestMapping(method = RequestMethod.GET, path = "/autocomplete")
    public List<City> autoComplete(@RequestParam(value = "name") String cityName) {
        return cityService.suggestCitiesWithName(cityName);

    }
}