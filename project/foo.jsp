<%@ page contentType="text/html;charset=UTF-8" %>
<% 
    String param1 = request.getParameter("param1");
    String param2 = request.getParameter("param2");
    int result = 0;
    if(param1 != null && param2 != null) {
        result = Integer.parseInt(param1) + Integer.parseInt(param2);
    }
%>
<html>
    <body>
        <form id=="f1" action="">
            <input type="text" name="param1" value="<%=param1%>">
            +  <input type="text" name="param2" value="<%=param2%>">
            =  <%=result%><br><br>
            <input type="submit" value="calculate">
        </form>
    </body>
</html>
