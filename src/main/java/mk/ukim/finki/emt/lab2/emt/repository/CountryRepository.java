package mk.ukim.finki.emt.lab2.emt.repository;

import mk.ukim.finki.emt.lab2.emt.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}