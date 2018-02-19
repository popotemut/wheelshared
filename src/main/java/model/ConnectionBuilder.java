/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author OWNER
 */
public class ConnectionBuilder {
    
    public static Connection connectionBuilder() throws SQLException, ClassNotFoundException {

        Properties p = new Properties();
        InputStream input = null;
        Connection connection = null;

        try {
                
            // load the properties file from config.properties
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            input = classLoader.getResourceAsStream("config.properties");
            p.load(input);

            // get the value from the properties
            String url = p.getProperty("CONNECTION") + "://" + p.getProperty("URL") + ":" + p.getProperty("PORT") + "/" + p.getProperty("DB");
            String username = p.getProperty("USERNAME");
            String password = p.getProperty("PASSWORD");

            //print it out
            System.out.println(url + "?user=" + username + "&password=" + password + "&useUnicode=true&characterEncoding=UTF-8");

            //Create connection variable
            // the mysql driver string
            Class.forName(p.getProperty("CLASSFORNAME"));

            //test run after com.mysql.jdbc.Driver
            System.out.println("test run after " + p.getProperty("CLASSFORNAME"));

            // get the mysql database connection
            connection = DriverManager.getConnection(url + "?user=" + username + "&password=" + password + "&useUnicode=true&characterEncoding=UTF-8");

        } catch (IOException ex) {
            System.out.println("IO Exception eiei1");
            ex.printStackTrace();
            return null;
        } finally {
//            if (input != null) {
//                System.out.println("Before input close");
//                input.close();
//            }
            return connection;
        }
    }
}
