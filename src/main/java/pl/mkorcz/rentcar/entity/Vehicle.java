package pl.mkorcz.rentcar.entity;


import pl.mkorcz.rentcar.enums.CarBodyStyle;
import pl.mkorcz.rentcar.enums.Colors;
import pl.mkorcz.rentcar.enums.Status;

import javax.persistence.*;

@Entity(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    @Column(name = "carBodyStyle")
    private String carBodyStyle;
    @Column(name = "yearOfManufacture")
    private String yearOfManufacture;
    private String color;
    @Column(name = "regNumber")
    private String regNumber;
    @Column(name = "vehicleMileage")
    private String vehicleMileage;
    private String status;
    @Column(name = "price")
    private float pricePerDay;

    public Vehicle() {

    }

    public Vehicle(Long id, String brand, String model, String carBodyStyle, String yearOfManufacture, String color, String regNumber, String vehicleMileage, String status, float pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.carBodyStyle = carBodyStyle;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.regNumber = regNumber;
        this.vehicleMileage = vehicleMileage;
        this.status = status;
        this.pricePerDay = pricePerDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarBodyStyle() {
        return carBodyStyle;
    }

    public void setCarBodyStyle(String carBodyStyle) {
        this.carBodyStyle = carBodyStyle;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(String vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}