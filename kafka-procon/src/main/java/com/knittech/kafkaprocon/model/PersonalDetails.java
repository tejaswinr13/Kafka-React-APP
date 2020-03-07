package com.knittech.kafkaprocon.model;

public class PersonalDetails {

    private Integer id;
    private String name;
    private String dts;
    private Address address;

    public PersonalDetails() {
    }

    public PersonalDetails(Integer id, String name, String dts, Address address) {
        this.id = id;
        this.name = name;
        this.dts = dts;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDts() {
        return dts;
    }

    public void setDts(String dts) {
        this.dts = dts;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dts='" + dts + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
