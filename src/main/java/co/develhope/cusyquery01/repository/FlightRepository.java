package co.develhope.cusyquery01.repository;

import co.develhope.cusyquery01.entity.Flight;
import co.develhope.cusyquery01.entity.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByStatus(FlightStatus status);
}
