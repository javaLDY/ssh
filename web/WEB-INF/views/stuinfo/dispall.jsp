<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>

    <c:forEach items="${stu_list}" var="stu">
        <label>学号</label>${stu.stuid}
        <label>姓名</label>${stu.stuname}
    </c:forEach>

</body>
</html>
