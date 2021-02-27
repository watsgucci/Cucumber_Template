package com.cybertek_B21.yourNameHere.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties p1 = new Properties();

    static {
        String pathOfConfigurationPropertiesFile = "configuration.properties";

        try {
            FileInputStream f1 = new FileInputStream(pathOfConfigurationPropertiesFile);
            p1.load(f1);
            f1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getValue(String keyName) {
        return p1.getProperty(keyName);
    }


}
