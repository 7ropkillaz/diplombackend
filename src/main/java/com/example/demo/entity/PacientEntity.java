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
@Table(name = "pacient")
public class PacientEntity {
    @Id
    @Column
    private Long id;

    @Column(name = "code")
    private String code;
    @Column(name = "diagnosis")
    private String diagnosis;


}
