<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/21
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <style>
        label{color: red;float: left}
        {margin: 0;padding: 0;}
        div{width:200;float: left;background: gainsboro}
    </style>
</head>
<body>

<div >
    <label>登录状态</label><input type="text" value="<%=session.getAttribute("msg")%>"/>
    <label>登录者姓名</label><input type="text" value="<%=session.getAttribute("msgname")%>"/>
    <c:forEach items="${stu_list}" var="stu">
        <label>姓名</label><input type="text" value="${stu.stuname}"/>
        <label>学号</label><input type="text" value="${stu.stucode}"/>
        <label>性别</label><input type="text" value="${stu.sexCode.sexName}"/>
    </c:forEach>
</div>
</body>
</html>
