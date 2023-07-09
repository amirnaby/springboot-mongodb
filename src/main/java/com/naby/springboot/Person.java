package com.naby.springboot;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Person {
    @Id
    private String id;
    private String name;
    private String family;
    @Indexed(unique = true)
    private Integer nationalCode;
    private List<Car> myCars;

    public Person(String name, String family, Integer nationalCode, List<Car> myCars) {
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.myCars = myCars;
    }
}