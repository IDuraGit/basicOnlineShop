<%-- 
    Document   : delete
    Created on : 06-oct-2016, 9:16:40
    Author     : Isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove from cart</title>
    </head>
    <body>
        <% //String fabricDetails[] = request.getAttributeNames("enum");
%>
        <form method= "POST" action="Controller">

            <c:forEach items="${fabricDetails}" var="entry">
                <li>${entry.key} (${entry.value})</li>   

            </c:forEach>


          

                <label for="remove"></label>
                <select name="remove" size="1" id="remove">
                    <option value="Silk" selected>Silk</option>
                    <option value="bobinet">bobinet</option>
                    <option value="burlap">burlap</option>
                    <option value="benaras">benaras</option>
                    <option value="batik">batik</option>
                    <option value="batiste">batiste</option>
                    <option value="jute">jute</option>
                    <option value="jersey">jersey</option>c
                    <option value="knit">knit</option>

                </select>
                <input type="submit" name="remove"  value="Remove Article"></td></tr>

            </form>

            <a href="index.jsp">Listing & add article into cart</a>

        </form>
    </body>
</html>
