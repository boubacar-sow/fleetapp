package com.springboot.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "id")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CommonObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String details;
}
