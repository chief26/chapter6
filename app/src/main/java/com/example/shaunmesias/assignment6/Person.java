package com.example.shaunmesias.assignment6;

import com.example.shaunmesias.assignment6.ValueObjects.VehicleDetails;

/**
 * Created by Shaun Mesias on 2016/04/12.
 */
public class Person {
    private long id;
    private String name;
    private String location;
    private VehicleDetails vehicleDetails;
    private String number;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getType(){
        return vehicleDetails.getVehicleType();
    }

    public String getVehicleName(){
        return vehicleDetails.getVehicleName();
    }

    public String getNumber() {
        return number;
    }

    public Person() {
    }

    private Person(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.location = builder.location;
        this.vehicleDetails = builder.vehicle;
        this.number = builder.number;
    }

    public static class Builder{
        private long id;
        private String name;
        private String location;
        private VehicleDetails vehicle;
        private String number;

        public Builder id(long value){
            this.id = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder location(String value){
            this.location = value;
            return this;
        }

        public Builder vehicleDetails(String value1, String value2){
            this.vehicle = new VehicleDetails(value1, value2);
            return this;
        }

        public Builder number(String value){
            this.number = value;
            return this;
        }

        public Builder copy(Person person) {
            this.id = person.id;
            this.location = person.location;
            this.name = person.name;
            this.vehicle = person.vehicleDetails;
            this.number = person.number;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }
}
