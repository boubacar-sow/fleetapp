package com.springboot.fleetapp.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehiculeType extends CommonObject{


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VehiculeType that = (VehiculeType) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
