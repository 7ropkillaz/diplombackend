package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PacientDto {

    public String getSympthoms() {
        return sympthoms;
    }

    public void setSympthoms(String sympthoms) {
        this.sympthoms = sympthoms;
    }

    @JsonProperty("о1")
    private String sympthoms;

    @JsonProperty("о2")
    private String arg;

}
