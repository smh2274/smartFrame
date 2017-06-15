package helper;

import util.PropsUtil;

import java.util.Properties;

/**
 * Created by Bran-Shi on 6/12/2017.
 * 文件助手类
 */
public class ConfigHelper {
    public static final Properties CONFIG_PROPS= PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     */
    public static String getJdbcDriver(){
        return CONFIG_PROPS.getProperty(ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获得URL
     */
    public static String getJdbcUrl(){
        return CONFIG_PROPS.getProperty(ConfigConstant.JDBC_URL);
    }
    /**
     * 获得用户名
     */
    public static String getJdbcUsername(){
        return CONFIG_PROPS.getProperty(ConfigConstant.JDBC_USERNAME);
    }
    /**
     * 获得密码
     */
    public static String getJdbcPassword(){
        return  CONFIG_PROPS.getProperty(ConfigConstant.JDBC_PASSWORD);
    }
    /**
     * 获得基础包名
     */

}
