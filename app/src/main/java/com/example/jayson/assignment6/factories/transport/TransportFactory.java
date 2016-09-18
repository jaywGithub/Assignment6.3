package com.example.jayson.assignment6.factories.transport;

import com.example.jayson.assignment6.domain.transport.Express1;
import com.example.jayson.assignment6.domain.transport.Express2;
import com.example.jayson.assignment6.domain.transport.Regular;
import com.example.jayson.assignment6.domain.transport.Transport;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class TransportFactory {

    public static Transport getTransport(String type)
    {
        return new Transport.Builder()
                .type(type)
                .build();
    }
}
