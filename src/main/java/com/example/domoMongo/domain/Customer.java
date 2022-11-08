package com.example.domoMongo.domain;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    private int customerId;
    private String Name, email;
    private Address address;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}


