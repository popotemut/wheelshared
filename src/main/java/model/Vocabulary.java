package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

    private String vocab;

    public Vocabulary() {
        vocab = null;
    }

    public String getVocab() {
        return this.vocab;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    public String adaptToFileInputStreamPath(String path){
        String newPath=null;
        path+="\\";
        int i=0;
        if(path.indexOf("\\")>=0){
            newPath=path.substring(0, path.indexOf("\\"))+"//";
            System.out.println("New Path#"+ ++i +":"+newPath);
            path=path.substring(path.indexOf("\\")+1, path.length());
            System.out.println("Path:"+path);
        }
    
        while(path.indexOf("\\")>=0){
            newPath=newPath+path.substring(0, path.indexOf("\\"))+"/";
            System.out.println("New Path#"+ ++i +":"+newPath);
            path=path.substring(path.indexOf("\\")+1, path.length());
            System.out.println("Path:"+path);
        }
        
        
        return newPath.substring(0, newPath.length()-1);
            
        }
    
    
    public Connection connectionBuilder() throws SQLException, ClassNotFoundException {

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

    public String getHelloWorldVocab() throws SQLException, ClassNotFoundException {
        String vocab;
        //Create Connection Variable from connectionBuilder Method In try for check that can be access to DB
        try (Connection con = this.connectionBuilder()) {

            //Use Connection Variable to insert DB into statement.
            System.out.println(con);
            Statement statement = con.createStatement();

            //Test processing position after con.createStatement
            System.out.println("test after con.createStatement()");

            // Result set get the result of the SQL query from DB in the statement.
            ResultSet resultSet = statement.executeQuery("select greeting from wheelshareddatabase.GREETING;");

            //Test processing position after statement.executeQuery
            System.out.println("test after statement.executeQuery");

            //Declare vocab variable to keep the greeting vocabulary in a String data form.
            vocab = new String();

            //Use While Loop to get result 1st Greeting Vocabulary from result set of the statement 
            while (resultSet.next()) {
                //get result 1st Greeting Vocabulary by greeting column and keep it in vocab variable.
                vocab = resultSet.getString("greeting");
                //Test Processing: test get vocab variable value
                System.out.println("1st Greeting Vocaburary: " + vocab);
            }
            return vocab;
        } catch (Exception e) {
            return null;
        }
    }

}
