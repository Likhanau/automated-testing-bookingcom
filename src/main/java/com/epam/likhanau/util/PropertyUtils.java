package com.epam.likhanau.util;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyUtils {

    private static final Logger log = Logger.getLogger(PropertyUtils.class);

    private final static String PATH_TO_PROPERTIES = "src/main/resources/config.properties";

    public static String getProperties(String param) {
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8")) {
            properties.load(inputStreamReader);
        } catch (IOException e) {
            log.error("Error in properties file ", e);
        }

        if (properties.getProperty(param) == null) {
            log.error("!!! --- Parameter " + param + " is not in file " + PATH_TO_PROPERTIES);
        }

        return properties.getProperty(param);

    }
}
