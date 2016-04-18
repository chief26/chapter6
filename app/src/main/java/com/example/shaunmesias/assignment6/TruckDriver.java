package com.example.shaunmesias.assignment6;

import com.example.shaunmesias.assignment6.ValueObjects.DriverDetails;
import com.example.shaunmesias.assignment6.Factories.DriverFactory;

/**
 * Created by Shaun Mesias on 2016/04/12.
 */
public class TruckDriver implements DriverFactory{
    private long id;
    private String name;
    private String type = "Truck Driver";
    private DriverDetails dvd;
    private String number;

    public TruckDriver(String name, String number) {
        this.number = number;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }


    @Override
    public void createDriverDetails(String regNum){
        dvd = new DriverDetails(regNum);
    }

    @Override
    public String getRegistrationNumber(){
        return dvd.getRegNumber();
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public boolean towTruckWeightCapacity(int value) {
        if(value > 1500)
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TruckDriver)) return false;

        TruckDriver that = (TruckDriver) o;

        if (id != that.id) return false;
        if (!name.equals(that.name)) return false;
        if (!type.equals(that.type)) return false;
        return dvd.equals(that.dvd);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + dvd.hashCode();
        return result;
    }
}
