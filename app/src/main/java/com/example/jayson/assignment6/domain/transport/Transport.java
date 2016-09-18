package com.example.jayson.assignment6.domain.transport;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class Transport{

    private Long id;
    private String type;

    public Transport(String t){
        type = t;
    }

    public Long getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public Transport(Transport.Builder builder)
    {
        this.id = builder.id;
        this.type = builder.type;
    }

    public static class Builder
    {
        private Long id;
        private String type;

        public Transport.Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Transport.Builder type(String value)
        {
            this.type = value;
            return this;
        }

        public Transport.Builder copy(Transport value)
        {
            this.id = value.id;
            this.type = value.type;

            return this;
        }

        public Transport build()
        {
            return new Transport(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        return id != null ? id.equals(transport.id) : transport.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
