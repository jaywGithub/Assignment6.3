package com.example.jayson.assignment6.factories.destination;

import com.example.jayson.assignment6.domain.destination.Branch;
import com.example.jayson.assignment6.domain.destination.BranchAddress;


import junit.framework.Assert;

import org.junit.Test;

import java.util.HashMap;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class BranchFactoryTest {
    @Test
    public void testCreate() throws Exception
    {
        BranchAddress branchAddress = new BranchAddress.Builder()
                .cityName("Durban")
                .areaName("Beach")
                .areaCode("123")
                .build();

        HashMap<String, String> values = new HashMap<>();
        values.put("name", "D4");
        Branch branch = BranchFactory.getBranch(values, branchAddress);

        Assert.assertEquals("D4", branch.getName());
    }

    @Test
    public void testUpdate() throws Exception
    {

        BranchAddress branchAddress = new BranchAddress.Builder()
                .cityName("Durban")
                .areaName("Beach")
                .areaCode("123")
                .build();

        HashMap<String, String> values = new HashMap<>();
        values.put("name", "D4");
        Branch branch = BranchFactory.getBranch(values, branchAddress);

        Branch newBranch = new Branch
                .Builder()
                .copy(branch)
                .name("D7")
                .build();

        Assert.assertEquals("D7", newBranch.getName());
    }
}
