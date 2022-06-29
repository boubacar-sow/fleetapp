package com.springboot.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "country")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "capital")
    private String capital;

    @Column(name = "description")
    private String description;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "continent")
    private String continent;



}
