<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author maewaranya
 */
public class Vocabulary {
    private String word;

    public Vocabulary() {
    }
    
    
    
    public Connection connectionBuilder() throws SQLException, ClassNotFoundException{
        Properties p = new Properties();
        p.setProperty("URL", "jdbc:mysql://wheelshared.cb93cu4k2yln.us-west-2.rds.amazonaws.com:3306/wheelshared");
        p.setProperty("USERNAME","adminwheelshared");
        p.setProperty("PASSWORD","letsgoinside");
        
        Connection connection = null;

        // the mysql driver string
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("after com.mysql.jdbc.Driver");
        // the mysql url

        // get the mysql database connection
        connection = DriverManager.getConnection(p.getProperty("URL")+"?user="+p.getProperty("USERNAME")+"&password="+p.getProperty("PASSWORD"));
        
        // now do whatever you want to do with the connection
        // ...
        return connection;
    }
    
    public String getVocab(Connection con) throws SQLException{
//    public String getVocab() throws SQLException{
                Statement statement = con.createStatement();
                System.out.println("after con.createStatement()");
        // Result set get the result of the SQL query
        ResultSet resultSet = statement.executeQuery("select greeting from wheelshared.greeting;");
        String vocab = new String();
        System.out.println("after statement.executeQuery");
        int i=0;
        while (resultSet.next()) {
            vocab = resultSet.getString("greeting");
            System.out.println("Vocaburary: " + vocab);
        }
        con.close();
        return vocab;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author maewaranya
 */
public class Vocabulary {
    private String word;

    public Vocabulary() {
    }
    
    
    
    public Connection connectionBuilder() throws SQLException, ClassNotFoundException{
        Properties p = new Properties();
        p.setProperty("URL", "jdbc:mysql://localhost:3306/greetingdb?zeroDateTimeBehavior=convertToNull");
        p.setProperty("USERNAME","root");
        p.setProperty("PASSWORD","1234");
        
        Connection connection = null;

        // the mysql driver string
        Class.forName("com.mysql.jdbc.Driver");

        // the mysql url

        // get the mysql database connection
        connection = DriverManager.getConnection(p.getProperty("URL"),p.getProperty("USERNAME"), p.getProperty("PASSWORD"));

        // now do whatever you want to do with the connection
        // ...
        return connection;
    }
    
    public String getVocab(Connection con) throws SQLException{
                Statement statement = con.createStatement();
        // Result set get the result of the SQL query
        ResultSet resultSet = statement.executeQuery("select vocabulary from GREETINGDB.VOCABULARY;");
        String vocab = new String();
        int i=0;
        while (resultSet.next()) {
            vocab = resultSet.getString("VOCABULARY");
            System.out.println("Vocaburary: " + vocab);
        }
        return vocab;
    }
    
    
}

