<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/28 0028
  Time: 下午 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/dog/register" method="post">
    dog:<input type="text" name="name"><br>

    <input type="submit" value="提交">
</form>
</body>
</html>
