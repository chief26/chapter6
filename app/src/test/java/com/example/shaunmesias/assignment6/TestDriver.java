package com.example.shaunmesias.assignment6;

import com.example.shaunmesias.assignment6.Factories.DriverFactory;
import com.example.shaunmesias.assignment6.Factories.DriverImpl.DriverFactoryImpl;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Shaun Mesias on 2016/04/17.
 */
public class TestDriver{
    DriverFactoryImpl driverFactoryImpl;
    DriverFactory driverFactory;

    @Before
    public void setUp() throws Exception {
        driverFactoryImpl = DriverFactoryImpl.getDriverFactoryInstance();
    }

    @Test
    public void testDriver() throws Exception {
        driverFactory = driverFactoryImpl.getDriverRole("Heavy Vehicle","Shaun","0730006258");
        Assert.assertTrue(driverFactory.towTruckWeightCapacity(2000));
        driverFactory.createDriverDetails("CA323323");
        Assert.assertEquals(driverFactory.getRegistrationNumber(), "CA323323");
        Assert.assertEquals(driverFactory.getType(), "Truck Driver");
    }
}
