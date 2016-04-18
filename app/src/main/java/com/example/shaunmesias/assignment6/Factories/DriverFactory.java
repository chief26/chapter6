package com.example.shaunmesias.assignment6.Factories;


/**
 * Created by Shaun Mesias on 2016/04/12.
 */
public interface DriverFactory {
    public boolean towTruckWeightCapacity(int value);
    public void createDriverDetails(String regNum);
    public String getRegistrationNumber();
    public String getType();
    public String getNumber();
}
