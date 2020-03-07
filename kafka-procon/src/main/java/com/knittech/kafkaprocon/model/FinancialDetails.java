package com.knittech.kafkaprocon.model;

public class FinancialDetails {

    private Integer id;
    private float amount;
    private Bank bank;

    public FinancialDetails() {
    }

    public FinancialDetails(Integer id, float amount, Bank bank) {
        this.id = id;
        this.amount = amount;
        this.bank = bank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "FinancialDetails{" +
                "id=" + id +
                ", amount=" + amount +
                ", bank=" + bank.toString() +
                '}';
    }
}
