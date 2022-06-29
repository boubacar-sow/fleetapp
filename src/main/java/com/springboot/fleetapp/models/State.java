package com.springboot.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "country")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class State {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String capital;
    private String code;

    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;

    private Long country_id;

    private String details;

}
