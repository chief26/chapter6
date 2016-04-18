package com.example.shaunmesias.assignment6.Factories.DriverImpl;

import com.example.shaunmesias.assignment6.Factories.DriverFactory;
import com.example.shaunmesias.assignment6.TruckDriver;
import com.example.shaunmesias.assignment6.VehicleDriver;

/**
 * Created by Shaun Mesias on 2016/04/12.
 */
public class DriverFactoryImpl {
    private static DriverFactoryImpl driverFactoryImpl = null;

    private DriverFactoryImpl(){}

    public static DriverFactoryImpl getDriverFactoryInstance(){
        if(driverFactoryImpl == null)
            return new DriverFactoryImpl();
        return driverFactoryImpl;
    }

    public DriverFactory getDriverRole(String driver,String name, String number){
        if("Heavy Vehicle".equalsIgnoreCase(driver))
            return new TruckDriver(name, number);
        else
            return new VehicleDriver(name, number);
    }
}
