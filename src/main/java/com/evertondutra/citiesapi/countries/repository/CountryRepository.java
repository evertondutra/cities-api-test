package com.evertondutra.citiesapi.countries.repository;

import com.evertondutra.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
