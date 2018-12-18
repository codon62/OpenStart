package org.abc.blockchain;

import java.io.IOException;
//import java.io.InputStream;

import org.apache.log4j.Logger;
import org.abc.blockchain.prop.Prop;
import org.apache.log4j.BasicConfigurator;
import java.util.Properties;

public class App {
    static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();
        Prop myApp = new Prop();

        myApp.loadProperties("/application.properties");
        Properties properties = myApp.getProperties();
        properties.list(System.out);

        myApp.loadProperties("/additional.properties");
        Properties moreProperties = myApp.getProperties();
        properties.putAll(moreProperties);
        properties.list(System.out);

        Properties dummy = new Properties();
        dummy.put("demo.type", "newType");
        dummy.put("demo.temp", "dummy");
        properties.putAll(dummy);
        properties.list(System.out);

        Object type = properties.get("demo.type"); // using Object
        System.out.println(type);
        for (String key : properties.stringPropertyNames()) { // .stringPropertyNames = .keySet 
            String value = properties.getProperty(key);
            System.out.println(value);
        }

        if(properties.containsKey("demo.type")) System.out.println("Key Ok");
        else System.out.println("There is no such a key - demo.type");

        if(properties.containsValue("dummy")) System.out.println("Value Ok");
        else System.out.println("There is no such a key - demo.type");
    }
}
