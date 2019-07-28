<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/28 0028
  Time: 下午 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/user3/login" method="post">
    <%--@PostMapping和@GetMapping不需要这个
    <input type="hidden" name="_method" value="put">
    --%>
    modeluser:<input type="text" name="name"><br>
    password:<input type="password" name="password"><br>
    birthday:<input type="date" name="birthday"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
