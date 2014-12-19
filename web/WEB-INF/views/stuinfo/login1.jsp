<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/19
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
    <style>
        .errorClass{
            color: red;
            font-family: "微软雅黑";
        }
    </style>
</head>
<body>
<form:form action="${ctx}/b/b1" modelAttribute="stu" method="post">
    <label>姓名</label><form:input path="stuname"></form:input><form:errors cssClass="errorClass" path="stuname"></form:errors>
    <label>密码</label><form:input path="stuid"></form:input><form:errors cssClass="errorClass" path="stuid"></form:errors>
    <input type="submit"/>
</form:form>
</body>
</html>
