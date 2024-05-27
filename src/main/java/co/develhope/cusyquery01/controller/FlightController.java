package co.develhope.cusyquery01.controller;

import co.develhope.cusyquery01.entity.Flight;
import co.develhope.cusyquery01.entity.FlightStatus;
import co.develhope.cusyquery01.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/provision")
    public void provisionFlights() {
        Random random = new Random();
        IntStream.range(0, 50).forEach(i -> {
            Flight flight = new Flight();
            flight.setDescription(String.valueOf(random.ints()));
            flight.setFromAirport(String.valueOf(random.ints()));
            flight.setToAirport(String.valueOf(random.ints()));
            flight.setStatus(FlightStatus.ON_TIME);
            flightRepository.save(flight);
        });
    }

    @GetMapping("/all")
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
}
