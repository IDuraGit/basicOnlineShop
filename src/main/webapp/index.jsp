<%-- 
    Document   : index
    Created on : 08-oct-2016, 16:16:32
    Author     : Isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form  action="Controller">


            <input type="submit" name="ViewAll" value="View Articles from Catalog">

        </form>

        <form method= "GET" action="Controller">

            <label for="Add"></label>
            <select name="Add" size="1" id="Add">
                <option value="Silk" selected>Silk</option>
                <option value="bobinet">bobinet</option>
                <option value="burlap">burlap</option>
                <option value="benaras">benaras</option>
                <option value="batik">batik</option>
                <option value="batiste">batiste</option>
                <option value="jute">jute</option>
                <option value="jersey">jersey</option>
                <option value="knit">knit</option>

            </select>
            <input type="submit" name="Add"  value="Add Article to cart"></td></tr>

        </form>

        <form method= "GET" action="Controller">


            <input type="submit" name="cartContent"  value=" See cart content"></td></tr>

        </form>

      <form method= "GET" action="Controller">

        <label for="ViewArticle"></label>
        <select name="ViewArticle" size="1" id="ViewArticle">
            <option value="Silk" selected>Silk</option>
            <option value="bobinet">bobinet</option>
            <option value="burlap">burlap</option>
            <option value="benaras">benaras</option>
            <option value="batik">batik</option>
            <option value="batiste">batiste</option>
            <option value="jute">jute</option>
            <option value="jersey">jersey</option>
            <option value="knit">knit</option>

        </select>
        <input type="submit" name="ViewArticle"  value="View article"></td></tr>

    </form>

        <form method= "GET" action="Controller">


        <input type="submit" name="watchList"  value=" See WatchList"></td></tr>

    </form>

<a href="remove.jsp">Remove article from cart</a>
    </body>
</html>

