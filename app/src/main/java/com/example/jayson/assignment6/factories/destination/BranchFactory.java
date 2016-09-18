package com.example.jayson.assignment6.factories.destination;

import com.example.jayson.assignment6.domain.destination.Branch;
import com.example.jayson.assignment6.domain.destination.BranchAddress;

import java.util.Map;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class BranchFactory {

    public static Branch getBranch(Map<String, String> values, BranchAddress branchAddress)
    {
        return new Branch.Builder()
                .name(values.get("name"))
                .branchAddress(branchAddress)
                .build();
    }
}
