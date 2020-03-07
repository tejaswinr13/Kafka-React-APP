package com.knittech.kafkaproducerconsumer.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String city;

    public Address() {
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
