package com.example.cameldemo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyFileProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String fileContent = exchange.getIn().getBody(String.class);
        exchange.getIn().setBody(fileContent.toUpperCase());
    }
}
