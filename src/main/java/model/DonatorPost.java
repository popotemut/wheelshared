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
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author OWNER
 */
public class DonatorPost {

    String name;//เก็บเป็นสตริง
    int categoryId;//เก็บเป็น int
    String image;//เก็บเป็น link
    String statement;//เก็บเป็นสตริง
    int provinceId;//เก็บเป็น Id ให้ไป query ใน DB เอา
    int subDistinctId;//เก็บเป็น Id ให้ไป query ใน DB เอา
    int distinctId;//เก็บเป็น Id ให้ไป query ใน DB เอา
    String address;//เก็บเป็นสตริง
    Timestamp datetime;

    public DonatorPost(String topic, int categoryId, String image, String statement, int provinceId, int subDistinctId, int distinctId, String address) throws SQLException, ClassNotFoundException {
        this.name = topic;
        this.categoryId = categoryId;
        if (image == null | image.equals("")) {
            image = this.getLinkDefaultImage(categoryId);
        }
        this.image = image;
        this.statement = statement;
        this.provinceId = provinceId;
        this.subDistinctId = subDistinctId;
        this.distinctId = distinctId;
        this.address = address;
        this.createNewDonatorPost(this);
    }

    //GETTER
    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getImage() {
        return image;
    }

    public String getStatement() {
        return statement;
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

    public String getAddress() {
        return address;
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStatement(String statement) {
        this.statement = statement;
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

    public void setAddress(String address) {
        this.address = address;
    }

    //GETTER FROM DB
    public String getNameFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select name from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        String name = null;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            name = resultSet.getString("name");
            //Test Processing: test get address variable value
            System.out.println("this name: " + name);
        }
        return name;
    }

    public int getCategoryIdFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select categoryId from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        int categoryId = 0;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            categoryId = resultSet.getInt("categoryId");
            //Test Processing: test get address variable value
            System.out.println("this categoryId: " + categoryId);
        }
        return categoryId;
    }

    public String getImageFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select image from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        String image = null;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            image = resultSet.getString("image");
            //Test Processing: test get address variable value
            System.out.println("this statement: " + image);
        }
        return image;
    }

    public String getStatementFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select statement from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        String statement = null;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            statement = resultSet.getString("statement");
            //Test Processing: test get address variable value
            System.out.println("this statement: " + statement);
        }
        return statement;
    }

    public int getProvinceIdFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select provinceId from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        int provinceId = 0;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            provinceId = resultSet.getInt("provinceId");
            //Test Processing: test get address variable value
            System.out.println("this provinceId: " + provinceId);
        }
        return provinceId;
    }

    public int getSubDistinctIdFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select subDistinctId from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        int subDistinctId = 0;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            subDistinctId = resultSet.getInt("subDistinctId");
            //Test Processing: test get address variable value
            System.out.println("this Sub-DistinctId: " + subDistinctId);
        }
        return subDistinctId;
    }

    public int getDistinctIdFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select distincId from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        int distinctId = 0;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            distinctId = resultSet.getInt("distincId");
            //Test Processing: test get address variable value
            System.out.println("this distincId: " + distinctId);
        }
        return distinctId;
    }

    public String getAddressFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select address from wheelshareddatabase.DonatorPost where donatorPostId=" + postId + ";");

        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        String address = new String();

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            address = resultSet.getString("address");
            //Test Processing: test get address variable value
            System.out.println("this address: " + address);
        }
        return address;
    }

    //SETTER TO DB
    public int setNameToDB(String name, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set name=" + name + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setCategoryIdToDB(int categoryId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set categoryId=" + categoryId + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setImageToDB(String image, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set image=" + image + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setStatementToDB(String statement, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set statement=" + statement + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setProvinceIdToDB(int provinceId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set provinceId=" + provinceId + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setSubDistinctIdToDB(int subProvinceId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set subDistinctId=" + subProvinceId + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setDistinctIdToDB(int distinctId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set distinctId=" + distinctId + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setAddressToDB(String address, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.DonatorPost set address=" + address + " where donatorId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public String getLinkDefaultImage(int categoryId) throws SQLException, ClassNotFoundException {
        String link = "";
        //select imagelink from Category where categoryId=categoryId;

        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select imagelink from wheelshareddatabase.Category where categoryId=" + categoryId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            link = resultSet.getString("image");
            //Test Processing: test get address variable value
            System.out.println("this link: " + link);
        }

        return link;
    }

    public int createNewDonatorPost(DonatorPost dntp) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();

        Timestamp datetime = null;

        if (dntp.getImage().equals(null) || dntp.getImage().equals("")) {
            dntp.setImage(dntp.getLinkDefaultImage(dntp.getCategoryId()));
        }

        datetime = new Timestamp(System.currentTimeMillis());

        int result = s.executeUpdate("insert table wheelshareddatabase.DonatorPost"
                + "('name','categoryId','image','statement','provinceId','subDistinctId',"
                + "'distinctId','address','datetime')\n   values '" + dntp.getName() + "',"
                + "'" + dntp.getCategoryId() + "','" + dntp.getImage() + "',"
                + "'" + dntp.getStatement() + "' ,'" + dntp.getProvinceId() + "',"
                + "'" + dntp.getSubDistinctId() + "','" + dntp.getDistinctId() + "',"
                + "'" + dntp.getAddress() + "','" + datetime + "';");

        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public List<Integer> listReverseAllDonatorPostId() throws SQLException, ClassNotFoundException {
        List<Integer> listInt = null;
        //SQL to query that Every DonatorPostId order by lastest date
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select donatorPostId from wheelshareddatabase.DonatorPost order by datetime DESC;");

        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Use While Loop to get result
        int i=0;
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            listInt.add(resultSet.getInt("donatorPostId"));
            //Test Processing: test get address variable value
            System.out.println("This value#"+i+" : " + listInt.get(i++));
        }
        return listInt;
    }

    public DonatorPost getDonatorPostById(int id) throws SQLException, ClassNotFoundException {
        //SQL to query something (topic+id+image+statement+id+id+id+address) where id เก็บทุกค่าใส่ตัวแปร
        DonatorPost dntp = null;//new DonatorPost(topic, id, image, statement, id, id, id, address);
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select * from wheelshareddatabase.DonatorPost where donatorPostId="+id+";");

        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Use While Loop to get result
        while (resultSet.next()) {
            dntp.setName(resultSet.getString("name"));
            dntp.setCategoryId(resultSet.getInt("categoryId"));
            dntp.setImage(resultSet.getString("image"));
            dntp.setStatement(resultSet.getString("statement"));
            dntp.setProvinceId(resultSet.getInt("provinceId"));
            dntp.setSubDistinctId(resultSet.getInt("subDistincId"));
            dntp.setDistinctId(resultSet.getInt("distincId"));
            dntp.setAddress(resultSet.getString("address"));
            System.out.println("ToString Donator Post Id: " + dntp);
        }
        return dntp;
    }
}
