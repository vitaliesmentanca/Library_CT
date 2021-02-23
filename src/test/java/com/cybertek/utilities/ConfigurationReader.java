package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    /* In this class we will implement the repeated steps of reading
    from configuration.properties file*/

    //1.Create the object of properties
    private  static Properties properties =new Properties();
    static {
        //2.Get the path and open the file
        try {
            //3- we need to open the file.
            //2- get the path and store in String, or directly pass into fileInputStream obj
            //String ^path = "configuration.properties";
            FileInputStream file=new FileInputStream("configuration.properties");//<-- ^path
            //3.Load the opened file into properties object
            properties.load(file);
            //closing the file in JVM Memory
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 4.Use the object to read from the configuration .properties file
    public  static String getProperty(String keyWord){
        return  properties.getProperty(keyWord);
    }
}
