package com.example.DataTransfer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class Actor {
    @JsonProperty("actor_id")
    private int actor_id;

    @NotBlank
    @JsonProperty("first_name")
    private String first_name;

    @NotBlank
    @JsonProperty("last_name")
    private String last_name;

    @NotBlank
    @JsonProperty("last_update")
    private String last_update;

    public Actor(int id,String first_name,String last_name,String last_update){
        this.actor_id=id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.last_update=last_update;

    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString(){
        return "Actor{"+
                "Actor_id = '"+actor_id+'\''+
                ", First Name = '" + first_name + '\''+
                ", Last Name = '" + last_name + '\''+
                ", Last Update = '" + last_update + '\''+
                '}';
    }
}

