package com.evertondutra.citiesapi;

import com.evertondutra.citiesapi.countries.Country;
import com.evertondutra.citiesapi.repository.CountryRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }
}
