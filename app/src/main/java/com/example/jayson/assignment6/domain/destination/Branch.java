package com.example.jayson.assignment6.domain.destination;

import java.io.Serializable;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class Branch implements Serializable {

    private Long id;
    private String name;
    private BranchAddress branchAddress;

    public Branch(){}

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public BranchAddress getBranchAddress()
    {
        return branchAddress;
    }

    public Branch(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.branchAddress = builder.branchAddress;
    }

    public static class Builder
    {
        private Long id;
        private String name;
        private BranchAddress branchAddress;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder branchAddress(BranchAddress value)
        {
            this.branchAddress = value;
            return this;
        }

        public Builder copy(Branch value)
        {
            this.id = value.id;
            this.name = value.name;
            this.branchAddress = value.branchAddress;

            return this;
        }

        public Branch build()
        {
            return new Branch(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        return id != null ? id.equals(branch.id) : branch.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

