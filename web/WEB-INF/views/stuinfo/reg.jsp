<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/19
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
    <style>
        .aa{
            color: red;
            border: 1px red dotted;
        }
    </style>
</head>
<body>
<form:form action="${ctx}/reg/save" method="post" modelAttribute="stu">
    <%--<label>姓名</label><form:input path="stuname"></form:input>--%>
    <label>姓名</label><form:input path="stuname"></form:input><form:errors path="stuname" cssClass="aa"></form:errors>
    <label>密码</label><form:password path="stucode"></form:password><form:errors path="stucode" cssClass="aa"></form:errors>
    <form:radiobuttons path="sexCode.sexCode" items="${sex_list}" itemLabel="SexName" itemValue="sexCode"></form:radiobuttons><form:errors path="sexCode" cssClass="aa"></form:errors>
    <input type="submit"/>
</form:form>
</body>
</html>
