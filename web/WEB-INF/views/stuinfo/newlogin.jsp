<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link href="<%=request.getContextPath()%>/js/extjs/resources/ext-theme-neptune/ext-theme-neptune-all-debug.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/extjs/ext-all.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/extjs/ext-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js"></script>
    <script type="text/javascript">
        Ext.onReady(function(){
            Ext.create("login",{
             renderTo : Ext.getBody()
                }).center()
        })
    </script>
</head>
<body>

</body>
</html>
