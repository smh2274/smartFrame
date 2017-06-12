package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Bran-Shi on 6/12/2017.
 */
public class PropsUtil {
    private static final Logger LOGGER= LoggerFactory.getLogger(PropsUtil.class);
    public static Properties loadProps(String fileName) {
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(inputStream==null) {
                throw new FileNotFoundException("file not found");
            }
            properties = new Properties();
            properties.load(inputStream);
        }catch (IOException e){
            LOGGER.error("load properties failure",e);
        }finally {
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    LOGGER.error("input stream close failure",e);
                }
            }
        }
        return properties;
    }
}
