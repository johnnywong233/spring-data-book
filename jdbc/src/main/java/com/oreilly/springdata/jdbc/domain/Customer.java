package com.oreilly.springdata.jdbc.domain;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Customer extends AbstractEntity {

    private String firstName;
    private String lastName;
    private EmailAddress emailAddress;
    private Set<Address> addresses = new HashSet<>();

    public void clearAddresses() {
        this.addresses.clear();
    }

    public void addAddress(Address address){
        this.addresses.add(address);
    }
}
