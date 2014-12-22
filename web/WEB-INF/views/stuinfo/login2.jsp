<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/21
  Time: 10:44
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
    <script type="text/javascript">var _path='${ctx}';</script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/validcode.js"></script>
</head>
<body>
    <form:form action="${ctx}/wojiucaole" modelAttribute="stu" method="post">
        <label>姓名</label><form:input path="stuname"></form:input><form:errors path="stuname" cssClass="aa"></form:errors>
        <label>密码</label><form:input path="stucode"></form:input><form:errors path="stucode" cssClass="aa"></form:errors>
        <label>验证码</label><input type="text" name="checknum" maxlength="4"/>
        <img style="height: 21px;padding-top:40px;" src="<%=request.getContextPath()%>/validCode.jsp" id="validcode" onclick="return validcheck()"/>
        <input type="submit"/>
        <script type="text/javascript">
            <%
              if(request.getAttribute("checknum")!=null){
                out.println("alert('" + request.getAttribute("checknum") + "')");
              }
            %>
        </script>

    </form:form>
</body>
</html>
