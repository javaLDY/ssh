<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
<form action="/stuinfo/testlogin" method="post">
    <label>姓名</label><input type="text" name="stuname" />
    <label>密码</label><input type="text" name="stuid" />
    <input type="submit">
</form>
</body>
</html>
