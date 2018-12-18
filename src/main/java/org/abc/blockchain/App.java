package org.abc.blockchain;

import org.abc.blockchain.kafka.*;

import java.io.IOException;
//import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
//import java.util.Properties;

public class App {
    static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();
        Consumer myConsumer = new Consumer();

        myConsumer.loadProperties("/kafka.properties");
    }
}
