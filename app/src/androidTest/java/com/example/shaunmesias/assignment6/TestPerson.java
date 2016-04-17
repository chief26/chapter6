package com.example.shaunmesias.assignment6;

import com.example.shaunmesias.assignment6.Factories.PersonImpl.PersonFactoryImpl;

import junit.framework.TestCase;

import org.junit.Assert;

/**
 * Created by Shaun Mesias on 2016/04/17.
 */
public class TestPerson extends TestCase {
    PersonFactoryImpl personFactoryImpl;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        personFactoryImpl = PersonFactoryImpl.getPersonInstance();
    }

    public void testPerson() throws Exception {

        Person john = personFactoryImpl.createPerson("Shaun", "Cape Town", "BMW", "Sedan", "0730006856");
        Person joey = personFactoryImpl.createPerson("Shaun", "Cape Town", "BMW", "Sedan", "0730016856");
        Assert.assertEquals(john.getType(), "Sedan");
        Assert.assertEquals(john.getId(), 1);
        Assert.assertEquals(joey.getId(), 2);
    }
}
