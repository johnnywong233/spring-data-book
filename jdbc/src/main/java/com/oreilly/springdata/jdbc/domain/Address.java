package com.oreilly.springdata.jdbc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address extends AbstractEntity {
    private String street, city, country;
}
