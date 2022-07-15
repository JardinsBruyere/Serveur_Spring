package org.bruyere.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class SensorReading {

    @Id
    private Integer id;
    private int sensorId;
    private Date dateAdded;
    private int value;

}
