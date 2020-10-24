package com.weborders.utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties= new Properties();

    static {
        try{
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("failed to load configuration.properties file!");
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }




}
