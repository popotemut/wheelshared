<%-- 
    Document   : Donator
    Created on : Feb 18, 2018, 11:11:40 PM
    Author     : OWNER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>I'm Donator - WheelShared</title>
    </head>
    <body>
        <h1>Be Donator</h1><br>
        <!--Method ดึงโพสขอรับบริจาคมาแสดง List<Integer> dntpId = session.donatorPostId.showListDonatorPostId อยู่ใน Servlet-->
        <h1>Feeds is coming soon.</h1>

        <!--Refresh Method will call Show Lastest Reciever Post method-->
        <form action="refreshDonator">
        <button name="refresh" type="submit">Refresh</button>
        <input name="thispage" type="hidden" value="1"/>
        </form>
        
        <!--Add Danator Post Method will call Create Donator Post Pop up to let user input data(Topic,Category,Image,Statement,Province,Sub-province,Distinct,Address) and also check syntax by javaScript. After that user click post we are going to call Create Donator Post  -->
        <h1>สมมตินี่เป็น Popup เพิ่มโพสให้บริจาค</h1>
        <form action="createDanator">
            Topic<input name="topic" type="text"/><br>
            Category<input name="category" type="radio"/><br>
            Image<input name="image" type="image"/><br>
            Statement<input name="statement" type="text"/><br>
            Province<input name="provinceId" type="number"/><br>
            Sub-province<input name="subProvinceId" type="number"/><br>
            Distinct<input name="distinctId" type="number"/><br>
            Address<input name="address" type="text"/><br>
            <button type="submit">Submit</button>
        </form>
            <!--Match Method will call Match Popup to let user input data(Category,Province,Sub-Province) and then send it to Match.jsp -->
        <h1>สมมตินี่เป็น Popup เพิ่มโพสให้บริจาค</h1>
        <form action="MatchToReciever"><br>
            Category<input name="category" type="radio"/><br>
            Province<input name="provinceId" type="number"/><br>
            Sub-province<input name="subProvinceId" type="number"/><br>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
