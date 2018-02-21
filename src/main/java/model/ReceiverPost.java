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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OWNER
 */
public class ReceiverPost {

    String name;//เก็บเป็นสตริง
    int categoryId;//เก็บเป็น int
    String image;//เก็บเป็น link
    String statement;//เก็บเป็นสตริง
    int provinceId;//เก็บเป็น Id ให้ไป query ใน DB เอา
    int subProvinceId;//เก็บเป็น Id ให้ไป query ใน DB เอา
    int distinctId;//เก็บเป็น Id ให้ไป query ใน DB เอา
    String address;//เก็บเป็นสตริง
    Timestamp datetime;

    public ReceiverPost(String topic, int categoryId, String image, String statement, int provinceId, int subProvinceId, int distinctId, String address) throws SQLException, ClassNotFoundException {
        this.name = topic;
        this.categoryId = categoryId;
        if (image == null | image.equals("")) {
            image = this.getLinkDefaultImage(categoryId);
        }
        this.image = image;
        this.statement = statement;
        this.provinceId = provinceId;
        this.subProvinceId = subProvinceId;
        this.distinctId = distinctId;
        this.address = address;
        this.createNewReceiverPost(this);
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
        return subProvinceId;
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

    public void setSubDistinctId(int subProvinceId) {
        this.subProvinceId = subProvinceId;
    }

    public void setDistinctId(int distinctId) {
        this.distinctId = distinctId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }
    
    //GETTER FROM DB
     public Timestamp getDatetimeFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select datetime from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        Timestamp datetime = null;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            datetime = resultSet.getTimestamp("datetime");
            //Test Processing: test get address variable value
            System.out.println("this name: " + datetime);
        }
        return datetime;
    }
    
    public String getNameFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select name from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
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
        ResultSet resultSet = s.executeQuery("select categoryId from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
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
        ResultSet resultSet = s.executeQuery("select image from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
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
        ResultSet resultSet = s.executeQuery("select statement from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
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
        ResultSet resultSet = s.executeQuery("select provinceId from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
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
        ResultSet resultSet = s.executeQuery("select subProvinceId from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Declare address variable to keep the adress in a String data form.
        int subProvinceId = 0;

        //Use While Loop to get result
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            subProvinceId = resultSet.getInt("distincId");
            //Test Processing: test get address variable value
            System.out.println("this distincId: " + subProvinceId);
        }
        return subProvinceId;
    }

    public int getDistinctIdFromDB(int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select distincId from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");
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
        ResultSet resultSet = s.executeQuery("select address from wheelshareddatabase.ReceiverPost where receiverPostId=" + postId + ";");

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
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set name=" + name + " where receiverId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setCategoryIdToDB(int categoryId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set categoryId=" + categoryId + " where receiverId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setImageToDB(String image, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set image=" + image + " where receiverId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setStatementToDB(String statement, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set statement=" + statement + " where receiverId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setProvinceIdToDB(int provinceId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set provinceId=" + provinceId + " where receiverId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setSubDistinctIdToDB(int subProvinceId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set subProvinceId=" + subProvinceId + " where receiverId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setDistinctIdToDB(int distinctId, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set distinctId=" + distinctId + " where receiverId=" + postId + ";");
        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public int setAddressToDB(String address, int postId) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        int result = s.executeUpdate("update wheelshareddatabase.ReceiverPost set address=" + address + " where receiverId=" + postId + ";");
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

    public int createNewReceiverPost(ReceiverPost rcvp) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();

        Timestamp datetime = null;

        if (rcvp.getImage().equals(null) || rcvp.getImage().equals("")) {
            rcvp.setImage(rcvp.getLinkDefaultImage(rcvp.getCategoryId()));
        }

        datetime = new Timestamp(System.currentTimeMillis());

        int result = s.executeUpdate("insert table wheelshareddatabase.ReceiverPost"
                + "('name','categoryId','image','statement','provinceId','subDistinctId',"
                + "'distinctId','address','datetime')\n   values '" + rcvp.getName() + "',"
                + "'" + rcvp.getCategoryId() + "','" + rcvp.getImage() + "',"
                + "'" + rcvp.getStatement() + "' ,'" + rcvp.getProvinceId() + "',"
                + "'" + rcvp.getSubDistinctId() + "','" + rcvp.getDistinctId() + "',"
                + "'" + rcvp.getAddress() + "','" + datetime + "';");

        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeUpdate");
        return result;
    }

    public ArrayList<Integer> listReverseAllReceiverPostId() throws SQLException, ClassNotFoundException {
        ArrayList<Integer> listInt = null;
        listInt.add(0);
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        //SQL to query that Every ReceiverPostId order by lastest date
//        Connection con = ConnectionBuilder.connectionBuilder();
//        Statement s = con.createStatement();
//        ResultSet resultSet = s.executeQuery("select receiverPostId from wheelshareddatabase.ReceiverPost order by datetime DESC;");
//
//        //Test processing position after statement.executeQuery
//        System.out.println("test after statement.executeQuery");
//
//        //Use While Loop to get result
//        int i = 0;
//        while (resultSet.next()) {
//            //get address column and keep it in address variable.
//            listInt.add(resultSet.getInt("receiverPostId"));
//            //Test Processing: test get address variable value
//            System.out.println("This value#" + i + " : " + listInt.get(i++));
//        }
        return listInt;
    }

    public ReceiverPost getReceiverPostById(int id) throws SQLException, ClassNotFoundException {
        //SQL to query something (topic+id+image+statement+id+id+id+address) where id เก็บทุกค่าใส่ตัวแปร
        ReceiverPost rcvp = null;//new ReceiverPost(topic, id, image, statement, id, id, id, address);
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select * from wheelshareddatabase.ReceiverPost where receiverPostId=" + id + ";");

        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Use While Loop to get result
        while (resultSet.next()) {
            rcvp.setName(resultSet.getString("name"));
            rcvp.setCategoryId(resultSet.getInt("categoryId"));
            rcvp.setImage(resultSet.getString("image"));
            rcvp.setStatement(resultSet.getString("statement"));
            rcvp.setProvinceId(resultSet.getInt("provinceId"));
            rcvp.setSubDistinctId(resultSet.getInt("distincId"));
            rcvp.setDistinctId(resultSet.getInt("distincId"));
            rcvp.setAddress(resultSet.getString("address"));
            rcvp.setDatetime(resultSet.getTimestamp("datetime"));
            System.out.println("ToString Receiver Post Id: " + rcvp);
        }
        return rcvp;
    }

    public List<Integer> MatchToDonator(int catId, int provinceId, int subDistrictId) throws SQLException, ClassNotFoundException {
        List<Integer> listInt = null;
        //SQL to query that Every ReceiverPostId order by lastest date
        Connection con = ConnectionBuilder.connectionBuilder();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select donatorPostId from wheelshareddatabase.DonatorPost when categoryId="+catId+" "
                + "to provinceId="+provinceId+" or subDistrictId="+subDistrictId+" order by datetime ASC;");

        //Test processing position after statement.executeQuery
        System.out.println("test after statement.executeQuery");

        //Use While Loop to get result
        int i = 0;
        while (resultSet.next()) {
            //get address column and keep it in address variable.
            listInt.add(resultSet.getInt("receiverPostId"));
            //Test Processing: test get address variable value
            System.out.println("This value#" + i + " : " + listInt.get(i++));
        }
        return listInt;

    }

    
}
