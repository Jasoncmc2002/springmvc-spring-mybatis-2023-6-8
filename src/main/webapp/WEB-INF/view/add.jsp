<%@ page import="com.neusoft.entity.Dept" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: CMC
  Date: 2023/6/7
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../../jquery.js"></script>
</head>
<body>
<div>
    Name<input type="text" id="ename">
</div>
<span id="result"></span>
Dept
<select id="deptid">
    <%
        List<Dept> list = (List<Dept>) request.getAttribute("deptList");
        for(Dept dept :list){
    %>
        <%-- 只展示不提交--%>
    <option value="<%=dept.getId()%>"><%=dept.getDname()%></option>
    <%
        }
    %>
</select>
<div>
    id<input type="number" id="eid">
</div>
    <input type="submit" value="Add" id="btn">
<input type="submit" value="Modify" id="btn1">
<input type="submit" value="Delete" id="btn2">

</body>
</html>
<script>
    $(function(){
        $("#btn").click(function (){
            var ename =$("#ename").val();
            var deptid=$("#deptid").val();
            $.ajax({
               url:"/emp/addEmp",
                type:"get",
                data:{
                    ename:ename,
                    deptid:deptid
                },
                success:function (result){
                   // console.log(result);
                 if(result ==0){
                     $("#result").html("<font color='red'>Emp exists!!!</font>");
                 }
                 else{
                     window.location.href="/emp/queryList";
                 }
               }
            });
        });
    });
    $(function(){
        $("#btn1").click(function (){
            var id = $("#eid").val();
            var ename =$("#ename").val();
            var deptid=$("#deptid").val();
            $.ajax({
                url:"/emp/modifyEmp",
                type:"get",
                data:{
                    id:id,
                    ename:ename,
                    deptid:deptid
                },
                success:function (result){
                    // console.log(result);
                    if(result ==0){
                        $("#result").html("<font color='red'>Emp doesn't exist!!!</font>");
                    }
                    else{
                        window.location.href="/emp/queryList";
                    }
                }
            });
        });
    });
    $(function(){
        $("#btn2").click(function (){
            var id = $("#eid").val();
            var ename =$("#ename").val();
            var deptid=$("#deptid").val();
            $.ajax({
                url:"/emp/deleteEmp",
                type:"get",
                data:{
                    id:id,
                    ename:ename,
                    deptid:deptid
                },
                success:function (result){
                    // console.log(result);
                    if(result ==0){
                        $("#result").html("<font color='red'>Emp doesn't exist!!!</font>");
                    }
                    else{
                        window.location.href="/emp/queryList";
                    }
                }
            });
        });
    });
</script>
