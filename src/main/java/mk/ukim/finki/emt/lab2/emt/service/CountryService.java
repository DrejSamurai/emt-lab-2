package mk.ukim.finki.emt.lab2.emt.service;

import mk.ukim.finki.emt.lab2.emt.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();

    Country create(String name, String continent);
}
