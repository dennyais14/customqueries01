package co.develhope.cusyquery01.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "description")
    private String description;

    @Column(nullable = false, name = "fromAirport")
    private String fromAirport;

    @Column(nullable = false, name = "to_airport")
    private String toAirport;

    @Enumerated(EnumType.STRING)
    private FlightStatus status = FlightStatus.ON_TIME;
}
