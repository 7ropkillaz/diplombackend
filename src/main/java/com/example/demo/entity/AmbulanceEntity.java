package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "ambulance")
public class AmbulanceEntity {
@Column(name = "name")
    private String name;
@Column(name = "street")
    private String street;
@Column(name = "city")
    private String city;
    @Id
    private Long id;


}
