<%@ page import="java.util.List" %>
<%@ page import="com.neusoft.entity.Emp" %><%--
  Created by IntelliJ IDEA.
  User: CMC
  Date: 2023/6/7
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
<%
    List<Emp> list = (List<Emp>) request.getAttribute("empList");
    for(Emp emp :list){
    %>
      <li>
<!--     Controller方法之间的互相调用通过其对应URL来实现-->
          <!--<a href="/emp/query?id=<%=emp.getId()%>">-->
          <!--Restful风格传参-->
          <a href="/emp/query/<%=emp.getId()%>">
         <%=emp.getEname()%>
          </a>
      </li>
    <%
    }
%>
</ul>
<input type="button" value="add" onclick="addEmp()">
</body>
</html>
<script>
    function addEmp(){
        window.location.href="/emp/dept";
    }
</script>

