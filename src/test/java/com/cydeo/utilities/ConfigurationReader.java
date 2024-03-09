package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create object of Properties
    private static Properties properties= new Properties();

    static {

        try {
            //2- We need to open the file in the Java memory using FileInputStream
            FileInputStream file =new FileInputStream("configuration.properties");

            //3- Load the properties file in the Properties object
            properties.load(file);

            file.close();
        } catch (IOException e) {
            System.out.println("File Not Found Given Path!!!");
            e.printStackTrace();
        }
    }

    //create a utility method to use the object to read
    //4- User the "properties" object to read value from the file

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);

    }
}
