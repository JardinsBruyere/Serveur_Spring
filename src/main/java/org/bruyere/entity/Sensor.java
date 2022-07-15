package org.bruyere.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Sensor {

    @Id
    private Integer id;
    private int types;
    private Date dateAdded;
    private int station;
    private String nom;

}
