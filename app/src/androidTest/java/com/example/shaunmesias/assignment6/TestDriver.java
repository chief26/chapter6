package com.example.shaunmesias.assignment6;

import com.example.shaunmesias.assignment6.Factories.DriverFactory;
import com.example.shaunmesias.assignment6.Factories.DriverImpl.DriverFactoryImpl;

import junit.framework.TestCase;

import org.junit.Assert;

/**
 * Created by Shaun Mesias on 2016/04/17.
 */
public class TestDriver extends TestCase{
    DriverFactoryImpl driverFactoryImpl;
    DriverFactory driverFactory;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        driverFactoryImpl = DriverFactoryImpl.getDriverFactoryInstance();
    }


    public void testDriver() throws Exception {
        driverFactory = driverFactoryImpl.getDriverRole("Heavy Vehicle");
        Assert.assertTrue(driverFactory.towTruckWeightCapacity(2000));
        driverFactory.createDriverDetails("CA323323");
        Assert.assertEquals(driverFactory.getRegistrationNumber(), "CA323323");
        Assert.assertEquals(driverFactory.getType(), "Truck Driver");
    }
}
