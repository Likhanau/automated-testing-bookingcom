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
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream(PATH_TO_PROPERTIES);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            props.load(isr);
        } catch (IOException e) {
            log.error("Error in properties file ", e);
        }

        if (props.getProperty(param) == null) {
            log.error("!!! --- Parameter " + param + " is not in file " + PATH_TO_PROPERTIES);
        }

        return props.getProperty(param);

    }
}
