package com.knittech.kafkaprocon.model;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dts;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    private float amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id")
    private Bank bank;

    public Details() {
    }

    public Details(PersonalDetails personalDetails, FinancialDetails financialDetails) {

        if(personalDetails.getId() == financialDetails.getId()) {
            this.id = personalDetails.getId();
            this.name = personalDetails.getName();
            this.dts = personalDetails.getDts();
            this.address = personalDetails.getAddress();
            this.amount = financialDetails.getAmount();
            this.bank = financialDetails.getBank();
        }else{
            try {
                throw new Exception("Mismatch in id of PersonalDetails and FinancialDetails");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dts='" + dts + '\'' +
                ", address=" + address.toString() +
                ", amount=" + amount +
                ", bank=" + bank.toString() +
                '}';
    }
}
