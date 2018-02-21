/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author OWNER
 */
public class User {

    private int userId;
    private String name;
    private String lname;
    private String address;
    private String tel;
    private String email;
    private String password;
    private Boolean online;
    private int provinceId;
    private int subDistinctId;
    private int distinctId;
    private String zipcode;

    // Log In Method return true if logging in is success. 
    // Log In Method return false if logging in is failure.
    public boolean logIn(String email, String password) throws SQLException, ClassNotFoundException {
        if (false) {
            Connection con = ConnectionBuilder.connectionBuilder();

            String getPasswordSQL = "select password from wheelshareddatabase.User where email=" + email + ";";
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery(getPasswordSQL);
            String DBPassword = null;
            while (rs.next()) {
                DBPassword = rs.getString("password");
            }
            if (DBPassword.equals(null) || DBPassword.equals("")) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public int updateOnlineStatusToOnline(HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        int status = this.setOnlineToDB(true, req);
        User user = ((User) session.getAttribute("User"));
        user.setOnline(true);
        session.setAttribute("User", user);
        return status;
    }

    public int updateOnlineStatusToOffline(HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        int status = this.setOnlineToDB(false, req);
        User user = ((User) session.getAttribute("User"));
        session.setAttribute("User", user);
        user.setOnline(false);
        return status;
    }

    //SETTER TO DB
    public int setNameToDB(String name, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set name=" + name + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;

    }

    public int setLnameToDB(String lname, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set lname=" + lname + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setAddressToDB(String address, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set address=" + address + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setTelToDB(String tel, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set tel=" + tel + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setEmailToDB(String email, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set address=" + email + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setPasswordToDB(String password, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set password=" + password + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setOnlineToDB(boolean onlineStatus, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set online=" + onlineStatus + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setProvinceIdToDB(int proId, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set online=" + proId + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setSubDistinctIdToDB(int subDisId, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set online=" + subDisId + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setDistinctIdToDB(int disId, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set online=" + disId + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setZipcodeToDB(int zipCode, HttpServletRequest req) throws SQLException, ClassNotFoundException {
        HttpSession session = req.getSession();
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.User set online=" + zipCode + " where userId=" + ((User) session.getAttribute("user")).getUserId() + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    //GETTER
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getOnline() {
        return online;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public int getSubDistinctId() {
        return subDistinctId;
    }

    public int getDistinctId() {
        return distinctId;
    }

    public String getZipcode() {
        return zipcode;
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setSubDistinctId(int subDistinctId) {
        this.subDistinctId = subDistinctId;
    }

    public void setDistinctId(int distinctId) {
        this.distinctId = distinctId;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUserDataByEmail(String email) throws SQLException, ClassNotFoundException {
        User user = new User();//new ReceiverPost(topic, id, image, statement, id, id, id, address);
        if (false) {
            Connection con = ConnectionBuilder.connectionBuilder();
            Statement s = con.createStatement();
            ResultSet resultSet = s.executeQuery("select * from wheelshareddatabase.User where email=" + email + ";");

            //Test processing position after statement.executeQuery
            System.out.println("test after statement.executeQuery");

            //Use While Loop to get result
            while (resultSet.next()) {
                user.setName(resultSet.getString("name"));
                user.setLname(resultSet.getString("lname"));
                user.setAddress(resultSet.getString("address"));
                user.setDistinctId(resultSet.getInt("distinctId"));
                user.setProvinceId(resultSet.getInt("provinceId"));
                user.setSubDistinctId(resultSet.getInt("distincId"));
                user.setEmail(resultSet.getString("email"));
                user.setUserId(resultSet.getInt("userId"));
                user.setZipcode(resultSet.getString("zipcode"));
                user.setOnline(resultSet.getBoolean("online"));
                System.out.println("ToString User: " + user);
            }
        }
        user.setName("Nitiphong");
        user.setAddress("579/39 The connect11 ซอยสุขสวัสดิ์26");
        user.setDistinctId(1);
        user.setSubDistinctId(1);
        user.setProvinceId(1);
        user.setEmail("popotemut@hotmail.com");
        user.setLname("Ampichit");
        user.setOnline(true);
        user.setTel("0957758155");
        user.setZipcode("10150");
        user.setUserId(1);
        return user;
    }

}
