package org.bruyere.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Station {

    @Id
    private Integer id;
    private String name;

}
