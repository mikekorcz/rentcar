package pl.mkorcz.rentcar.entity;


import pl.mkorcz.rentcar.enums.CarBodyStyle;
import pl.mkorcz.rentcar.enums.Colors;
import pl.mkorcz.rentcar.enums.Status;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private CarBodyStyle carBodyStyle;
    @Column(nullable = false)
    private String yearOfManufacture;
    @Column(nullable = false)
    private Colors color;
    @Column(nullable = false)
    private String vehicleMileage;
    @Column(nullable = false)
    private Status status;


}
